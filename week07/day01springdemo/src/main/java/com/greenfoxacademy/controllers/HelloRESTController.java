package com.greenfoxacademy.controllers;

import com.greenfoxacademy.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
    AtomicLong id = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam("name") String name) {

        return new Greeting(id.getAndIncrement(), "Hello, " + name);
    }


}
