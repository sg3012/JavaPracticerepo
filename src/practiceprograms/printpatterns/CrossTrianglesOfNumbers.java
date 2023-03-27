package src.practiceprograms.printpatterns;

import java.util.Scanner;

// WAP to print triangles in a cross shown below on the basis
// of number of rows entered from user input using numbers
// such that one triangle is the mirror image of the other

// 1 2 3 4 5 6 7 
//  2 3 4 5 6 7 
//   3 4 5 6 7 
//    4 5 6 7 
//     5 6 7 
//      6 7 
//       7 
//      6 7 
//     5 6 7 
//    4 5 6 7 
//   3 4 5 6 7 
//  2 3 4 5 6 7 
// 1 2 3 4 5 6 7 

public class CrossTrianglesOfNumbers {

  public static void main(String args[]) {

    int rows, i, j, k;

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter number of rows: ");

    rows = scan.nextInt();

    scan.close();

    for (i = 1; i <= rows; i++) {

      for (j = i; j <= rows; j++) {

        System.out.print(j + " ");

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
    for (i = rows; i > rows - 2; i--) { // to print one backspace in last row of upper triangle

      System.out.print("\b");

    }

    for (i = rows - 1; i >= 1; i--) {

      for (j = i; j <= rows; j++) {

        System.out.print(j + " ");

      }

      System.out.println();

      for (k = 1; k < i - 1; k++) {

        System.out.print(" ");

      }

    }

  }
}