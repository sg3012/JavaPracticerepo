package src.practiceprograms;

import java.util.Scanner;

public class SwapStringWithoutTemp {

	public static void main(String[] args) {

		// Method 1. Using "+" concatenation operator

		String str1, str2;

		System.out.println("Enter String1:");

		Scanner scan = new Scanner(System.in);

		str1 = scan.nextLine();

		System.out.println("Enter String2:");

		str2 = scan.nextLine();

		scan.close();

		System.out.println("-------Before Swapping------");

		System.out.println("str1:" + str1);

		System.out.println("str2:" + str2);

		str1 = str1 + str2;

		str2 = str1.substring(0, str1.length() - str2.length());
		
		str1 = str1.substring(str2.length());

		System.out.println("-------After Swapping------");

		System.out.println("str1:" + str1);

		System.out.println("str2:" + str2);

	}

}
