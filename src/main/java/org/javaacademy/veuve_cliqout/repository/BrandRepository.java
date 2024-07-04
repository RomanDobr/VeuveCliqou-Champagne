package org.javaacademy.veuve_cliqout.repository;

import org.javaacademy.veuve_cliqout.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
  Optional<Brand> findFirstByName(String name);
}
