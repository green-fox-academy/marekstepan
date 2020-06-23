package com.company;

public class Main {

    public static void main(String[] args) {
	Station station = new Station();
	Car car = new Car();
    System.out.println(car.gasAmount);
    System.out.println(car.capacity);
    System.out.println(station.gasAmount);
	station.refill(car);
    System.out.println(car.gasAmount);
    System.out.println(car.capacity);
    System.out.println(station.gasAmount);
    }
}
