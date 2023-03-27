package src.practiceprograms.printpatterns;

import java.util.Scanner;

// WAP to print an inverted half pyramid shown below on the basis
// of number of rows entered from user input
// on console using numbers.

// Right angle triangle and half pyramid are the same.

// 1 2 3 4 5
// 1 2 3 4 
// 1 2 3
// 1 2
// 1

public class InvertedHalfPyramidOfNumbers {

    public static void main(String args[]) {

        int rows;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of rows: ");

        rows = scan.nextInt();

        for (int i = rows; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j + " ");

            }

            System.out.println();

        }

        scan.close();

    }
}
