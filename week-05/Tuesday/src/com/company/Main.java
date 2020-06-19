package com.company;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
public class Main {
    //DIVIDE BE ZERO
    // Create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // It should print "fail" if the parameter is 0
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a divisor (integer)");
        int divisor = scanner.nextInt();
	    try{
	        double result = divideTenBy(divisor);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("fail, zero is not a nice divisor.");
        }
    }
     public static double divideTenBy (int divisor){
        return (double)10/divisor;
    }

}
*/

//but hey... the console is printing "Infinity" instead of "fail" I will try with "throw"
/*
public class Main {
    //DIVIDE BE ZERO
    // Create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // It should print "fail" if the parameter is 0
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a divisor (integer)");
        int divisor = scanner.nextInt();
        if (divisor == 0) {
            throw new ArithmeticException("Are you kidding?");
        } else {
            double result = divideTenBy(divisor);
            System.out.println(result);
        }
    }
    public static double divideTenBy (int divisor){
        return (double)10/divisor;
    }
}
 */
/*
public class Main {
    public static void main(String[] arcgs) {
        // Write a program that opens a file called "my-file.txt", then prints
        // each line from the file.
        // If the program is unable to read the file (for example it does not exist),
        // then it should print the following error message: "Unable to read file: my-file.txt"
        try {
            Path path = Paths.get("assets/loremipsum.txt");
            List<String> lines = Files.readAllLines(path);
            for (int i = 0; i < lines.size(); i++) {
                System.out.println(lines.get(i));
            }
        } catch (Exception e) {
            System.out.println("Houston, we have a problem.");
        }
    }
}
*/

/*
//COUNT LINES
// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
public class Main{
    public static void main(String[] arcgs){
        String fileName = "loremipsum.txt";
        int linesCount = linesCounter(fileName);
        System.out.println(linesCount);
    }

    public static int linesCounter(String fileName){
        try {
            String url = "assets/" + fileName;
            Path path = Paths.get(url);
            List<String> lines = Files.readAllLines(path);
            return lines.size();
        } catch (Exception e) {
            return 0;
        }
    }
}
 */

/*
//WRITE SINGLE LINE
// Write a function that is able to manipulate a file
// By writing your name into it as a single line
// The file should be named "my-file.txt"
// In case the program is unable to write the file,
// It should print the following error message: "Unable to write file: my-file.txt"
public class Main{
    public static void main(String[] arcgs) {
        String textToBeWritten = "Marek";
        writeToFile(textToBeWritten);
    }
    public static void writeToFile(String textToBeWritten){
        List<String> content = new ArrayList();
        content.add(textToBeWritten);
        try {
            Path filePath = Paths.get("assets/my-file.txt");
            Files.write(filePath, content);
        } catch (Exception e) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}
*/

/*
//WRITE MULTIPLE LINES
// Create a function that takes 3 parameters: a path, a word and a number
// and is able to write into a file.
// The path parameter should be a string that describes the location of the file you wish to modify
// The word parameter should also be a string that will be written to the file as individual lines
// The number parameter should describe how many lines the file should have.
// If the word is 'apple' and the number is 5, it should write 5 lines
// into the file and each line should read 'apple'
// The function should not raise any errors if it could not write the file.
public class Main{
    public static void main(String[] arcgs) {
        String textToBeWritten = "Pear";
        int linesCount = 5;
        String fileLocation = "assets/multilines.txt";
        writeToFile(textToBeWritten, linesCount, fileLocation);
    }
    public static void writeToFile(String textToBeWritten, int linesCount, String fileLocation){
        List<String> content = new ArrayList();
        for (int i = 0; i < linesCount; i++) {
            content.add(textToBeWritten);
        }
        try {
            Path filePath = Paths.get(fileLocation);
            Files.write(filePath, content, StandardOpenOption.APPEND);
        } catch (Exception e) {
            System.out.println("this is not an error message :;");
        }
    }
}
*/

/*
//COPY FILE
// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful
public class Main{
    public static void main(String[] arcgs) {
        String sourceFilePath = "assets/source.txt";
        String targetFilePath = "assets/target.txt";
        copyContent(sourceFilePath, targetFilePath);
    }
    public static void copyContent(String sourceFilePath, String targetFilePath){
        try {
        Path path1 = Paths.get(sourceFilePath);
        List<String> copyContainer = Files.readAllLines(path1);
        Path path2 = Paths.get(targetFilePath);
        Files.write(path2, copyContainer, StandardOpenOption.APPEND);
        System.out.println("succesful = true");
        } catch (Exception e) {
            System.out.println("succesful = false");
        }
    }
}
//ok, it is not really boolean but looks like that, doesn't it?
 */

/*
//DOUBLED
// Create a method that decrypts the duplicated-chars.txt
public class Main{
  public static void main(String[] arcgs) {
    String sourceFilePath = "assets/duplicated-chars.txt";
    deduplicate(sourceFilePath);
  }
  public static void deduplicate(String sourceFilePath){
    try {
      Path path1 = Paths.get(sourceFilePath);
      List<String> copyContainer = Files.readAllLines(path1);
      for (int i = 0; i < copyContainer.size(); i++) {
        String newString = "";
        String oldString = copyContainer.get(i);
        for (int j = 0; j < oldString.length(); j+=2) {
          newString += oldString.charAt(j);
        }
        System.out.println(newString);
      }
    } catch (Exception e) {
      System.out.println("Houston we have a problem.");
    }
  }
}
*/

/*
//REVERSED LINES
// Create a method that decrypts reversed-lines.txt
public class Main{
  public static void main(String[] arcgs) {
    String sourceFilePath = "assets/reversed-lines.txt";
    dereverse(sourceFilePath);
  }
  public static void dereverse(String sourceFilePath){
    try {
      Path path1 = Paths.get(sourceFilePath);
      List<String> copyContainer = Files.readAllLines(path1);
      for (int i = 0; i < copyContainer.size(); i++) {
        String newString = "";
        String oldString = copyContainer.get(i);
        for (int j = (oldString.length()-1); j >=0; j--) {
          newString += oldString.charAt(j);
        }
        System.out.println(newString);
      }
    } catch (Exception e) {
      System.out.println("Houston we have a problem.");
    }
  }
}
*/


//REVERSED ORDER
// Create a method that decrypts reversed-order.txt
public class Main{
  public static void main(String[] arcgs) {
    String sourceFilePath = "assets/reversed-order.txt";
    dereverseOrder(sourceFilePath);
  }
  public static void dereverseOrder(String sourceFilePath){
    try {
      Path path1 = Paths.get(sourceFilePath);
      List<String> copyContainer = Files.readAllLines(path1);
      for (int i = (copyContainer.size()-1); i >= 0 ; i--) {
        System.out.println(copyContainer.get(i));
      }
    } catch (Exception e) {
      System.out.println("Houston we have a problem.");
    }
  }
}
