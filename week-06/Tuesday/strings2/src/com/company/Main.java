package com.company;

public class Main {

    public static void main(String[] args) {
	// Given a string, compute recursively a new string where all the 'x' chars have been removed.
        System.out.println(removeX("hjkfslpurexxjhkxjumximjpiomjxxx"));
    }

    public static String removeX(String s) {
        if (s.length() < 1) {
            return s;
        } else {
            if (s.charAt(0) == 'x') {
                return "" + removeX(s.substring(1));
            } else {
                return s.charAt(0) + removeX(s.substring(1));
            }
        }
    }
}


