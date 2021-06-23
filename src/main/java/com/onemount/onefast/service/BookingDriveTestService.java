package com.onemount.onefast.service;

import com.onemount.onefast.dto.request.BookingRequest;
import com.onemount.onefast.model.BookingDriveTest;

import java.util.List;


public interface BookingDriveTestService {
   BookingDriveTest createBooking(BookingRequest bTestDTO);
   List<BookingDriveTest> findAll();
   void editBooking(BookingDriveTest bTest);
}
