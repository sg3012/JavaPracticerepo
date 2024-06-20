package src.practiceprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Write a program to find distinct elements in an array.
// Example if an array is like :
// [1, 3, 3, 5, 6, 9, 6]
// Distinct elements would be : [1,5,9]

public class DistinctElementsInArray {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {

        int size, sampleArray[];

        System.out.println("Enter number of elements in the array");

        size = scan.nextInt();

        sampleArray = new int[size];

        System.out.println("Enter array elements:");

        for (int i = 0; i < sampleArray.length; i++) {

            sampleArray[i] = scan.nextInt();
        }

        Integer count = null;

        Map<Integer, Integer> mapOfSampleArray = new HashMap<>();

        for (int number : sampleArray) {

            count = mapOfSampleArray.get(number);

            if (count == null) {

                mapOfSampleArray.put(number, 1);
            }

            else {

                count = count + 1;

                mapOfSampleArray.put(number, count);
            }

        }

        boolean flag = false; // if flag is false then no distinct elements present
                              // in the array otherwise they do.

        for (var value : mapOfSampleArray.entrySet()) {

            if (value.getValue() == 1) {

                flag = true;

                System.out.print(value.getKey()+" ");
            }
        }

        if (!flag) {

            System.out.println("No distinct elements are there in the array");
        }

        scan.close();

    }

}
