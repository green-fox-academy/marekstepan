package com.company;
//We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..)
// have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because
// they each have a raised foot. Recursively return the number of "ears" in the bunny
// line 1, 2, ... n (without loops or multiplication).
public class Main {
    public static void main(String[] args) {
        bunnies2(15);
    }

    public static void bunnies2(int n) {
        if (n < 1) {
            return;
        }
        bunnies2(n - 1);
        if ((n/2)*2==n) {
            System.out.print(3 + " ");
        } else {
            System.out.print(2 + " ");
        }
    }
}