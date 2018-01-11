package com.example.demo.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {

    @RequestMapping("/")
    public String greeting() {
        return "<h1>Hello There<h1>";
    }

}
