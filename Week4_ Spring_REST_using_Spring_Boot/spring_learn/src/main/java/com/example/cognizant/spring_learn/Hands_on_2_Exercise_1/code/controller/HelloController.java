package com.example.cognizant.spring_learn.Hands_on_2_Exercise_1.code.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "✅ Spring Boot is Working, Abhiram!";
    }
}
