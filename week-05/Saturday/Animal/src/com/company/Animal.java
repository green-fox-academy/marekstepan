package com.company;

public class Animal {
  int hunger = 50;
  int thirst = 50;

  public void eat(int hunger) {
    hunger = hunger-1;
  }

  public void drink(int thirst) {
    thirst = thirst-1;
  }

  public void play(int hunger, int thirst) {
    hunger = hunger+1;
    thirst = thirst+1;
  }
}
