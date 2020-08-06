package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // Write a Stream Expression to find the strings which starts with
        // a given letter(as parameter), in the following list:
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH",
            "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
        String selectedCharacter = "C";
        cities.stream()
            .filter (city -> city.startsWith(selectedCharacter))
            .forEach(selectedCity -> System.out.println(selectedCity));
    }
}
