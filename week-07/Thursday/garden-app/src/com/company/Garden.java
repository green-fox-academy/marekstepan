package com.company;

import java.util.ArrayList;

public class Garden {
  public ArrayList<String> flowers = new ArrayList<String>();
  public ArrayList<String> trees = new ArrayList<String>();
  public void addFlower(String Flower) {
    flowers.add(Flower);
  }
  public void addTree(String Tree) {
    trees.add(Tree);
  }

  public double waterThem(double waterForAll) {
    System.out.println("Watering with " + waterForAll);
    return waterForAll;
  }
}
