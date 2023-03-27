package src.practiceprograms.printpatterns;

import java.util.Scanner;

// WAP to print the Floyd's triangle shown below on the basis
// of number of rows entered from user input

// 1 - Row 0
// 2 3 - Row 1
// 4 5 6 - Row 2
// 7 8 9 10 - Row 3
public class FloydsTriangle {
  public static void main(String args[]) {

    int rows, count = 0;

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter number of rows: ");

    rows = scan.nextInt();

    for (int i = 1; i <= rows; i++) {

      for (int j = 1; j <= i; j++) {

        count = count + 1;

        System.out.print(count+" ");

      }
      System.out.println();

    }
    scan.close();

  }
}
