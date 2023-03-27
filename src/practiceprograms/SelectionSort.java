package src.practiceprograms;

import java.util.Scanner;

// The selection sort algorithm sorts an array by repeatedly 
// finding the minimum (or maximum) element 
// from unsorted part and putting it at the beginning. 
// The algorithm maintains two subarrays in a given array.
// 1) The subarray which is already sorted. 
// 2) Remaining subarray which is unsorted.
// In every iteration of selection sort, the minimum (or maximum) element 
// from the unsorted subarray is picked/Selected and moved to the sorted subarray. 

public class SelectionSort {

    private static Scanner scan = new Scanner(System.in);

    public static int[] sortSelectionAsc(int arr[]) {

        int min;

        for (int i = 0; i < arr.length - 1; i++) {

            min = arr[i];

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < min) {

                    min = arr[j];

                    arr[j] = arr[i];

                    arr[i] = min;
                }
            }

        }

        return arr;
    }

    public static int[] sortSelectionDesc(int arr[]) {

        int max;

        for (int i = 0; i < arr.length - 1; i++) {

            max = arr[i];

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] > max) {

                    max = arr[j];

                    arr[j] = arr[i];

                    arr[i] = max;
                }
            }

        }

        return arr;
    }

    public static void main(String args[]) {

        int array[], size;

        System.out.println("Enter number of elements in the array: ");

        size = scan.nextInt();

        array = new int[size];

        System.out.println("Enter array elements: ");

        for (int i = 0; i < array.length; i++) {

            array[i] = scan.nextInt();

        }

        // Array sorted in Ascending order:

        array = sortSelectionAsc(array);

        System.out.println("Sorted array(ascending): ");

        for (int k = 0; k < array.length; k++) {

            System.out.println(array[k]);
        }

        // Array sorted in Descending order:

        array = sortSelectionDesc(array);

        System.out.println("Sorted array(descending): ");

        for (int k = 0; k < array.length; k++) {

            System.out.println(array[k]);
        }

        scan.close();
    }
}
