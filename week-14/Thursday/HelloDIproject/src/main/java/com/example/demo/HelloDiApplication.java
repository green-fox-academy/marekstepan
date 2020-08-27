package com.example.demo;

import com.example.demo.Service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloDiApplication implements CommandLineRunner {

  private final Printer printer;

  @Autowired
  public HelloDiApplication(Printer printer){
    this.printer = printer;
  }

  public static void main(String[] args) {
    SpringApplication.run(HelloDiApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("tramtadadaaa");
  }
}
