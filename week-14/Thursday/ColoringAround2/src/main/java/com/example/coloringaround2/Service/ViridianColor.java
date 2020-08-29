package com.example.coloringaround2.Service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Viridian")
public class ViridianColor implements MyColor{
  @Override
  public void printColor() {
    System.out.println("It is viridian in color.");
  }
}
