package com.onemount.onefast.repository;

import com.onemount.onefast.model.CarColor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarColorRepository extends JpaRepository<CarColor, Long>{
    
}
