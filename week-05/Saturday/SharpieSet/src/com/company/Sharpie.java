package com.company;

public class Sharpie {
  private String color;
  private double width;
  private double inkAmount;
  private final static double RATE_OF_DECREASE = 2;

  public Sharpie(String color, double width) {
    this.color = color;
    this.width = width;
    this.inkAmount = 100;
  }

  public double getInkAmount() {
    return inkAmount;
  }

  public void setInkAmount(double inkAmount) {
    this.inkAmount = inkAmount;
  }

  public String getColor() {
    return color;
  }

  void use() {
    inkAmount = inkAmount - Sharpie.RATE_OF_DECREASE;
  }

}
