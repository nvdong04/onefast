package com.onemount.onefast.repository;

import com.onemount.onefast.model.Specifications;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecificationsRepository extends JpaRepository<Specifications, Long> {
    
}
