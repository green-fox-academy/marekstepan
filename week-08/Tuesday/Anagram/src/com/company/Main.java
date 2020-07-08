package com.company;

public class Main {

    public static void main(String[] args) {
      Anagram anagram = new Anagram("funeral", "realfun");
      if (anagram.isAnagram() == true) {
        System.out.println("YEAH");
      } else {
        System.out.println("NAH");
      }
    }
}
