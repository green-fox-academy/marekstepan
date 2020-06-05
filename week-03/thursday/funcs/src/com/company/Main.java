package com.company;

/*
public class Main {

    public static void main(String[] args) {
        // - Create an integer variable named `baseNum` and assign the value `123` to it
        // - Create a function called `doubling` that doubles it's input parameter and returns with an integer
        // - Print the result of `doubling(baseNum)`
        int baseNum = 123;
        int doubledStuff = doubling(baseNum);
        System.out.println(doubledStuff);
    }

    public static int doubling(int baseNum) {
        return (baseNum * 2);
    }
}
 */

        //  From now on, create the usual class wrapper
        //  and main method on your own.

        // - Create a string variable named `al` and assign the value `Green Fox` to it
        // - Create a function called `greet` that greets it's input parameter
        //     - Greeting is printing e.g. `Greetings dear, Green Fox`
        // - Greet `al`

/*
public class Main {

    public static void main(String[] arcgs) {
        String al = "Marek";
        String niceWholeGreeting = greet(al);
        System.out.println(niceWholeGreeting);
    }

    public static String greet(String al) {
        return ("Greetings dear, " + al);
    }
}
*/


// - Create a string variable named `typo` and assign the value `Chinchill` to it
// - Write a function called `appendAFunc` that gets a string as an input,
//   appends an 'a' character to its end and returns with a string
//
// - Print the result of `appendAFunc(typo)`

/*
public class Main {
  public static void main(String[] arcgs) {
    String typo = "pizd";
    String WholeWord = appendAFunc(typo);
    System.out.println(WholeWord);
  }
    public static String appendAFunc(String typo) {
      return (typo + "a");
    }
}
 */

/*
// Create the usual class wrapper and main method on your own.
// Write a function called `sum` that returns the sum of numbers from zero to the given parameter

public class Main {
  public static void main(String[] arcgs) {
    int max = 6;
    int result = sum(max);
    System.out.println(result);
  }
  public static int sum(int max) {
    int x=0;
    for (int i = 0; i < max; i++) {
      x = x+i+1;
    }
    return (x);
  }
}
*/

//FACTORIAL
// - Create a function called `factorio`
//   that returns it's input's factorial

public class Main {
  public static void main(String[] arcgs) {
    int max = 4;
    int result = factorio(max);
    System.out.println(result);
  }
  public static int factorio(int max) {
    int x=1;
    for (int i = 0; i < max; i++) {
      x = x * (i+1);
    }
    return (x);
  }
}

