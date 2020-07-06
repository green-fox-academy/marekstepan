package com.company;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
  private ArrayList<Sharpie> sharpies;

  public SharpieSet() {
    this.sharpies = new ArrayList<>();
  }

  public void add(Sharpie sharpie) {
    sharpies.add(sharpie);
  }

  public static void main(String[] arcgs) {
    SharpieSet sharpieSet = new SharpieSet();
    sharpieSet.add(new Sharpie("blue", 0.5));
    sharpieSet.add(new Sharpie("black", 0.2));
    sharpieSet.sharpies.get(1).setInkAmount(0);
    sharpieSet.add(new Sharpie("red", 0.3));
    sharpieSet.add(new Sharpie("green", 0.7));

    System.out.println(sharpieSet.sharpies.get(0).getInkAmount());
    System.out.println(sharpieSet.countUsable());
    sharpieSet.removeTrash();
    for (int i = 0; i < sharpieSet.sharpies.size(); i++) {
      System.out.println(sharpieSet.sharpies.get(i).getColor());
    }
  }

  public int countUsable() {
    int counter = 0;
    for (int i = 0; i < sharpies.size(); i++) {
      if (sharpies.get(i).getInkAmount() > 0) {
        counter++;
      }
    }
  return counter;
  }

  public void removeTrash() {
    for (int i = 0; i < sharpies.size(); i++) {
      if (sharpies.get(i).getInkAmount() <= 0) {
        sharpies.remove(i);
      }
    }
  }

}
