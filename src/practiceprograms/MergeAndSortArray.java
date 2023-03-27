package src.practiceprograms;

import java.util.Scanner;

// WAP to merge 2 arrays and sort the resultant one
// For e.g consider the following arrays:
// [3,4,5,5,6,5,7]
// [1,2,3,3,5,8]
// Merged Array : [3,4,5,5,6,5,7,1,2,3,3,5,8]
// Sorted array : [1,2,3,3,3,4,5,5,5,5,6,7,8]

public class MergeAndSortArray {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {

        int arr1[], arr2[], size1, size2;

        System.out.println("Enter number of elements in array1: ");

        size1 = scan.nextInt();

        arr1 = new int[size1];

        System.out.println("Enter number of elements in array2: ");

        size2 = scan.nextInt();

        arr2 = new int[size2];

        System.out.println("Enter elements in array1:");

        for (int i = 0; i < arr1.length; i++) {

            arr1[i] = scan.nextInt();

        }

        System.out.println("Enter elements in array2:");

        for (int i = 0; i < arr2.length; i++) {

            arr2[i] = scan.nextInt();

        }

        // Create a third array to merge 2 arrays and store the result.

        int result[] = new int[size1 + size2];

        int i = 0; // variable to keep track of the indexes in the resultant array

        for (i = 0; i < size1; i++) { // copying arr1[] to result[]

            result[i] = arr1[i];

        }

        for (i = 0; i < size2; i++) { // copying arr2[] to result[]

            result[i + size1] = arr2[i];

        }

        // System.out.println("Resultant array after merge: ");

        // for (int j = 0; j < result.length; j++) {

        // System.out.print(result[j] + " ");

        // }

        System.out.println();

        // Sort the array in ascending order using Bubble sort
        int temp;

        for (int j = 0; j < result.length - 1; j++) { // Outer loop for
                                                      // the number of passes

            for (int k = 0; k < result.length - 1; k++) { // inner loop for the
                                                          // number of comparisons.
                if (result[k] > result[k + 1]) {

                    temp = result[k];

                    result[k] = result[k + 1];

                    result[k + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array after Merge(Ascending): ");

        for (int j = 0; j < result.length; j++) {

            System.out.print(result[j] + " ");

        }

        scan.close();

    }

}
