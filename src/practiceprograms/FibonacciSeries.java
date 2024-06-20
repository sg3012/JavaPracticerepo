package src.practiceprograms;

import java.util.Scanner;

// WAP to print a Fibonacci series for a given range.

// Below is the how Fibonacci series looks like:
// Fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...

public class FibonacciSeries {

  private static long F0 = 0;

  private static long F1 = 1;

  private static long Fn, sum = 0;

  private static Scanner scan = new Scanner(System.in);

  public static void main(String args[]) {

    System.out.print("Enter the size of fibonacci sequence: ");

    Fn = scan.nextInt();

    scan.close();

    Fn = Fn - 2; // We have decreased the size to 2 as we already have initial
    // 2 elements of the sequence

    System.out.println("Your Series:");

    System.out.print(F0 + " ");

    System.out.print(F1 + " ");


    for (int i = 0; i <= Fn - 1; i++) {

      sum = F0 + F1;

      System.out.print(sum + " ");

      F0 = F1;

      F1 = sum;

    }
  }
}
