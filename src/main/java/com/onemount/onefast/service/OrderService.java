package com.onemount.onefast.service;

import com.onemount.onefast.dto.OrderDTO;
import com.onemount.onefast.model.Order;

import java.util.List;

public interface OrderService {
    Order createOrder(OrderDTO orderDTO);
    void cancelOrder(Long id);
    List<Order> findAll();
    List<Order> findByUserId(Long userId);
    Order findById(Long id);
    void updateOrder(Order order);
}
