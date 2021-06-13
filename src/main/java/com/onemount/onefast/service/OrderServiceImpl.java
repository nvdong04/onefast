package com.onemount.onefast.service;

import com.onemount.onefast.dto.OrderDTO;
import com.onemount.onefast.model.Car;
import com.onemount.onefast.model.Order;

import com.onemount.onefast.repository.CarRepository;
import com.onemount.onefast.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private SecurityService securityService;

    @Override
    @Transactional
    public Order createOrder(OrderDTO orderDTO) {
        Order order = new Order();
        Car car = carRepository.findById(orderDTO.getCarId()).get();
        order.setUserId(securityService.getCurrentUserId());
        order.setCar(car);
        Date now = Calendar.getInstance().getTime();
        order.setDiscount(orderDTO.getDiscount());
        order.setPaymentMethod(orderDTO.getPaymentMethod());
        order.setCreatedAt(now);
        order.setModifiedAt(now);
        order.setTotalPrice();
        order.setDeposit(car.getPrice());
        order.setStatus(1);
        return orderRepository.saveAndFlush(order);
    }

    @Override
    public void cancelOrder(Long id) {

    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public List<Order> findByUserId(Long userId) {
        return orderRepository.findAllByUserId(userId);
    }

    @Override
    public Order findById(Long id) {
        return orderRepository.findById(id).orElseThrow();
    }

    @Override
    public void updateOrder(Order order) {

    }
}
