package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Write a Stream Expression to get the even numbers from the following list:
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        numbers.stream()
            .filter(number -> number % 2 == 0)
            .forEach(number -> System.out.println(number));
    }
}
