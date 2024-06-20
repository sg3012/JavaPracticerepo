package src.practiceprograms.printpatterns;

import java.util.Scanner;

// WAP to print a half pyramid shown below on the basis
// of number of rows entered from user input
// on console using Alphabets.

// A
// B B
// C C C
// D D D D
// E E E E E

// Right angle triangle and half pyramid are the same.

// Note :
// This program will print only uppercase Alphabets.

// In this program all 26 alphabets could be printed in the pattern
// as the pattern is starting with A.

// If the pattern would have been starting with any alphabet
// greater than A then number of alphabets that could be
// printed would be less than 26.



public class HalfPyramidOfAlphabets {

    public static void main(String args[]) {
        int rows;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of rows: ");

        rows = scan.nextInt();

        if (rows > 26) {

            System.out.println("Alphabets cannot be more than 26. Please enter a row number between 1-26.");
        }

        else {

            int asciiValue = 65; // ASCII value for uppercase A.

            char alphabet = (char) asciiValue;

            for (int i = 1; i <= rows; i++) {

                for (int j = 1; j <= i; j++) {

                    System.out.print(alphabet);

                }

                System.out.println();

                asciiValue++;

                alphabet = (char) asciiValue;

            }
        }

        scan.close();

    }

}
