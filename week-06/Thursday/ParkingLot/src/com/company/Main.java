package com.company;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        EnumSet<Car.Colors> colorList = EnumSet.allOf(Car.Colors.class);
        EnumSet<Car.CarBrand> brandList = EnumSet.allOf(Car.CarBrand.class);
        ArrayList<Car> rndCars = new ArrayList<>();
        for (int i = 0; i < 256; i++) {
            String a = colorList.get(new Random().nextInt(9));
            String b = new Random().nextInt(8);
            rndCars.add(new Car(a, b));
            System.out.println(rndCars(i));
            //public static String[] names() {
            //    State[] states = values();
            //    String[] names = new String[states.length];
            //
            //    for (int i = 0; i < states.length; i++) {
            //        names[i] = states[i].name();
            //    }
            //
            //    return names;
        }
    }
}
//Create a Car class with 2 enum properties
//enum of car types
//The types of these cars or vehicles is up to you
//enum of colors
//Create 256 Vehicles randomly and put them into a List
//Count and Print the number of same vehicles for each type
//Count and Print the number of same vehicles for each color
//Print the most frequently occurring vehicle