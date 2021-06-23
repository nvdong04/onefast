package com.onemount.onefast.controller.api;

import com.onemount.onefast.dto.request.BookingRequest;
import com.onemount.onefast.model.BookingDriveTest;
import com.onemount.onefast.service.BookingDriveTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/api/public/booking")
public class BookingTestController {
    @Autowired
    private BookingDriveTestService bookingDriveTestService;

    @PostMapping
    public ResponseEntity<BookingDriveTest> bookingDriveTest(@RequestBody @Valid BookingRequest bookingDTO) {
        return ResponseEntity.ok().body(bookingDriveTestService.createBooking(bookingDTO));
    }

    @Autowired
    public ResponseEntity<List<BookingDriveTest>> findAllBooking() {
        return ResponseEntity.ok().body(bookingDriveTestService.findAll());
    }
}
