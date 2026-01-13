package src.practiceprograms.importantinterviewquestions.programs;

import java.util.ArrayList;

public class RotateArrayElements {
	// WAP in JAVA to rotate Array elements based on the number
	// of elements to be rotated by user.
	// For e.g.The input array is {1,0,4,0,2,1,5,0}, number of elements to be rotated(n) is 2
	// and the output array should be {4,0,2,1,5,0,1,0}

	public static void main(String[] args) {
		int arr[] = {1,0,4,0,2,1,5,0}; //{15,25,19,18,21,35,12,14,10,6} 

		int n = 2; // Number of elements to be shifted from the left most side to the right

//		// METHOD 1 | BEGINNER | BRUTE FORCE - USING ARRAY LIST AND SIMPLE LOOPS COMBINATION 
//		// | EASY TO UNDERSTAND | (TO BE TOLD IN INTERVIEW)
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		
//		// Put the elements to be shifted in an Array list
//		for (int i = 0; i < n; i++) {
//			list.add(arr[i]);
//		}
//		
//		// Count variable is to control how many elements will be shifted in the original
//		// array to different positions. Initially it will be equal to
//		// the number of elements to be displaced. So, that
//		// we can shift non-displacing element(s) just after the last
//		// element to be displaced (n+1)th index towards the left to the array
//		int count = n;
//		for (int i = 0; i <= arr.length - n; i++) {
//			// If i equals length-n (let's say 6 if n is 2 in array of length 8)
//			// it means first length-n elements were already shifted and copied
//			// to first length-n positions. Now, we will copy remaining elements
//			// (actually to be shifted) to the right of already copied elements
//			// using the loop in if condition below.
//			if (i == arr.length - n) {
//				count = 0;
//				for (int j = i; j < arr.length; j++) {
//					arr[j] = list.get(count);
//					count++;
//				}	
//			} 
//			// Else if first length-n elements are not shifted to first length-n
//			// positions please shift and copy them.
//			else {
//				arr[i] = arr[count];
//				count++;
//			}
//		}
//		
//		// Print the resultant array with shifted elements
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]);
//			if(i!=arr.length-1) {
//				System.out.print(",");
//			}
//		}
		
		// METHOD 2 | INTERMEDIATE | USING TEMP ARRAY AND SIMPLE LOOPS COMBINATION
		// EASY TO UNDERSTAND | (TO BE TOLD IN INTERVIEW)
		
		// We are normalizing number of elements to be displaced
		// here using modulo. So, that we don't encounter unnecessary errors
		// while running the program. And this is mostly for the cases
		// when n is greater than array length.
		// For e.g. if n is 10 and array length is 8 then 10%8
		// will give 2 as remainder. Which means we have to rotate
		// only 2 elements in the end after all 8 elements are rotated.
		n = n%arr.length;
		// Temp array for storing elements to be displaced from
		// the left. In this example we need to displace
		// 1,0 from the left and put them towards end
		// given n = 2.
		int temp[] = new int[n];
		
		// Putting number of elements to be displaced from
		// the left towards the end, in the temp array
		for(int i = 0; i<n; i++) {
			temp[i] = arr[i];
		}
		
		// Putting the elements not to be displaced
		// in the beginning of the original array,
		// starting from the position after the last element 
		// which is shifted towards right i.e., i+n
		for(int i = 0; i<arr.length-n; i++) {
			arr[i] = arr[i+n];
		}
		
		// Adding the elements to be shifted to the right
		// after the position where
		// last non-shifting element was placed in the original
		// array i.e., arr.length - n + i, in the original array
		for(int i = 0; i<n; i++) {
			arr[arr.length - n + i] = temp[i];
		}
		
		// Printing the changed original array
		System.out.println("Array after Shuffle:");
		for(int j =0; j<arr.length; j++) {
			System.out.print(arr[j]);
			if(j!=arr.length-1) {
				System.out.print(",");
			}
		}
	}

}
