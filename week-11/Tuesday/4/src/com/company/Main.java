package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Main {

    public static void main(String[] args) {
        // Write a Stream Expression to get the average value of the odd numbers from the following list:
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        OptionalDouble oddsAverage= numbers.stream()
            .filter(number -> number % 2 != 0)
            .mapToInt((a) -> a)
            .average();
        System.out.println(oddsAverage);
    }
}
