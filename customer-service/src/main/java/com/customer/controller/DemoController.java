package com.customer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service/v1")
public class DemoController {

    @Value("${welcome.message}")
    private String message;


    @GetMapping("/welcome")
    public String welcome(){
        return message;
    }

}
