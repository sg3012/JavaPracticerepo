package src.practiceprograms;

import java.util.Scanner;

// WAP to calculate output of n to the power of m.
// Where n = number or base
// m = exponent or power.
// For e.g.: 2 to the power 3  = 8

public class Exponent {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {

        int base, exponent;

        long product = 1; // Here we have taken a product variable because
                          // n raise to the power m is itself a product.

        System.out.println("Enter a number of your choice: ");

        base = scan.nextInt();

        System.out.println("Enter exponent: ");

        exponent = scan.nextInt();

        scan.close();

        if (exponent == 0) {

            System.out.println(base + " raise to the power " + exponent + ": " + product);
        }

        else if (exponent > 0) {

            for (int i = 1; i <= exponent; i++) {

                product = product * base;

            }

            System.out.println(base + " raise to the power " + exponent + ": " + product);
        }

    }

}
