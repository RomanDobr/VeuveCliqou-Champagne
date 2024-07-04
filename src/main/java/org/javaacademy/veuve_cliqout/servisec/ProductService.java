package org.javaacademy.veuve_cliqout.servisec;

import lombok.RequiredArgsConstructor;
import org.javaacademy.veuve_cliqout.entity.Product;
import org.javaacademy.veuve_cliqout.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
  private final ProductRepository productRepository;

  public Product getProductByBrand_id(Integer brand_id) {
    return productRepository.findFirstByBrandId(brand_id).orElseThrow();
  }

  public String buyProduct(Product product, Integer count) {
    product.setCountProduct(product.getCountProduct() - count);
    return "Спасибо за покупку";
  }
}
