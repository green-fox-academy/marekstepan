package com.company;

public class Main {

    public static void main(String[] args) {
	    Sharpie sharpie1 = new Sharpie("blue", 0.5);
        System.out.println(sharpie1.color);
        System.out.println(sharpie1.width);
        System.out.println(sharpie1.inkAmount);
        sharpie1.use();
        System.out.println(sharpie1.inkAmount);
        Sharpie sharpie2 = new Sharpie("red", 0.75);
        System.out.println(sharpie2.color);
        System.out.println(sharpie2.width);
        System.out.println(sharpie2.inkAmount);
        sharpie2.use();
        System.out.println(sharpie2.inkAmount);

    }
}
