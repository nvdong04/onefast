package com.onemount.onefast.service;

import com.onemount.onefast.dto.request.OrderRequest;
import com.onemount.onefast.dto.response.OrderDTO;
import com.onemount.onefast.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    Order createOrder(OrderRequest orderRequest);
    void cancelOrder(Long id);
    List<Order> findAll();
    List<Order> findByUserId(Long userId);
    Order findById(Long id);
    void updateOrder(Long id,OrderRequest orderRequest);
}
