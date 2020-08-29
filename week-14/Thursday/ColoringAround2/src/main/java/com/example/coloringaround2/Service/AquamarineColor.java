package com.example.coloringaround2.Service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Aquamarine")
public class AquamarineColor implements MyColor{
  @Override
  public void printColor() {
    System.out.println("It is aquamarine in color.");
  }
}
