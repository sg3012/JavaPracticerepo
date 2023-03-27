package src.practiceprograms;

import java.util.Scanner;

// Write a program to find the second largest number in an array.

public class SecondLargestElementInArray {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {

        // Enter array
        int size, arr[];

        System.out.print("Enter number of elements in the array: ");

        size = scan.nextInt();

        arr = new int[size];

        System.out.println("Enter elements of the array:");

        for (int i = 0; i < arr.length; i++) {

            arr[i] = scan.nextInt();
        }

        // Sort the array in descending order
        int temp;

        for (int i = 0; i < arr.length - 1; i++) { // Outer loop for
                                                   // the number of passes

            for (int j = 0; j < arr.length - 1; j++) { // inner loop for the
                                                       // number of comparisons.
                if (arr[j] < arr[j + 1]) {

                    temp = arr[j];

                    arr[j] = arr[j + 1];

                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Second largest element is: " + arr[1]);

        scan.close();
    }
}
