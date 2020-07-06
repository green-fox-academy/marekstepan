package com.company;

public class Bird extends Vehicle {
  int maxFlySpeed = 20;
  String reasonToFly = "it needs to";
  boolean dropShitWhileFly = true;

  @Override
  public String land() {
    return ("is landing");
  }
  @Override
  public String fly() {
    return ("is flying");
  }
  @Override
  public String takeOff() {
    return ("takes off");
  }
}
