package com.ust.myspringapp.api;

import com.ust.myspringapp.model.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class GreetController {

    @GetMapping
    public String sayHello(){
        return "Spring Boot is Awesome";
    }

    @GetMapping("/message")
    public Message getMessage(){
        Message msg = new Message("Hello world", LocalTime.now(),"Harsh");
        return msg;
    }

    @GetMapping("/message/{sender}")
    public Message getMessage(@PathVariable String sender){
        Message msg = new Message("Hello world", LocalTime.now(), sender);
        return msg;
    }

    @GetMapping("/message/{message}/sender/{sender}")
    public Message getMessage(@PathVariable String message, @PathVariable String sender){
        Message msg = new Message(message, LocalTime.now(), sender);
        return msg;
    }

    // both message and sender using Path Variable


}
