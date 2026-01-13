package src.practiceprograms.importantinterviewquestions.programs;

import java.util.Scanner;

public class SwapStringWithoutTemp {
	// WAP In JAVA to Swap 2 Strings WITHOUT using
	// TEMP/THIRD variable

	public static void main(String[] args) {

		// Method 1. Using "+" concatenation operator

		String str1, str2; // str1 = java
							// str2 = world

		System.out.println("Enter String1:");
		Scanner scan = new Scanner(System.in);
		str1 = scan.nextLine();
		System.out.println("Enter String2:");
		str2 = scan.nextLine();
		scan.close();

		System.out.println("-------Before Swapping------");
		System.out.println("str1:" + str1);
		System.out.println("str2:" + str2);
		str1 = str1 + str2; // str1 = javaworld
		str2 = str1.substring(0, str1.length() - str2.length()); // str2 = java
		str1 = str1.substring(str2.length()); // str1 = world
		System.out.println("-------After Swapping------");
		System.out.println("str1:" + str1);
		System.out.println("str2:" + str2);

		// NOTE: Please note that in this Method change the value of
		// the string in which you stored the SUM/CONCATENATION of both
		// the strings, at last. Otherwise, it will calculate
		// incorrect/unexpected values.

	}

}
