package com.ust.myspringapp.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @GetMapping
    public String sayHello(){
        return "Hello from Spring Boot";
    }

}
