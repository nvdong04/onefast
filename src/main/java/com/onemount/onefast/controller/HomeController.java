package com.onemount.onefast.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    public String root() {
        return "Welcome!";
    }
}
