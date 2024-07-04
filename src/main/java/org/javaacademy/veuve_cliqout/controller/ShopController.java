package org.javaacademy.veuve_cliqout.controller;

import lombok.RequiredArgsConstructor;
import org.javaacademy.veuve_cliqout.dto.OrderDto;
import org.javaacademy.veuve_cliqout.servisec.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop")
@RequiredArgsConstructor
public class ShopController {
  private final OrderService orderService;

  @PostMapping
  public ResponseEntity<String> pay(@RequestBody OrderDto dto) {
    String order = orderService.createOrder(dto);
    return ResponseEntity.status(HttpStatus.CREATED).body(order);
  }
}
