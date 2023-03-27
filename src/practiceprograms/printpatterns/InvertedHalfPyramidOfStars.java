package src.practiceprograms.printpatterns;

import java.util.Scanner;

// WAP to print an inverted half pyramid shown below on the basis
// of number of rows entered from user input
// on console using stars.

// Right angle triangle and half pyramid are the same.

// * * * * *
// * * * *
// * * * 
// * *
// *

public class InvertedHalfPyramidOfStars {
    public static void main(String args[]) {
        int rows;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of rows: ");

        rows = scan.nextInt();

        // This loop is to track number of rows
        for (int i = rows; i >= 1; i--) {

            // This loop is print elements
            for (int j = i; j >= 1; j--) {

                System.out.print("*"+" ");

            }

            System.out.println();

        }

        scan.close();
    }
}
