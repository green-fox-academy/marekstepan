package com.example.coloringaround.Service;

import org.springframework.stereotype.Service;

@Service
public class TealColor implements MyColor{
  @Override
  public void printColor() {
    System.out.println("It is teal in color.");
  }
}
