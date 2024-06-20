package src.practiceprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Write a program to find common elements in 2 arrays.
// For e.g consider the following arrays:
// [3,4,5,5,6,5,7]
// [1,2,3,3,5,8]
// Then common elements will be 3,5

public class CommonElementsInArrays {

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

        // This variable counts the number of array elements present in the HashMap.
        Integer count;

        // Create a HashMap of array elements
        Map<Integer, Integer> mapOfSampleArray = new HashMap<>();

        for (int element : arr1) {

            for (int element2 : arr2) {

                if (element == element2) {

                    count = mapOfSampleArray.get(element);

                    if (count == null) {

                        mapOfSampleArray.put(element, 1);
                    }

                    else {

                        count += 1;

                        mapOfSampleArray.put(element, count);
                    }

                }

            }
        }

        System.out.println("Common element(s)");

        for (var value : mapOfSampleArray.entrySet()) {

            System.out.println(value.getKey());

        }

        scan.close();
    }

}
