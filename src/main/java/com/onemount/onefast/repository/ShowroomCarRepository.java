package com.onemount.onefast.repository;

import com.onemount.onefast.model.ShowroomCar;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowroomCarRepository extends JpaRepository<ShowroomCar, Long>{
    
}
