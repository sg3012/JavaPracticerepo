package src.practiceprograms;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Write a program to find the most repeated/frequent element in an array.
// For e.g. : If there is an integer array like : [1,4,5,3,4,4,5,6,5,7,5,6]
// Then most repeated element in the array would be 5

public class MostRepeatedElementInArray {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {

        int size, array[];

        System.out.println("Enter number of elements in the array: ");

        size = scan.nextInt();

        array = new int[size];

        System.out.println("Enter the array elements: ");

        for (int i = 0; i < array.length; i++) {

            array[i] = scan.nextInt();
        }

        scan.close();

        int maxValue;
        // Using a combination of SET and HashMap datastructures
        // as they will store only unique values

        Integer count = null; // initially count will be null as there will
                              // no key-value pairs in every row on each
                              // iteration of the loop
                              // Also, count has been declared as an Integer
                              // Wrapper class type as get() method of Map will
                              // return values type as Object amd Integer
                              // Wrapper class can hold null as well as integer
                              // values.

        // 1. Create a Hashmap corresponding to the sample array above
        Map<Integer, Integer> mapOfarray = new HashMap<Integer, Integer>();

        // Loop through the array to Check whether or not
        // the number in the array above is alreay
        // stored as a key inisde the hashMap
        // if it is there in the map already then increment
        // the value against that key by 1 else
        // insert that number as a key with value/count 1

        for (int number : array) {

            count = mapOfarray.get(number);

            if (count == null) {

                mapOfarray.put(number, 1);

            }

            else {

                count = count + 1;
                mapOfarray.put(number, count);
            }
        }

        // Store the maximum value in the map using max() method of Collections.
        maxValue = Collections.max(mapOfarray.values()); // values() method of map
                                                         // returns the collection
                                                         // corresponding to
                                                         // the map.

        // using var as return type of value in the loop
        // as we don't know which type of is it in the set

        System.out.println("Most repeated element(s): ");

        for (var value : mapOfarray.entrySet()) { // entry set method will
                                                  // convert map into set
                                                  // So, that we could iterate
                                                  // the Set using loop.

            // If the value of any key
            // is equal to the maximum value stored in
            // maxValue then print the key and value otherwise keep looping
            if (value.getValue() == maxValue) {

                System.out.print(value.getKey());

                System.out.println(" Occurences: " + value.getValue());

            }
        }
    }
}
