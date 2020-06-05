package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        // - Create an array variable named `numbers`
        //   with the following content: `[4, 5, 6, 7]`
        // - Print the third element of `numbers`
        int[] numbers = {4, 5, 6, 7};
        System.out.println(numbers [2]);

        // - Create an array variable named `firstArrayOfNumbers`
        //   with the following content: `[1, 2, 3]`
        // - Create an array variable named `secondArrayOfNumbers`
        //   with the following content: `[4, 5]`
        // - Print "secondArrayOfNumbers is longer" if `secondArrayOfNumbers` has more
        //   elements than `firstArrayOfNumbers`
        int[] firstArrayOfNumbers = {1, 2, 3};
        int[] secondArrayOfNumbers = {4, 5};
        int length1 = firstArrayOfNumbers.length;
        int length2 = secondArrayOfNumbers.length;
        if (length1 > length2) {
            System.out.println("secondArrayOfNumbers is longer");

        // - Create an array variable named `numbers`
        //   with the following content: `[54, 23, 66, 12]`
        // - Print the sum of the second and the third element
        int[] numbers = {54, 23, 66, 12};
        int sum;
        sum = numbers[1] + numbers[2];
        System.out.println(sum);

        // - Create an array variable named `numbers`
        //   with the following content: `[1, 2, 3, 8, 5, 6]`
        // - Change the 8 to 4
        // - Print the fourth element
        int[] numbers = {1, 2, 3, 8, 5, 6};
        numbers[3] = 4;
        System.out.println(numbers[3]);

        // - Create an array variable named `numbers`
        //   with the following content: `[1, 2, 3, 4, 5]`
        // - Increment the third element
        // - Print the third element
        int[] numbers = {1, 2, 3, 4, 5};
        numbers[2]++;
        System.out.println(numbers[2]);

        // - Create an array variable named `numbers`
        //   with the following content: `[4, 5, 6, 7]`
        // - Print all the elements of `numbers`
        int[] numbers = {4, 5, 6, 7};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // - Create (dynamically) a two dimensional array
        //   with the following matrix. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output
        int[][] numbers = new int[4][4];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i][i] = 1;
        }
        for (int i=0; i<numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }

        // - Create an array variable named `numList`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Double all the values in the array
        int[] number = {3, 4, 5, 6, 7};
        for (int i = 0; i < 5; i++) {
            number[i] = 2*number[i];
        }
        for (int i=0; i<number.length; i++) {
            System.out.println(number[i]);
            }

        // - Create a two dimensional array
        //   which can contain the different shades of specified colors
        // - In `colors[0]` store the shades of green:
        //   `"lime", "forest green", "olive", "pale green", "spring green"`
        // - In `colors[1]` store the shades of red:
        //   `"orange red", "red", "tomato"`
        // - In `colors[2]` store the shades of pink:
        //   `"orchid", "violet", "pink", "hot pink"`

        String [][] colors = new String [3][];
        colors[0] = new String [] {"lime", "forest green", "olive", "pale green", "spring green"};
        colors[1] = new String [] {"orange red", "red", "tomato"};
        colors[2] = new String [] {"orchid", "violet", "pink", "hot pink"};
        }
        */

        /*
        //APPENDA
        // - Create an array variable named `animals`
        //   with the following content: `["koal", "pand", "zebr"]`
        // - Add all elements an `"a"` at the end
        String [] animals = {"koal", "pand", "zebr"};
        for (int i = 0; i < animals.length; i++) {
            animals[i] = animals[i]+"a";
            System.out.println(animals[i]);

        }
         */

        /*
        //SWAP ELEMENTS
        // - Create an array variable named `orders`
        //   with the following content: `["first", "second", "third"]`
        // - Swap the first and the third element of `orders`
        String[] orders = {"first", "second", "third"};
        String temp;
        temp = orders[2];
        orders[2] = orders[0];
        orders[0] = temp;
        for (int i = 0; i < orders.length; i++) {
            System.out.println(orders[i]);
        }
        */

        /*
        //SUM ALL
        // - Create an array variable named `numbers`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Print the sum of the elements in `numbers`
        int[] numbers = {3, 4, 5, 6, 7};
        int suma = 0;
        for (int i = 0; i < numbers.length; i++) {
            suma = suma + numbers[i];
        }
        System.out.println(suma);
         */

        /*
        // - Create an array variable named `numbers`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements in `numbers`
        // - Print the elements of the reversed `numbers`
        int[] numbers = {3, 4, 5, 6, 7};
        int i, temp;
        for (i = 0; i < numbers.length / 2; i++) {
            temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
        for (i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        */
    }
}
