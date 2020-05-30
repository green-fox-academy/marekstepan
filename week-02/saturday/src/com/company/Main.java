package com.company;

import com.sun.deploy.security.SelectableSecurityManager;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        /*
        System.out.println("Hello, World!");
        System.out.println(" ");
        System.out.println("Hello Marek, tschus bus!");
        System.out.println(" ");
        System.out.println(
                "Humpty Dumpty sat on a wall," + "\n" +
                "Humpty Dumpty had a great fall." + "\n" +
                "All the king's horses and all the king's men" + "\n" +
                "Couldn't put Humpty together again." + "\n");
        //must look at script standards convention

        System.out.println(
                "Hello, Jiřina! " + "\n" +
                "Hello, Jakub! " + "\n" +
                "Hello, Martin! " + "\n");

        String[] arr={"Amy", "Jakub", "Jiřina", "Jitka", "Lukáš", "Martin", "Michael", "Andrea", "Tomáš" };
        Random r=new Random();
        int randomNumber1=r.nextInt(arr.length);
        int randomNumber2=r.nextInt(arr.length);
        int randomNumber3=r.nextInt(arr.length);
        while (randomNumber2 == randomNumber1) {
            randomNumber2=r.nextInt(arr.length);
        }
        while ((randomNumber3 == randomNumber1) || (randomNumber3 == randomNumber2)) {
            randomNumber3=r.nextInt(arr.length);
        }
        System.out.println("Hello, " + (arr[randomNumber1]) + "!");
        System.out.println("Hello, " + (arr[randomNumber2]) + "!");
        System.out.println("Hello, " + (arr[randomNumber3]) + "!");
        System.out.println(" ");

        //i believe that there is better way to do this


        String name = "Marek";
        int age = 44;
        float height = 1.73f;
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
        System.out.println(" ");

        int a = 22;
        int b = 13;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println((float)a / b);
        //"." does not work for me... mrkni later
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(" ");

        int hrs = 6;
        int days = 5;
        int weeks = 17;
        System.out.println("hours total = " + (hrs * days * weeks));
        System.out.println("That is " + (days * hrs) / 0.52 + "% of work time.");
        // what about rounding? look at that later
        System.out.println(" ");

        int myFavouriteNumber = 144;
        System.out.println(myFavouriteNumber);
        System.out.println(" ");

        int aa = 123;
        int bb = 526;
        System.out.println(aa);
        System.out.println(bb);
        //now swap
        int cc;
        cc = aa;
        aa = bb;
        bb = cc;
        System.out.println(aa);
        System.out.println(bb);

        double massInKg = 81.2;
        double heightInM = 1.78;
        System.out.println("BMI " + (massInKg /(heightInM*heightInM)));
        System.out.println(" ");

        // Define several things as a variable then print their values
        String name = "Marek";
        int age = 44;
        float height = (1.73f);
        boolean married = true;
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("married = " + married);
        System.out.println(" ");

        int a = 3;
        // make the "a" variable's value bigger by 10
        a = a + 10;
        System.out.println(a);

        int b = 100;
        // make b smaller by 7
        b = b - 7;
        System.out.println(b);

        int c = 44;
        // please double c's value
        c = c * 2;
        System.out.println(c);

        int d = 125;
        // please divide by 5 d's value
        d = d / 5;
        System.out.println(d);

        int e = 8;
        // please cube of e's value
        int cube = (int) Math.pow(e, 3);
        System.out.println(cube);

        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)
        if (f1>f2) {
            System.out.println("true");
        }   else {
            System.out.println("false");
        }

        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        if (2*g2>g1) {
            System.out.println("true");
        }   else {
            System.out.println("false");
        }
        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)
        if (h%11 == 0) {
            System.out.println("true");
        }   else {
            System.out.println("false");
        }

        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
        if ((i1 > i2*i2)&&(i1 < i2*i2*i2)) {
            System.out.println("true");
        }   else {
            System.out.println("false");
        }

        int j = 1521;
        // tell if j is dividable by 3 or 5 (print as a boolean)
        if (j%3 == 0) {
            System.out.println("Dividable by 3: true");
        }   else {
            System.out.println("Dividable by 3: false");
        }
        if (j%5 == 0) {
            System.out.println("Dividable by 5: true");
        }   else {
            System.out.println("Dividable by 5: false");
        }

        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000

        double length = 5;
        double width = 4;
        double height = 2.5;
        System.out.println("Surface area: " + (2*width*length + 2*width*height + 2*height*length));
        System.out.println("Volume:" + (length*width*height));
        System.out.println(" ");

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
        int remSec = (86400 - currentSeconds - 60*currentMinutes - 3600*currentHours);
        System.out.println("Remaining seconds of this day: " + remSec);
        System.out.println(" ");

        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name. Here! And push enter. Otherwise s**t happens.");
        String userInput1 = scanner.nextLine();
        System.out.println("Hello, " + (userInput1) + "!");
        System.out.println(" ");


        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        double dist;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a distance in miles:");
        double userInput1 = scanner.nextDouble();
        dist = (userInput1) * 1.609344;
        System.out.println("Well, it is the same as " + dist + " in kilometers.");
        System.out.println(" ");

        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of chicken:");
        int userInput1 = scanner.nextInt();
        System.out.println("Enter a number of pigs:");
        int userInput2 = scanner.nextInt();
        System.out.println("There are " + (2*userInput1 + 4*userInput2) + "legs on your farm.");
        System.out.println(" ");

        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 6; i++) {
            System.out.println("Enter " + i + ". integer:");
            int userInput1 = scanner.nextInt();
            sum = sum + userInput1;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (double) sum / 5);
        System.out.println(" ");

        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (integer):");
        int userInput1 = scanner.nextInt();
        if (userInput1%2 ==0){
            System.out.println("That number is even.");
        }   else {
            System.out.println("That number is odd.");
        }
        System.out.println(" ");

        // Write a program that reads a number form the standard input,
        // If the number is zero or smaller it should print: Not enough
        // If the number is one it should print: One
        // If the number is two it should print: Two
        // If the number is more than two it should print: A lot
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (integer):");
        int userInput1 = scanner.nextInt();
        if (userInput1 <= 0){
                System.out.println("Not enough.");
        }   else if (userInput1 == 1){
                System.out.println("One.");
        }
            else if (userInput1 == 2){
                System.out.println("Two.");
        }
            else {
                System.out.println("A lot.");
        }
        System.out.println(" ");


        // Write a program that asks for two numbers and prints the bigger one
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number 1 (integer):");
        int userInput1 = scanner.nextInt();
        System.out.println("Enter a number 2 (integer):" + "\n" + "It has to be bigger or smaller than the first number.");
        int userInput2 = scanner.nextInt();
        if (userInput1 < userInput2){
            System.out.println("Bigger number: " + userInput2);
        } else if (userInput1 > userInput2){
            System.out.println("Bigger number: " + userInput1);
        } else {
            System.out.println("Bastard!");
        }
        System.out.println(" ");

        // Write a program that asks for two numbers
        // The first number represents the number of girls that comes to a party, the
        // second the boys
        // It should print: The party is excellent!
        // If the the number of girls and boys are equal and 20 or more people are coming to the party
        //
        // It should print: Quite cool party!
        // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
        //
        // It should print: Average party...
        // If there are less people coming than 20
        //
        // It should print: Sausage party
        // If no girls are coming, regardless the count of the people
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of girls at the party:");
        int userInput1 = scanner.nextInt();
        System.out.println("Number of boys at the party:");
        int userInput2 = scanner.nextInt();
        int xx = userInput1;
        int xy = userInput2;
        if ((xx+xy >= 20) && (xx==xy)) {
            System.out.println("The party is excellent!");
        } else if ((xx+xy >=20) && (xx!=xy)) {
            System.out.println("Quite cool party!");
        } else if ((xx+xy < 20) && (xx > 0)) {
            System.out.println("Average party :(");
        } else{
            System.out.println("Sausage party :)");
        }

        double a = 24;
        int out = 0;
        // if a is even increment out by one
        if (a%2 == 0) {
            out++;
        }
        System.out.println(out);


        int b = 13;
        String out2 = "";
        if ((b >= 10) && (b  <= 20)) {
            out2 = "Sweet!";
        } else if (b < 10) {
            out2 = "Less!";
        } else {
            out2 = "More!";
        }
        System.out.println(out2);
        // if b is between 10 and 20 set out2 to "Sweet!"
        // if less than 10 set out2 to "Less!",
        // if more than 20 set out2 to "More!"
        */

        /*
        int c = 123;
        int credits = 100;
        boolean isBonus = false;
        if (!isBonus) {
            if (credits >= 50){
                c = c - 2;
            } else{
                c = --c;
            }
        }
        System.out.println(c);
        // if credits are at least 50,
        // and isBonus is false decrement c by 2
        // if credits are smaller than 50,
        // and isBonus is false decrement c by 1
        // if isBonus is true c should remain the same

        int d = 8;
        int time = 120;
        String out3 = "";
        if ((time < 200) && (d % 4 == 0)){
                out3 = "check";
        } else if (time > 200){
            out3 = "Time out";
        } else {
            out3 = "Run Forest Run!";
        }
        System.out.println(out3);
        // if d is dividable by 4
        // and time is not more than 200
        // set out3 to "check"
        // if time is more than 200
        // set out3 to "Time out"
        // otherwise set out3 to "Run Forest Run!"

        // Create a program that writes this line 100 times:
        // "I won't cheat on the exam!"
        int a = 0;
        for (int i = 0; i < 100; i++) {
            System.out.println("I won't cheat on the exam!");
        // 0-99. Cheated a lot here. Many times used ctrl+c ctrl+v. Lazy.

        // Create a program that prints all the even numbers between 0 and 500
        int a = 0;
        while (a <= 500) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
        a++;
        }

        // Create a program that asks for a number and prints the multiplication table with that number
        //
        // Example:
        // The number 15 should print:
        //
        // 1 * 15 = 15
        // 2 * 15 = 30
        // 3 * 15 = 45
        // 4 * 15 = 60
        // 5 * 15 = 75
        // 6 * 15 = 90
        // 7 * 15 = 105
        // 8 * 15 = 120
        // 9 * 15 = 135
        // 10 * 15 = 150

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int userInput1 = scanner.nextInt();
        int a = 1;
        while (a <= 10) {
            System.out.println(a + " * " + userInput1 + " = " + a*userInput1);
            a++;
        }


        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one
        //
        // example:
        //
        // first number: 3, second number: 6, should print:
        //
        // 3
        // 4
        // 5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int userInput1 = scanner.nextInt();
        System.out.println("Enter another integer:");
        int userInput2 = scanner.nextInt();
        while (userInput2 <= userInput1) {
            System.out.println("The second number should be bigger. Enter it again:");
            userInput2 = scanner.nextInt();
        }
        System.out.println("OK,so:");
        int a = userInput1;
        while (a <= userInput2) {
            System.out.println(a);
            a++;
        }

        // Write a program that prints the numbers from 1 to 100.
        // But for multiples of three print “Fizz” instead of the number
        // and for the multiples of five print “Buzz”.
        // For numbers which are multiples of both three and five print “FizzBuzz”.
        int a = 1;
        while (a < 100) {
            if ((a%3 == 0) && (a%5 == 0)) {
                System.out.println("FizzBuzz");
                a++;
            } else if ((a%3 == 0) && (a%5 != 0)) {
                System.out.println("Fizz");
                a++;
            } else if ((a%3 != 0) && (a%5 == 0)) {
                System.out.println("Buzz");
                a++;
            } else {
                System.out.println(a);
                a++;
            }
        }


        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was
        int n = 5;
        int i = 0;
        String starLine = "*";
        for (i = 0; i < n; i++) {
            System.out.println(starLine);
            starLine += "*";
        }


        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was

        int n = 5;
        for (int i=0; i<n; i++)
        {
            for (int j=n-i; j>1; j--) {
                System.out.print(" ");
            }
            for (int j=0; j<=2*i; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
        */

        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        int n = 7;
        for (int i=0; i<(n/2+1); i++)
        {
            for (int j=n-i; j>1; j--) {
                System.out.print(" ");
            }
            for (int j=0; j<=2*i; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n/2; i<=n; i++)
        {
            for (int j=0; j<=i; j++ ) {
                System.out.print(" ");
            }
            for (int j=n-i; j>1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
