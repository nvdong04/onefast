package com.onemount.onefast.service;

import com.onemount.onefast.dto.request.OrderRequest;

import com.onemount.onefast.dto.response.OrderDTO;
import com.onemount.onefast.model.Car;
import com.onemount.onefast.model.CarColor;
import com.onemount.onefast.model.Order;
import com.onemount.onefast.model.OrderType;
import com.onemount.onefast.repository.CarColorRepository;
import com.onemount.onefast.repository.CarRepository;
import com.onemount.onefast.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;


@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private CarColorRepository carColorRepository;

    @Autowired
    private SecurityService securityService;

    @Override
    @Transactional
    public Order createOrder(OrderRequest orderRequest) {
        Order order = new Order();
        Car car = carRepository.findById(orderRequest.getCarId()).get();
        order.setUserId(securityService.getCurrentUserId());
        order.setCar(car);
        order.setCarColor(orderRequest.getCarColor());
        Date now = Calendar.getInstance().getTime();
        order.setDiscount(orderRequest.getDiscount());
        order.setPaymentMethod(orderRequest.getPaymentMethod());
        order.setCreatedAt(now);
        order.setModifiedAt(now);
        order.setTotalPrice();
        order.setDeposit();
        order.setStatus(checkStatus(orderRequest.getStatus()));
        return orderRepository.saveAndFlush(order);
    }

    @Override
    @Transactional
    public void cancelOrder(Long id) {
        Order order = orderRepository.findById(id).get();
        if (order != null) {
            order.setStatus(OrderType.CANCEL);
            orderRepository.saveAndFlush(order);
        } else {
            throw new ResourceNotFoundException("Cannot find order with order id.");
        }
    }


    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public List<Order> findByUserId(Long userId) {
        List<Order> orders = orderRepository.findAllByUserId(userId);
        if (orders.isEmpty()) {
            throw new ResourceNotFoundException("Order - No data found created by user.");
        }
        return orders;
    }

    @Override
    public Order findById(Long id) {
        return orderRepository.findById(id).orElseThrow(
                ()  -> new ResourceNotFoundException("Cannot find order with order id.")
        );
    }

    @Override
    @Transactional
    public void updateOrder(Long id,OrderRequest orderRequest) {
        Order order = orderRepository.findById(id).get();
        if (order != null) {
            Car car = carRepository.findById(orderRequest.getCarId()).get();
            order.setCar(car);
            order.setCarColor(orderRequest.getCarColor());
            Date now = Calendar.getInstance().getTime();
            order.setDiscount(orderRequest.getDiscount());
            order.setPaymentMethod(orderRequest.getPaymentMethod());
            order.setModifiedAt(now);
            order.setTotalPrice();
            order.setDeposit();
            order.setStatus(checkStatus(orderRequest.getStatus()));
            orderRepository.saveAndFlush(order);
        } else {
            throw new ResourceNotFoundException("Cannot find order with order id.");
        }
    }

    public OrderType checkStatus(String status) {
        if (OrderType.DONE.name().equals(status)) {
            return OrderType.DONE;
        }

        if (OrderType.CANCEL.name().equals(status)) {
            return OrderType.CANCEL;
        }
        if (OrderType.WAITING.name().equals(status)) {
            return OrderType.WAITING;
        }
        return OrderType.WAITING;
    }
}
