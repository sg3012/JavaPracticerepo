package src.practiceprograms;

import java.util.Scanner;

// Write a program for linear(sequential) search.

public class SequentialSearch {

    private static Scanner scan = new Scanner(System.in);

    public static int linearSearch(int array[], int targetElement) {

        int j;

        for (j = 0; j < array.length; j++) {

            if (array[j] == targetElement) {

                return j;
            }
        }

        return j; // If we reach this point it means the program
                  // searched the whole array until the last element
                  // and exited the loop when loop variable equals
                  // the length of array.
    }

    public static void main(String args[]) {

        int arr[], size;

        System.out.println("Enter number of elements in the array: ");

        size = scan.nextInt();

        arr = new int[size];

        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {

            arr[i] = scan.nextInt();

        }

        int target, position; // target element

        System.out.println("Enter the element to be searched:");

        target = scan.nextInt();

        position = linearSearch(arr, target);

        if (position >= 0 && position < arr.length) {

            System.out.print("Element found at index: " + position);
        }

        else {

            System.out.print("Search Unsucessful. No Such Element Present!.");
        }

        scan.close();
    }
}
