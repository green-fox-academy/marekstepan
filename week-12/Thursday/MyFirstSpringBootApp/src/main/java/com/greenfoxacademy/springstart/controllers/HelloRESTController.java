package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
  @GetMapping("/greeting")
  public Greeting standardGreeting () {
    Greeting greeting = new Greeting(1, "Hello, world!");
    return greeting;
  }
}
