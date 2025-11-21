package src.actualpractice.important;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromIntArray {
	// WAP to remove duplicates from an integer array
	// For e.g. : If array is like {1, 2, 2, 3, 4, 4, 5}
	// then the resultant array should be {1, 2, 3, 4, 5}

	public static void main(String[] args) {
		int arr[] = {1,2,2,3,4,4,5}; // Original array containing duplicates

		Map<Integer,Integer> mapOfSampleArray = new HashMap<>();
		ArrayList<Integer> listOfEle = new ArrayList<>();

		for(int e: arr) {
			if(!mapOfSampleArray.containsKey(e)) { // if an element is unique in the original
				mapOfSampleArray.put(e,1);         // array then only add that element
				listOfEle.add(e);                  // in the array list
			}
		}

		// Initializing unique array of the size
		// of array list containing unique elements
		int uniqueArr[] = new int[listOfEle.size()];
		for(int i = 0; i<uniqueArr.length; i++) {
			uniqueArr[i] = listOfEle.get(i);
		}

		// Printing the array containing unique elements
		System.out.print("Array after deleting duplicates: {");
		for(int i = 0; i<uniqueArr.length; i++) {
			System.out.print(uniqueArr[i]);
			if(i!=uniqueArr.length-1) {
				System.out.print(",");
			}
		}
		System.out.println("}");
	}
}
