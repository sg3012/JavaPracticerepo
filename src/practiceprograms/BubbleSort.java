package src.practiceprograms;

import java.util.Scanner;

// Bubble sort~~~, sometimes referred to as sinking sort,
// is a simple sorting algorithm that repeatedly steps through the list,
// compares adjacent elements and swaps them if they are in the wrong order.

// Just like the movement of air bubbles in
// the water that rise up to the surface, each element
// of the array move to the end in each iteration. Therefore, it
// is called a bubble sort.

public class BubbleSort {

	private static Scanner scan = new Scanner(System.in);

	// This method will sort the array in ascending order

	public static int[] sortBubbleAsc(int array[]) {

		int temp;

		boolean swapped = false; // This variable is used to check if
									// any swapping of elements occurred
									// after each iteration of the outer loop
									// or not. If not it will remain false and we break the loop
									// to iterate further otherwise it will set to True.

		for (int i = 0; i < array.length - 1; i++) { // Outer loop for
														// the number of passes

			for (int j = 0; j < array.length - 1; j++) { // inner loop for the
															// number of comparisons.
				if (array[j] > array[j + 1]) {

					temp = array[j];

					array[j] = array[j + 1];

					array[j + 1] = temp;

					swapped = true;
				}
			}

			if (!swapped) {

				break;

			}
		}

		return array;
	}

	// This method will sort the array in descending order
	public static int[] sortBubbleDesc(int array[]) {

		int temp;

		boolean swapped = false;

		for (int i = 0; i < array.length - 1; i++) { // Outer loop for
														// the number of passes

			for (int j = 0; j < array.length - 1; j++) { // inner loop for the
															// number of comparisons.
				if (array[j] < array[j + 1]) {

					temp = array[j];

					array[j] = array[j + 1];

					array[j + 1] = temp;

					swapped = true;

				}
			}

			if (!swapped) {

				break;

			}
		}

		return array;
	}

	public static void main(String args[]) {
		int size, arr[];

		System.out.print("Enter number of elements in the array:");

		size = scan.nextInt();

		arr = new int[size];

		System.out.println("Enter elements of the array:");

		for (int i = 0; i < arr.length; i++) {

			arr[i] = scan.nextInt();
		}

		System.out.println("Sorted array(ascending order):");

		arr = sortBubbleAsc(arr);

		for (int element : arr) {

			System.out.println(element);
		}

		// System.out.println("Sorted array(descending order):");

		// arr = sortBubbleDesc(arr);

		// for (int i = 0; i < arr.length; i++) {

		// System.out.println(arr[i]);
		// }

		scan.close();
	}
}
