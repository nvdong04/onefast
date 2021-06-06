package com.onemount.onefast.service;

import java.util.List;

import com.onemount.onefast.model.Car;

import org.springframework.stereotype.Service;
@Service
public interface CarService {
    List<Car> findAll();
}
