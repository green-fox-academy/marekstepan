package com.company;

import java.util.ArrayList;

public class Sum {
  static ArrayList<Integer> ingredients;
  public Sum(){
    ingredients = new ArrayList<>();
  }

  public void add(int ingredient) {
    ingredients.add(ingredient);
  }

  public int sum() {
    int sum = 0;
    for (int i = 0; i < ingredients.size(); i++) {
      sum = sum + ingredients.get(i);
    }
    return sum;
  }
}
