package com.company;

public class Station {
  public int gasAmount;
  public void refill(Car car) {
    this.gasAmount = (this.gasAmount-car.capacity);
    car.gasAmount += car.capacity;
  }
}
