package org.javaacademy.veuve_cliqout.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@Data
@Table(name = "product")
@NoArgsConstructor
public class Product {
  @Id
  private Integer id;

  @Column
  private Integer brandId;

  @Column
  private Integer countProduct;

  @Column
  private BigDecimal price = BigDecimal.ONE;
}
