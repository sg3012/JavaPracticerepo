/**
 * 
 */
package src.practiceprograms;

import java.util.Scanner;

// Note: This program will find out only single missing element/Integer in an array
// of consecutive elements/Integers

/**
 * @author sgupta52
 *
 */
public class MissingNumberInArray {

	private static Scanner scan = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long actualArray[];
		System.out.println("Enter the expected size of array:");
		int expectedSize = scan.nextInt();
		actualArray = new long[expectedSize - 1];
		System.out.println("Enter actual array elements:");
		long sum1 = 0;
		for (int i = 0; i < actualArray.length; i++) {

			actualArray[i] = scan.nextLong();
		}

		for (int i = 0; i < (actualArray.length); i++) {
			sum1 = sum1 + actualArray[i];
		}
		long sum2 = 0;

		for (int i = 1; i <= expectedSize; i++) {

			sum2 = sum2 + actualArray[0] + (i - 1);
		}

		System.out.println("Missing element in the actual array is:" + (sum2 - sum1));

		scan.close();

	}

}
