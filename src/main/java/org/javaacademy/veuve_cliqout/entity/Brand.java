package org.javaacademy.veuve_cliqout.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@Data
@Table(name = "brand")
@NoArgsConstructor
public class Brand {
  @Id
  private Integer id;

  @Column(unique = true)
  @Size(min = 2)
  private String name;

  @Column(name = "type_name")
  private String typeName;
}
