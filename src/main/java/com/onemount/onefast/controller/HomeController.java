package com.onemount.onefast.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class HomeController {
    public String root() {
        return "Welcome!";
    }
}
