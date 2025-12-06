package src.practiceprograms.importantinterviewquestions;

import java.util.Scanner;

// Write a program to swap 2 numbers without using a temp variable

public class SwapNumbersWithoutTemp {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {

		double a, b;
		System.out.println("Enter the 2 numbers: ");
		System.out.print("a= ");
		a = scan.nextDouble();
		System.out.print("b= ");
		b = scan.nextDouble();

		// METHOD 1. Using arithmetic addition and subtraction
//		a = a + b;
//		b = a - b;
//		a = a - b;
//		System.out.println("Numbers after swap:");
//		System.out.println("a= " + (int) a);
//		System.out.println("b= " + (int) b);

		// METHOD 2. Using XOR operator
		// Returns 1 for X XOR Y if there are odd number of 1s i.e., 1,3,5.....so on
		// number
		// of ones else it will return 0.
//        a = a ^ b;
//        b = a ^ b;
//        a = a ^ b;
//        System.out.println("a= " + a);
//        System.out.println("b= " + b);

		// METHOD 3: USING ARITHMETIC DIVISION AND MULTIPLICATION
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("Numbers after swap:");
		System.out.print("a= " + (int) a);
		System.out.println();
		System.out.print("b= " + (int) b);

		scan.close();
		// NOTE: Please note that in Method 1 or Method 3 change the value of
		// the variable in which you stored the SUM or PRODUCT of both
		// the variables, at last. Otherwise, it will calculate
		// incorrect/unexpected values.

	}
}
