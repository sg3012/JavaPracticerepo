package src.practiceprograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

// Write a program to find duplicates in an array.
// Example if an array is like : 
// [1, 3, 3, 5, 6, 9, 6]
// Duplicates would be : [3,6]
// Occurences of 3 : 2
// Occurences of 6 : 2

public class DuplicatesInArray {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		int sampleArray[];

		int numberOfElements;

		System.out.print("Enter number of elements in the array: ");

		numberOfElements = scan.nextInt();

		sampleArray = new int[numberOfElements];

		System.out.println("Enter elements:");

		for (int i = 0; i <= (sampleArray.length - 1); i++) {

			sampleArray[i] = scan.nextInt();

		}

		System.out.println("==========Logic 1 ================");

		// Method 1: Using 2 loops outer loop to pick an array element to compare
		// and inner loop to be iterated on remaining elements using
		// the element from outer loop.
		// But this method will work only when
		// an element is repeated 2 times else it will fail.
		System.out.println("Duplicate elements are: ");

		// for(int j=0; j<(sampleArray.length-2); j++){

		//

		// for(int k=j+1; k<=(sampleArray.length-1); k++){

		// if(sampleArray[j] == sampleArray[k] && j!=k){

		// System.out.println(sampleArray[k]);

		// }

		// }
		// }

		System.out.println("==========Logic 2 ================");
		// Method 2 : Using a combination of SET and HashMap data structures
		// as they will store only unique values

		Integer count = null; // initially count will be null as there will
								// no key-value pairs in every row on each
								// iteration of the loop
								// Also, count has been declared as an Integer
								// Wrapper class type as get() method of Map will
								// return values type as Object and Integer
								// Wrapper class can hold null as well as integer
								// values.

		// 1. Create a Hashmap corresponding to the sample array above
		Map<Integer, Integer> mapOfSampleArray = new HashMap<Integer, Integer>();

		// Loop through the array to Check whether or not
		// the number in the sampleArray above is already
		// stored as a key inside the hashMap
		// if it is there in the map already then increment
		// the value against that key by 1 else
		// insert that number as a key with value/count 1
		// The variable "number" corresponds to the index wise values in the array.

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

		// using var as return type of value in the loop
		// as we don't know which type of is it in the set
		for (var value : mapOfSampleArray.entrySet()) { // entry set method will
														// convert map into set
														// So, that we could iterate
														// the Set using loop.

			// If the value of any key
			// is greater than 1 then return
			// the corresponding key otherwise continue looping
			if (value.getValue() > 1) {

				System.out.print(value.getKey() + ", ");

				System.out.println("Occurences: " + value.getValue());

			}
		}

		System.out.println("==========Logic 3 ================");

		// Method 3: Using a combination of Set and HashSet
		Set<Integer> setOfSampleArray = new HashSet<Integer>();

		for (int element : sampleArray) {

			if (setOfSampleArray.add(element) == false) {

				System.out.println(element);
			}
		}

		scan.close();

	}
}
