package src.practiceprograms;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

// Write a program to find uncommon elements in 2 arrays.
// For e.g consider the following arrays:
// [3,4,5,5,6,5,7]
// [1,2,3,3,5,8]
// Then Uncommon elements will be 4,6,7,1,2,8

public class UncommonElements {

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

        // Merge arrays arr1 and arr2 using arrayCopy() method of
        // System class.

        // Syntax of arrayCopy() method:
        // public static void arraycopy(Object source, int source_position,
        // Object destination, int destination_position, int length);

        // Parameters of the arrayCopy() method:
        // source: It is a source array.
        // source_position: Starting point in the source array.
        // destination: It is a destination array.
        // destination_position: Starting position in the destination array.
        // length: The number of array elements to be copied

        System.arraycopy(arr1, 0, result, 0, size1);

        System.arraycopy(arr2, 0, result, size1, size2);

        Map<Integer, Integer> mapOfSampleArray = new HashMap<Integer, Integer>();

        Integer count;

        for (int number : result) {

            count = mapOfSampleArray.get(number);

            if (count == null) {

                mapOfSampleArray.put(number, 1);
            }

            else {

                count++;

                mapOfSampleArray.put(number, count);
            }

        }

        boolean flag = false; // if flag is false then no distinct elements present
        // in the array otherwise they do.

        for (var value : mapOfSampleArray.entrySet()) {

            if (value.getValue() == 1) {

                flag = true;

                System.out.print(value.getKey() + " ");
            }
        }

        if (!flag) {

            System.out.println("No uncommon elements present in both the arrays.");
        }

        scan.close();
    }

}
