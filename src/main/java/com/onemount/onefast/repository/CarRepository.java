package com.onemount.onefast.repository;

import com.onemount.onefast.model.Car;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    Car findCarByCarColors(Long colorId);
    List<Car> findCarsByNameLike(String name);
}
