package com.company;

public class Helicopter extends Vehicle {
  int maxFlySpeed = 50;
  String reasonToFly = "someone else wants";
  boolean dropShitWhileFly = false;

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
