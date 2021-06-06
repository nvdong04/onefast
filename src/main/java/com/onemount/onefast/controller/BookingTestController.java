package com.onemount.onefast.controller;

import com.onemount.onefast.dto.BookingDriveTestDTO;
import com.onemount.onefast.model.BookingDriveTest;
import com.onemount.onefast.service.BookingDriveTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api/rest/booking")
public class BookingTestController {
    @Autowired
    private BookingDriveTestService bookingDriveTestService;

    @PostMapping
    public ResponseEntity<BookingDriveTest> bookingDriveTest(@RequestBody @Valid BookingDriveTestDTO bookingDTO) {
        return ResponseEntity.ok().body(bookingDriveTestService.booking(bookingDTO));
    }
}
