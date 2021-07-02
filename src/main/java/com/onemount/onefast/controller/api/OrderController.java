package com.onemount.onefast.controller.api;

import com.onemount.onefast.dto.request.OrderRequest;
import com.onemount.onefast.dto.response.OrderDTO;
import com.onemount.onefast.model.Order;
import com.onemount.onefast.service.OrderService;
import com.onemount.onefast.service.SecurityService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "api/public/order")
public class OrderController {
    @Autowired
    private OrderService orderService;


    @Autowired
    private SecurityService securityService;

    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody @Valid OrderRequest orderRequest) {
        return ResponseEntity.ok().body(orderService.createOrder(orderRequest));
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<String> cancelOrder(@PathVariable Long id) {
        orderService.cancelOrder(id);
        return ResponseEntity.ok().body("Cancel success!");
    }

    @PutMapping(value = "/update/{id}")
    public ResponseEntity<String> updateOrder(@PathVariable Long id,@RequestBody @Valid OrderRequest orderRequest) {
        orderService.updateOrder(id, orderRequest);
        return ResponseEntity.ok().body("Update success!");
    }

    @GetMapping(value = "/current")
    public ResponseEntity<List<Order>> findByCurrentUser() {
//        List<OrderDTO> orderDTOS = orderService.findByUserId(securityService.getCurrentUserId())
//                .stream()
//                .map(order -> {
//                   OrderDTO orderDTO = new OrderDTO();
//                   orderDTO.setId(order.getId());
//                   orderDTO.setUserId(order.getUserId());
//                   //orderDTO.setCar(order.getCar());
//                   orderDTO.setCarColor(
//                           order.getCar()
//                           .getCarColors()
//                           .stream()
//                           .filter(c -> c.getId().equals(order.getCarColorId())).findFirst().get());
//                   order.getCar().setCarColors(null);
//                   orderDTO.setCar(order.getCar());
//                   orderDTO.setCreatedAt(order.getCreatedAt());
//                   orderDTO.setModifiedAt(order.getModifiedAt());
//                   orderDTO.setPaymentMethod(order.getPaymentMethod());
//                   orderDTO.setTotalPrice(order.getTotalPrice());
//                   orderDTO.setDeposit(order.getDeposit());
//                   orderDTO.setDiscount(order.getDiscount());
//                   orderDTO.setStatus(orderDTO.getStatus());
//                    return orderDTO;
//                }).collect(Collectors.toList());
        List<Order> orders =  orderService.findByUserId(securityService.getCurrentUserId());
        return ResponseEntity.ok().body(orders);
    }
}
