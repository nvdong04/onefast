package com.onemount.onefast.service;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

import com.onemount.onefast.dto.request.BookingRequest;
import com.onemount.onefast.model.BookingDriveTest;

import com.onemount.onefast.model.BookingType;
import com.onemount.onefast.repository.BookingDriveTestRepository;
import com.onemount.onefast.repository.CarRepository;
import com.onemount.onefast.repository.ShowroomRepository;
import lombok.Builder;
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
    public BookingDriveTest createBooking(BookingRequest bookingRequest) {
        LocalDate date = LocalDate.parse(bookingRequest.getDriveDate());
        if(LocalDate.now().isAfter(date)) {
            //throw new Exception("");
        }
        boolean isCheck = false;
//        List<BookingDriveTest> testList = bookingDriveTestRepository.findAllByEmailOrPhone(bookingRequest.getEmail(), bookingRequest.getPhone());
//        if (!testList.isEmpty()) {
//            for (BookingDriveTest b: testList) {
//                if (LocalDate.parse(b.getDriveDate()).isAfter(date.plusDays(1))) {
//                    isCheck = true;
//                }
//            }
//        }

        if (isCheck) {
            //throw
        } {
            BookingDriveTest bookingDriveTest = new BookingDriveTest();
            bookingDriveTest.setFullname(bookingRequest.getFullname());
            bookingDriveTest.setEmail(bookingRequest.getEmail());
            bookingDriveTest.setPhone(bookingRequest.getPhone());
            bookingDriveTest.setDriveDate(bookingRequest.getDriveDate());
            bookingDriveTest.setStatus(BookingType.WAITING);
            bookingDriveTest.setShowroom(showroomRepository.findById(bookingRequest.getShowroomId()).get());
            bookingDriveTest.setCar(carRepository.findById(bookingRequest.getCarId()).get());
            return bookingDriveTestRepository.saveAndFlush(bookingDriveTest);
        }
    }

    @Override
    public List<BookingDriveTest> findAll() {
        return bookingDriveTestRepository.findAll();
    }

    @Override
    public BookingDriveTest updateBooking(Long id,BookingRequest bookingRequest) {
        Optional<BookingDriveTest> optional = bookingDriveTestRepository.findById(id);
        if (optional.isPresent()) {
        } else {
            BookingDriveTest bookingDriveTest = optional.get();
            bookingDriveTest.setFullname(bookingRequest.getFullname());
            bookingDriveTest.setEmail(bookingRequest.getEmail());
            bookingDriveTest.setPhone(bookingRequest.getPhone());
            bookingDriveTest.setDriveDate(bookingRequest.getDriveDate());
            bookingDriveTest.setStatus(BookingType.WAITING);
            bookingDriveTest.setShowroom(showroomRepository.findById(bookingRequest.getShowroomId()).get());
            bookingDriveTest.setCar(carRepository.findById(bookingRequest.getCarId()).get());
            return bookingDriveTestRepository.saveAndFlush(bookingDriveTest);
        }
        return null;
    }

    @Override
    public void cancelBooking(Long id) {
        Optional<BookingDriveTest> optional = bookingDriveTestRepository.findById(id);
        if (optional.isPresent()) {
            BookingDriveTest bookingDriveTest = optional.get();
            bookingDriveTest.setStatus(BookingType.CANCEL);
            bookingDriveTestRepository.saveAndFlush(bookingDriveTest);
        } else {
            //throw
        }
    }

}
