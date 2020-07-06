package com.company.animals;

public class Reptile extends Animal{

  public Reptile(String name) {
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
