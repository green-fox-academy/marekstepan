package com.company;

public class Car {
  public enum CarBrand {ASTONMARTIN, DACIA, ZASTAVA, TATRA, TRABANT, WARTBURG, SIMCA}
  public enum Colors {ALABASTER, APRICOT, AQUAMARINE, BRONZE, CAFENOIR, MINT, PISTACHIO, SAFFRON, ZAFFIRE}
  private String color;
  private String brand;
  public Car(String color, String brand) {
    this.color = color;
    this.brand = brand;
  }
}
