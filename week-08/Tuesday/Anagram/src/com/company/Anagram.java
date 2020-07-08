package com.company;

import java.util.Arrays;

public class Anagram {
  String string1;
  String string2;

  public Anagram(String s1, String s2){
    this.string1 = s1;
    this.string2 = s2;
  }

  public boolean isAnagram() {

    char[] ch1 = new char[string1.length()];
    char[] ch2 = new char[string2.length()];

    // Copy character by character into array
    for (int i = 0; i < string1.length(); i++) {
      ch1[i] = string1.charAt(i);
    }

    for (int i = 0; i < string2.length(); i++) {
      ch2[i] = string2.charAt(i);
    }

    int l1 = string1.length();
    int l2 = string2.length();
    if (l1 != l2) {
      return(false);
    }
    Arrays.sort(ch1);
    Arrays.sort(ch2);

    for (int i = 0; i < l1; i++)
      if (ch1[i] != ch2[i])
        return(false);

    return(true);
  }
}
