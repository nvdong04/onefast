package com.onemount.onefast.controller;

import java.util.List;

import com.onemount.onefast.model.Showroom;
import com.onemount.onefast.service.ShowroomService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/showroom")
public class ShowroomController {

    @Autowired
    private ShowroomService showroomService;

    @GetMapping
    public ResponseEntity<List<Showroom>> findAll() {
        return ResponseEntity.ok().body(showroomService.findAll());
    }

    @GetMapping(value = "/{city}")
    public ResponseEntity<List<Showroom>> findByCity(@PathVariable String city) {
        return ResponseEntity.ok().body(showroomService.findByCity(city));
    }
}
