package src.practiceprograms.printpatterns;

import java.util.Scanner;

// WAP to print half pyramid rotated 180 degrees shown below on the basis
// of number of rows entered from user input
// on console using stars.

// Right angle triangle and half pyramid are the same.

//         * 
//       * * 
//     * * * 
//   * * * * 
// * * * * *

public class RotatedHalfPyramidOfStars {

    public static void main(String args[]) {

        int rows;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of rows: ");

        rows = scan.nextInt();

        for (int i = 1; i <= rows; i++) {

            for (int j = rows; j >= i; j--) {

                System.out.print(" ");

            }

            for (int k = 1; k <= i; k++) {

                System.out.print("*");


            }

            System.out.println();

        }

        scan.close();

    }
}
