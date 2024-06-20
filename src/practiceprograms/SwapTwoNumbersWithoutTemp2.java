package src.practiceprograms;

import java.util.Scanner;

// Write a program to swap 2 numbers using multiplication and division
// operators but without using a temp variable

public class SwapTwoNumbersWithoutTemp2 {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {

        double a, b;

        System.out.println("Enter 2 numbers");

        System.out.print("a= ");

        a = scan.nextDouble();

        System.out.print("b= ");

        b = scan.nextDouble();

        System.out.println("Numbers after swap");

        a = a * b;

        b = a / b;

        a = a / b;

        System.out.print("a= " + (int) a);

        System.out.println();

        System.out.print("b= " + (int) b);

        scan.close();
    }
}
