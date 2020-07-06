package com.company;

public class Main {

    public static void main(String[] args) {
	    Bird bird = new Bird();
	    Helicopter helicopter = new Helicopter();
        System.out.println("Bird " + bird.takeOff());
        System.out.println("Bird " + bird.fly());
        System.out.println("Max fly speed: " + bird.maxFlySpeed);
        System.out.println("Reason to fly: " + bird.reasonToFly);
        System.out.println("Drops something while flying: " + bird.dropShitWhileFly);
        System.out.println();
        System.out.println("Helicopter " + helicopter.takeOff());
        System.out.println("Helicopter " + helicopter.fly());
        System.out.println("Max fly speed: " + helicopter.maxFlySpeed);
        System.out.println("Reason to fly: " + helicopter.reasonToFly);
        System.out.println("Drops something while flying: " + helicopter.dropShitWhileFly);
    }
}
