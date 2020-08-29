package com.example.coloringaround2;

import com.example.coloringaround2.Service.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Coloringaround2Application implements CommandLineRunner {

  private final MyColor myColor;

  @Autowired
  public Coloringaround2Application(@Qualifier("Aquamarine") MyColor myColor) {
    this.myColor = myColor;
  }

  public static void main(String[] args) {
    SpringApplication.run(Coloringaround2Application.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    myColor.printColor();
  }
}
