package com.onemount.onefast.repository;

import com.onemount.onefast.model.ShowroomAddress;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowroomAddressRepository extends JpaRepository<ShowroomAddress, Long> {
    
}
