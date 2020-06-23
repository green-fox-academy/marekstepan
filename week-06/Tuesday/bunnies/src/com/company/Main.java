package com.company;
//We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total
// number of ears across all the bunnies recursively (without loops or multiplication).
public class Main {

    public static void main(String[] args) {

        System.out.println(bunnies(17));
    }

    public static int bunnies(int count) {
        if (count == 1) {
            return 2;
        }
        int sum = bunnies(count-1) + 2;
        return sum;
    }
}
