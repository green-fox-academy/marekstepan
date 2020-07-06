package com.company.animals;

public class Bird extends Animal{

  public Bird(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String breed() {
    return("egg");
  }
}
