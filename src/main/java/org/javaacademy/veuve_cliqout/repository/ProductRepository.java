package org.javaacademy.veuve_cliqout.repository;

import org.javaacademy.veuve_cliqout.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {

  Optional<Product> findFirstByBrandId(Integer brand_id);
}
