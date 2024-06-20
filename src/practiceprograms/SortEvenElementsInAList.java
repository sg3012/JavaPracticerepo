package src.practiceprograms;

import java.util.Arrays;
import java.util.Scanner;

// WAP in JAVA to sort all the even numbers in a list of integer elements
// in ascending order
// Examples:
//Input: arr[] = {1, 2, 3, 5, 4, 7, 10}
//Output: arr[] = {7, 5, 3, 1, 2, 4, 10}
//
//Input: arr[] = {0, 4, 5, 3, 7, 2, 1}
//Output: arr[] = {7, 5, 3, 1, 0, 2, 4}

public class SortEvenElementsInAList {

	private static Scanner scan = new Scanner(System.in);

	public static int[] sortEvenElements(int array[], int n) {

		// initialising left and right indices
		int left = 0, right = n - 1;

		// Maintain the count of odd numbers
		int k = 0;

		while (left < right) {

			// Find first even number from the left hand side
			while (array[left] % 2 != 0) {

				left++;

				k++;
			}

			// Find first odd number from the right hand side
			while (array[right] % 2 == 0 && left < right) {

				right--;
			}

			// Swap the positions and values of even and odd numbers in the list
			if (left < right) {

				int temp = array[left];

				array[left] = array[right];

				array[right] = temp;
			}
		}

		Arrays.sort(array,k,n);

		return array;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size;

		int arr[];

		System.out.println("Enter the size of array:");

		size = scan.nextInt();

		arr = new int[size];

		System.out.println("Enter array elements:");

		for (int i = 0; i < arr.length; i++) {

			arr[i] = scan.nextInt();

		}

		System.out.println("Array after sorting even elements:");

		arr = sortEvenElements(arr, size);

		System.out.println(Arrays.toString(arr));

	}

}
