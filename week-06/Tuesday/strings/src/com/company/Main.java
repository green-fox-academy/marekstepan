package com.company;
//Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars
// have been changed to 'y' chars.
public class Main {
    public static void main(String[] args) {
        System.out.println(xToY("hjkfslpurexxjhkxjumximjpiomjxxx"));
    }

    public static String xToY(String s) {
        if (s.length() < 1) {
            return s;
        }
        else {
            if (s.charAt(0) == 'x') {
                return 'y' + xToY(s.substring(1));
            } else {
                return s.charAt(0) + xToY(s.substring(1));
            }
        }
    }
}



