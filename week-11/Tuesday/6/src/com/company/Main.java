package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // Write a Stream Expression to find the uppercase characters in a string!
        String string = "Havalina, Havalina, Havalina, Havalina\n" +
            "Walking in the breeze on the plains of Old Segona\n" +
            "(Arizona)\n" +
            "Among the trees\n" +
            "Havalina, Havalina, Havalina, Havalina…";

        string.chars()
            .mapToObj(c -> (char) c)
            .filter(Character ::isUpperCase)
            .forEach(charU -> System.out.println(charU));
    }
}
