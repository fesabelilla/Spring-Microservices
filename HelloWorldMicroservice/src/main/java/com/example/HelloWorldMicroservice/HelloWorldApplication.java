package com.example.HelloWorldMicroservice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "hello")
public class HelloWorldApplication {

    @RequestMapping(value = "/{firstName}/{lastName}", method = RequestMethod.GET)
    public String hello(@PathVariable("firstName") String fristName, @PathVariable("lastName") String lastName) {
        return String.format("{\"message\":\"Hello %s %s\"}", fristName, lastName);
    }
}

