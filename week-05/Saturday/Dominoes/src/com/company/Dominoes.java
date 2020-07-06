package com.company;

import java.util.ArrayList;
import java.util.List;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...

    System.out.println(dominoes);

    // ordering dominoes

    //create new list
    List<Domino> dominoesOrdered = new ArrayList<>();
    //pick randomly first domino
    int r = (int) (Math.random() * 5);
    dominoesOrdered.add(dominoes.get(r)) ;
    int glue = dominoes.get(r).getRightSide();

    while (dominoesOrdered.size() < 6) {
      for (int i = 0; i < 6; i++) {
        if ((dominoes.get(i).getLeftSide() == glue) && (dominoesOrdered.size() < 6)){
          dominoesOrdered.add(dominoes.get(i));
          glue = dominoes.get(i).getRightSide();
        }
      }
    }
    System.out.println(dominoesOrdered);
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }

}