package src.practiceprograms.importantinterviewquestions;

public class LargestPossibleNoFromAnArrayOfInt {
	
	// Given an array of integer, we have to form
	// largest possible number. Below are conditions
	// to keep in mind:
	// --> We have to use numbers from the array only.
	// --> We have to form the largest number in such a
	// way that the order of digits in each number at every
	// index in the array should be same.
	
	// For e.g: Considering an array {3,30,32,7,319},
	// the largest possible number that could be formed
	// from this array would be 733231930

	public static void main(String[] args) {
		
		// METHOD 1 - BEGINNER| USING SIMPLE LOOPS, BUBBLE SORT AND COMPARETO
		// METHOD OF STRING CLASS TO LEXICOGRAPHICALLY ORDERING THE STRINGS| EASY TO UNDERSTAND
		// | TO BE TOLD IN INTERVIEW
		
		int[] arr = {3,30,32,7,319};
		
		// BUBBLE SORTING THE ELEMENTS
		// BY CONVERTING EACH OF THE ELEMENT TO STRING
		// AND LEXICOGRAPHICALLY ORDERING EACH OF THEM USING
		// COMPARETO METHOD
		for(int i =0; i<arr.length; i++) {
			for(int j = 0; j<arr.length-1; j++) {
				String concat1 = String.valueOf(arr[j]) + String.valueOf(arr[j+1]);
				String concat2 = String.valueOf(arr[j+1]) + String.valueOf(arr[j]);
				if(concat2.compareTo(concat1) > 0) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		String result = "";
		for(int num : arr) {
			result+=num;
		}
		System.out.println("Largest possible number from the array: "+ result);

	}

}
