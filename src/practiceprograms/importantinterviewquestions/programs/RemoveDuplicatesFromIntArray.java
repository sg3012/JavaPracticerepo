package src.practiceprograms.importantinterviewquestions.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromIntArray {
	// WAP to remove duplicates from an integer array
	// For e.g. : If array is like {1, 2, 2, 3, 4, 4, 5}
	// then the resultant array should be {1, 2, 3, 4, 5}

	public static void main(String[] args) {
		int arr[] = {1, 2, 2, 3, 4, 4, 5};
		
		// METHOD 1: USING ARRAYLIST AND MAP COMBINATION | (TO BE TOLD IN INTERVIEW)
		Map<Integer,Integer> mapOfArray = new HashMap<>();
		ArrayList<Integer> listOfEle = new ArrayList<Integer>();
		for(int e : arr) {
			 if(!mapOfArray.containsKey(e)){     // if the map doesn't contain the key
			  mapOfArray.put(e, 1);		        // represented by element in the array then only
			  listOfEle.add(e);                 // add it in the arrayList. Otherwise skip it.
			 }
		}
		System.out.println("Array list of uniques: "+ listOfEle);
		System.out.println("Map of uniques: "+ mapOfArray);

		int uniqueArr[] = new int[listOfEle.size()];

		// Converting array list of unique elements
		// to pure array by adding elements from it
		// in the array using loop
		for(int i = 0; i<uniqueArr.length; i++) {
			uniqueArr[i] = listOfEle.get(i);
		}

		// printing the array from list
		// using for loop
		System.out.print("Array after removing duplicates: {");
		for(int i = 0; i<uniqueArr.length; i++) {
			System.out.print(uniqueArr[i]);
			if(i!=uniqueArr.length-1) {
				System.out.print(","); // only print commas if i is not equal to
				                       // the last index of array i.e. only before the
				                       // last element
			}
		}
		System.out.print("}");
	}
}
