package com.example.coloringaround;

import com.example.coloringaround.Service.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColoringaroundApplication implements CommandLineRunner {

  private final MyColor myColor;

  @Autowired
  public ColoringaroundApplication (MyColor myColor) {
    this.myColor=myColor;
  }

  public static void main(String[] args) {
    SpringApplication.run(ColoringaroundApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    myColor.printColor();
  }
}
