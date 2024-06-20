package src.practiceprograms.printpatterns;

import java.util.Scanner;

// WAP to print a full pyramid shown below on the basis
// of number of rows entered from user input
// on console using stars.

//      *
//     * *
//    * * *
//   * * * *
//  * * * * *

public class FullPyramidOfStars {
    public static void main(String args[]) {

        int rows, columns, k;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of rows: ");

        rows = scan.nextInt();

        // This loop is for tracking number of rows.
        for (int i = 1; i <= rows; i++) {

            // This loop is for printing spaces in each row.
            for (columns = rows; columns >= i; columns--) {

                System.out.print(" ");

            }

            // This loop is for priting elements.
            for (k = 1; k <= i; k++) {

                System.out.print("*");

                System.out.print(" ");

            }

            System.out.println();

        }

        scan.close();

    }
}
