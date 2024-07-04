package org.javaacademy.veuve_cliqout.servisec;

import lombok.RequiredArgsConstructor;
import org.javaacademy.veuve_cliqout.dto.OrderDto;
import org.javaacademy.veuve_cliqout.entity.Brand;
import org.javaacademy.veuve_cliqout.entity.Product;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class OrderService {
  private final ProductService productService;
  private final BrandService brandService;

  public String createOrder(OrderDto orderDto) {
    boolean present = brandService.getAll()
                .stream()
                .filter(brand -> brand.getName().equals(orderDto.getName()))
                .findFirst()
                .isPresent();

    if (!present) {
      return "Товара нет на складе";
    }

    Brand brand = brandService.getBrandByName(orderDto.getName());
    Product product = productService.getProductByBrand_id(brand.getId());

    if (product.getCountProduct() < orderDto.getCount()) {
      return "Товара в таком количестве нет на складе";
    }

    return productService.buyProduct(product, orderDto.getCount());
  }
}
