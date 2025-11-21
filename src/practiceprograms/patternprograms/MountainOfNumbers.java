package src.practiceprograms.patternprograms;

import java.util.Scanner;

//WAP to print the mountain of numbers as shown below on the basis
//of number of rows entered from user input

//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1
public class MountainOfNumbers {

	public static void main(String[] args) {
		int distinct_Elements; // this variable
		// controls the size of number of elements
		// which are all different in the pattern.
		// For e.g. if its value is 4 then
		// it means we can have a maximum of
		// 4 different numbers in the pattern
		// starting from 1 i.e., 1,2,3,4.

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of distinct elements in the pattern: ");
		distinct_Elements = scan.nextInt();
		scan.close();
		// Method 1:
//		int count = 1;
//		for (int i = 1; i <= (distinct_Elements * 2) - 1; i++) {
//			for (int j = 1; j <= i; j++) {
//				if (!(i > distinct_Elements)) {
//					System.out.print(j + " ");
//				} else {
//					if (j <= (distinct_Elements - count)) {
//						System.out.print(j + " ");
//					}
//				}
//			}
//			System.out.println();
//			if (i > distinct_Elements) {
//				count++;
//			}
//		}

		// Method 2:
		for (int i = 1; i <= distinct_Elements; i++) {
			for (int j = 1; j <= i; j++) {
					System.out.print(j + " ");
			}
			System.out.println();
		}

		for(int i=distinct_Elements; i>1; i--) {
			for(int j = 1; j<i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
