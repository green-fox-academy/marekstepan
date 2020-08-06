package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // Write a Stream Expression to concatenate a Character list to a string!
        List<Character> charList = Arrays.asList('C', 'i', 'c', 'o', ' ',
            'B', 'u', 'f', 'f');
        System.out.println(charList.stream()
            .map(ch -> ch.toString())
            .collect(Collectors.joining()));
    }
}
