package com.example.coloringaround.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class AquamarineColor implements MyColor{

  @Override
  public void printColor() {
    System.out.println("It is aquamarine in color.");
  }
}
