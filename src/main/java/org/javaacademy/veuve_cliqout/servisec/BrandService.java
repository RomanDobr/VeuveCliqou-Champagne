package org.javaacademy.veuve_cliqout.servisec;

import lombok.RequiredArgsConstructor;
import org.javaacademy.veuve_cliqout.entity.Brand;
import org.javaacademy.veuve_cliqout.repository.BrandRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BrandService {
  private final BrandRepository brandRepository;

  public Brand getBrandByName(String name) {
    return brandRepository.findFirstByName(name).orElseThrow();
  }

  public List<Brand> getAll() {
    return brandRepository.findAll();
  }
}
