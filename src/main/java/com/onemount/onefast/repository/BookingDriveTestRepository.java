package com.onemount.onefast.repository;

import com.onemount.onefast.model.BookingDriveTest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BookingDriveTestRepository extends JpaRepository<BookingDriveTest, Long> {
    
}
