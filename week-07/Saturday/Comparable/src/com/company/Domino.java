package com.company;

import java.util.Arrays;

public class Domino {
  public final int left;
  private final int right;

  public Domino(int left, int right) {
    this.left = left;
    this.right = right;
  }

  public int getLeftSide() {
    return left;
  }

  public int getRightSide() {
    return right;
  }

  public int compareTo(Domino d) {
    return getLeftSide().compareTo
  }

  @Override
  public String toString() {
    return "[" + left + ", " + right + "]";
  }
}
