package com.onemount.onefast.service;

import java.util.List;

import com.onemount.onefast.model.*;

public interface ShowroomService {
    List<Showroom> findAll();
    List<Showroom> findByCity(String city);
}
