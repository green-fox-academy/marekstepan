package com.company;

import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // Write a Stream Expression to find the frequency of characters in a given string!
        String fire = "there is this old woman\n" +
            "she lives down the road\n" +
            "you can often find her\n" +
            "kneeling inside of her hole\n" +
            "and i often ask her\n" +
            "\"are you looking for the mother lode?\"\n" +
            "huh?\n" +
            "no.\n" +
            "no my child, this is not my desire\n" +
            "and then she said\n" +
            "\n" +
            "i'm digging for fire";
        char selectedChar = 'i';
        System.out.println(fire.chars()
            .filter(c -> c == selectedChar)
            .count());
    }
}