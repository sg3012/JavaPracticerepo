package src.practiceprograms.printpatterns;

import java.util.Scanner;

// WAP to print triangles in a cross shown below on the basis
// of number of rows entered from user input using stars
// such that one triangle is the mirror image of the other

// * * * * * * *
//  * * * * * *
//   * * * * *
//    * * * *
//     * * *
//      * *
//       *
//       *
//      * *
//     * * *
//    * * * *
//   * * * * *
//  * * * * * *
// * * * * * * *
public class CrossTrianglesOfStars {

  public static void main(String args[]) {

    int rows, i, j, k;

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter number of rows: ");

    rows = scan.nextInt();

    scan.close();

    for (i = 1; i <= rows; i++) {

      for (j = i; j <= rows; j++) {

        System.out.print("*" + " ");

      }

      System.out.println();

      for (k = 1; k <= i; k++) {

        System.out.print(" ");

      }

    }

    // How many times this loop will run depends upon
    // number of element to be printed in 1st
    // row of below triangle. For e.g: If we
    // have to print 1 element in the 1st row
    // of 2nd triangle then we will print one
    // backSpace character.
    for (i = rows; i > rows - 1; i--) { // to print one backspace in last row of upper triangle

      System.out.print("\b");

    }

    for (i = rows; i >= 1; i--) {

      for (j = i; j <= rows; j++) {

        System.out.print("*" + " ");

      }

      System.out.println();

      // This loop will print one space less
      // in the beginning of every next line
      // because we already reduced one space in the beginning
      // of the 1st line by priting one backspace.
      for (k = 1; k < i - 1; k++) {

        System.out.print(" ");

      }

    }

  }

}