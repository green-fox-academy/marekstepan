package com.company.animals;

public class Mammal extends Animal{

  public Mammal(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String breed() {
    return("newborns");
  }
}
