package src.practiceprograms.printpatterns;

import java.util.Scanner;

// WAP to print a half pyramid shown below on the basis
// of number of rows entered from user input
// on console using stars.

// Right angle triangle and half pyramid are the same.

// *
// * *
// * * *
// * * * *
// * * * * *

public class HalfPyramidOfStars {

    public static void main(String args[]) {

        int rows;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of rows: ");

        rows = scan.nextInt();

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("*"+" ");

            }

            System.out.println();

        }

        scan.close();

    }
}
