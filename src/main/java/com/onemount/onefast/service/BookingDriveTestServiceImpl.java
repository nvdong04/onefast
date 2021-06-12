package com.onemount.onefast.service;

import java.time.LocalDate;

import com.onemount.onefast.dto.BookingDriveTestDTO;
import com.onemount.onefast.model.BookingDriveTest;

import com.onemount.onefast.model.Showroom;
import com.onemount.onefast.repository.BookingDriveTestRepository;
import com.onemount.onefast.repository.CarRepository;
import com.onemount.onefast.repository.ShowroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BookingDriveTestServiceImpl implements BookingDriveTestService {

    @Autowired
    private ShowroomRepository showroomRepository;

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private BookingDriveTestRepository bookingDriveTestRepository;

    @Override
    public BookingDriveTest booking(BookingDriveTestDTO bTestDTO) {
        LocalDate date = LocalDate.parse(bTestDTO.getDriveDate());
        if(LocalDate.now().isAfter(date)) {
            //throw 
        }
        
        BookingDriveTest bookingDriveTest = new BookingDriveTest();
        bookingDriveTest.setFullname(bTestDTO.getFullname());
        bookingDriveTest.setEmail(bTestDTO.getEmail());
        bookingDriveTest.setPhone(bTestDTO.getPhone());
        bookingDriveTest.setDriveDate(bTestDTO.getDriveDate());
        bookingDriveTest.setStatus(1);
        bookingDriveTest.setShowroom(showroomRepository.findById(bTestDTO.getShowroomId()).get());
        bookingDriveTest.setCar(carRepository.findById(bTestDTO.getCarId()).get());
        return bookingDriveTestRepository.saveAndFlush(bookingDriveTest);
    }

    @Override
    public void editBooking(BookingDriveTest bTest) {
        // TODO Auto-generated method stub

    }

}
