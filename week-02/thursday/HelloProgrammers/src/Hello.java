import java.util.Scanner;

public class Hello {
    public static void main(String[] args){

        //comment
        /* comment
        */
        int myNumber = 45;
        System.out.println (myNumber);

        int a, b, c, d;
        a = 10;
        b = 20;

        c = a + b;
        System.out.println(c);

        c = (a + b) / 10;
        System.out.println(c);

        d = c * b;
        System.out.println(d);

        byte verySmallNumber;
        short smallNumber;
        int averageNumber;
        long largeNumber;

        float averageDecimal = 1.023548f;
        double largeDecimal;

        boolean trueOrFalse = true;
        char character = 'b';
        //for single character

        String message = "This " + "is tutorial no. 3.";
        System.out.println(message);

        Scanner input = new Scanner(System.in);
        System.out.println("Zmáčkni číslo");
        int favouriteNumber = input.nextInt();
        a = favouriteNumber * 8;
        System.out.println(favouriteNumber + " x 8 = " +a );






    }
}
