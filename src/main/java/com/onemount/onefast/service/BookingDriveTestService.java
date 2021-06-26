package com.onemount.onefast.service;

import com.onemount.onefast.dto.request.BookingRequest;
import com.onemount.onefast.model.BookingDriveTest;

import java.util.List;


public interface BookingDriveTestService {
   BookingDriveTest createBooking(BookingRequest bookingRequest);
   List<BookingDriveTest> findAll();
   BookingDriveTest updateBooking(Long id,BookingRequest bookingRequest);
   void cancelBooking(Long id);
}
