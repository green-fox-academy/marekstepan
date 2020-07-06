package com.company;

abstract class Animal {
  String name;
  int age;
  String gender;

  public String getName() {
    return name;
  }
  public abstract String breed();
}
