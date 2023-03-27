package src.practiceprograms;

import java.util.Scanner;

// Write a program to sort a string alphabetically
// For e.g. If there is a string "Dogma"
// Then if we sort it alphabetically it will look
// like "aDgmo"

public class SortString {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {
        
        String dummyString;

        System.out.println("Enter a String of your choice: ");

        dummyString = scan.nextLine();

        scan.close();

        StringBuilder actualString = new StringBuilder(dummyString);

        char temp;

        System.out.print("Sorted String: ");

        for (int i = 0; i < actualString.length() - 1; i++) { // This loop is for the number of passes.

            for (int j = 0; j < actualString.length() - 1; j++) { // This loop is for actual comparison.
               
                // We have used getNumericValue() of the character class
                // instead of comparing the ASCII values of
                // characters in string as this method
                // returns the same numeric value for uppercase and lowercase
                // characters, that makes the comparison of characters
                // legitimate purely based on their position. 
                if (Character.getNumericValue(actualString.charAt(j)) > Character
                        .getNumericValue(actualString.charAt(j + 1))) {

                    temp = actualString.charAt(j);

                    actualString.setCharAt(j, actualString.charAt(j + 1));

                    actualString.setCharAt(j + 1, temp);
                }
            }
        }
        System.out.println(actualString);
    }
}
