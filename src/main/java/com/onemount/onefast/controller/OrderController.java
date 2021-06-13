package com.onemount.onefast.controller;

import com.onemount.onefast.dto.OrderDTO;
import com.onemount.onefast.model.Order;
import com.onemount.onefast.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "api/rest/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody @Valid OrderDTO orderDTO) {
        return ResponseEntity.ok().body(orderService.createOrder(orderDTO));
    }
}
