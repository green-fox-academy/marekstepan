package com.company;

public class Main {

    public static void main(String[] args) {
	// Given a string, compute recursively a new string where all the adjacent chars are now separated by a *
        System.out.println(addAsterix("hjkfslpurexxjhkxjumximjpiomjxxx"));
    }

    public static String addAsterix(String s) {
        if (s.length() < 1) {
            return s;
        }
        else {
            return s.charAt(0) + "*" + addAsterix(s.substring(1));
        }
    }
}
