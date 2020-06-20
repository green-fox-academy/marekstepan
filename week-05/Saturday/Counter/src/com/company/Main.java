package com.company;

public class Main {

    public static void main(String[] args) {

	    Counter c = new Counter();
        c.field = 5;
        c.defaultValue = c.field;
        System.out.println(c.field);
	    c.add(10);
        System.out.println(c.field);
        c.add();
        System.out.println(c.field);
        System.out.println(c.get());
        c.reset();
        System.out.println(c.field);
    }
}
