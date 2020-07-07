package com.company;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppleTest {

  @BeforeAll
  //has to be static. eg. for establishing connection to database
  public static void beforeClass(){
    System.out.println("Tests are running. Executed only once before all tests.");
  }

  //before executing each text
  @BeforeEach
  public void init(){
    Apple apple = new Apple();
    apple.getApple();
  }

  @AfterEach
    public void afterEachTest(){
      System.out.println("The test was done");
  }

  @AfterAll
  public static void afterTest(){
    System.out.println("Tests are done.");
  }

  @Test
  public void getAppleTest() {
    String expected = "Apple";
    String actual = Apple.getApple();
    assertEquals(expected, actual);
  }
}