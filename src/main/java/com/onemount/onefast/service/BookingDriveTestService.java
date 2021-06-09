package com.onemount.onefast.service;

import com.onemount.onefast.dto.BookingDriveTestDTO;
import com.onemount.onefast.model.BookingDriveTest;


public interface BookingDriveTestService {
   BookingDriveTest booking(BookingDriveTestDTO bTestDTO);
   void editBooking(BookingDriveTest bTest);
}
