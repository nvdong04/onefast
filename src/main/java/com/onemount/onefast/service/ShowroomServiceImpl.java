package com.onemount.onefast.service;

import java.util.List;

import com.onemount.onefast.model.Showroom;
import com.onemount.onefast.repository.ShowroomRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowroomServiceImpl implements ShowroomService{

    @Autowired
    private ShowroomRepository showroomRepository;

    @Override
    public List<Showroom> findAll() {
        return showroomRepository.findAll();
    }

    @Override
    public List<Showroom> findByCity(String city) {
        return showroomRepository.findByCity(city);
    }
    
}
