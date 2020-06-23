package com.company;
//Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
public class Main {

    public static void main(String[] args) {
        System.out.println(addNumbers(5));
    }

    public static int addNumbers(int n) {
        if (n == 1) {
            return n;
        }
        int sum = n + addNumbers(n-1);
        return sum;
    }
}