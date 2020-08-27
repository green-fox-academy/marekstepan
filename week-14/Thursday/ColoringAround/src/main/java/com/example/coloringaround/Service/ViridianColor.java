package com.example.coloringaround.Service;

import org.springframework.stereotype.Service;

//@Service
public class ViridianColor implements MyColor{
  @Override
  public void printColor() {
    System.out.println("It is viridian in color.");
  }
}
