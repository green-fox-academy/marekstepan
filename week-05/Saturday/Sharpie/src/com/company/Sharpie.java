package com.company;

public class Sharpie {
  String color;
  double width;
  double inkAmount = 100;
  final static double rateOfDecrease = 0.2;

  Sharpie(String color, double width) {
    this.color = color;
    this.width = width;
  }

  void use() {
    inkAmount = inkAmount - rateOfDecrease;
  }

}
/*
We should know about each sharpie their color (which should be a string),
width (which will be a floating point number), inkAmount (another floating point number)
When creating one, we need to specify the color and the width
Every sharpie is created with a default 100 as inkAmount
We can use() the sharpie objects
which decreases inkAmount
 */