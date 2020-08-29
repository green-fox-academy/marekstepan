package com.example.coloringaround2.Service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Teal")
public class TealColor implements MyColor{
  @Override
  public void printColor() {
    System.out.println("It is teal in color.");
  }
}
