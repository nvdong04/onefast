package com.onemount.onefast.service;

import java.util.List;

import com.onemount.onefast.model.Car;
import com.onemount.onefast.model.Specifications;
import com.onemount.onefast.repository.CarRepository;
import com.onemount.onefast.repository.SpecificationsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private SpecificationsRepository speRepository;
    
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public void generateSampleData() {
        
    }
}
