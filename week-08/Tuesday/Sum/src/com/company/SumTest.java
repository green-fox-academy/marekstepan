package com.company;

import static org.junit.jupiter.api.Assertions.*;


import java.util.ArrayList;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumTest {

  //before executing each text
  /*@BeforeEach
  public void init(){
    ArrayList<Integer> list = new ArrayList<Integer>();
    int sum = Sum.sum();
  }
  */


  @AfterEach
  public void afterEachTest(){
    System.out.println("The test was done");
  }

  @Test
  public void emptyListTest() {
    Sum empty = new Sum();
    int expected = 0;
    int actual = empty.sum();
    assertEquals(expected, actual);
  }

  @Test
  public void oneValueListTest() {
    Sum lonely = new Sum();
    Sum.ingredients.add(0, 21);
    int expected = 21;
    int actual = lonely.sum();
    assertEquals(expected, actual);
  }

  @Test
  public void manyValuesListTest() {
    Sum full = new Sum();
    Sum.ingredients.add(0, 21);
    Sum.ingredients.add(1, 22);
    Sum.ingredients.add(2, 23);
    Sum.ingredients.add(3, 24);
    int expected = 90;
    int actual = full.sum();
    assertEquals(expected, actual);
  }

  @Test
  public void nullValuesListTest() {
    Sum nulll = new Sum();
    Sum.ingredients = null;
    assertNull(Sum.ingredients);
  }
}