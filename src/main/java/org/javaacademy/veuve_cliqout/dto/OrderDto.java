package org.javaacademy.veuve_cliqout.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderDto {
  private String name;
  private Integer count;
}
