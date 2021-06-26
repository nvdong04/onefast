package com.onemount.onefast.repository;

import com.onemount.onefast.model.BookingDriveTest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingDriveTestRepository extends JpaRepository<BookingDriveTest, Long> {
    List<BookingDriveTest> findAllByEmailOrPhone(String email,String phone);
    //boolean existsByEmailOrPhoneAndDriveDateEquals(String emailOrPhone, )
}
