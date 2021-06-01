package com.onemount.onefast.service;

import org.springframework.stereotype.Service;

import java.util.List;

import com.onemount.onefast.model.*;
@Service
public interface ShowroomService {
    List<Showroom> findAll();
    List<Showroom> findByCity(String city);
}
