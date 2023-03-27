package src.practiceprograms.printpatterns;

import java.util.Scanner;

// WAP to print an inverted full pyramid shown below on the basis
// of number of rows entered from user input
// on console using stars.

// * * * * * * * * * => 9
//   * * * * * * * => 7
//     * * * * * => 5
//       * * * => 3
//         * => 1

public class InvertedFullPyramidOfStars {

    public static void main(String args[]) {
        int rows, columns, k;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of rows: ");

        rows = scan.nextInt();

        // This loop is to track number of rows.
        for (int i = rows; i >= 1; i--) {

            // this for loop will run odd number of times.
            for (columns = 1; columns <= (2 * i) - 1; columns++) {

                System.out.print("*" + " ");

            }

            System.out.println();

            // This space is printed at the start of each line so, that
            // the pyramid is not distorted.
            System.out.print(" ");

            // this for loop will run odd number of times.
            for (k = (2 * rows) - 1; k >= (2 * i) - 1; k--) {

                System.out.print(" ");

            }
        }

        scan.close();

    }
}
