package com.company;
//Given a non-negative integer n, return the sum of its digits recursively (without loops).
//Hint
//Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
//Java, C++, C#, Python
//Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).
public class Main {

    public static void main(String[] args) {

        System.out.print(sumdigit(7392));
    }

    public static int sumdigit(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n%10 + sumdigit(n/10);
        }
    }
}

