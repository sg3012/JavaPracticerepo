package src.practiceprograms.importantinterviewquestions.programs;

import java.util.ArrayList;
import java.util.List;

public class PrintoneToHundred {
// WAP in JAVA to print the numbers between 1 to 100
// without using loops

//	// METHOD 1 | INTERMEDIATE | USING RECURSSION AND THE METHOD
//	// RETURNING THE LIST OF NUMBERS | EASY TO UNDERSTAND |
//	// TO BE TOLD IN INTERVIEW
//	public static List<Integer> printNumbers(int num) {
//		List<Integer> numbers = new ArrayList<Integer>(); // creating
//		// an empty list of numbers each time the 
//		// method is called recursively
//		if (num <= 100) { // if num<=100
//			numbers.add(num); // first add the number in the list
//			List<Integer> remainingList = printNumbers(num + 1); // create
//			// a separate list of numbers to hold the list
//			// of numbers returned in every
//			// recursive method call
//			numbers.addAll(remainingList); // adding this second list returned 
//			// by the previous recursive call to the current
//			// method call instance's first list
//		}
//		return numbers;
//	}

	// METHOD 1 | INTERMEDIATE | USING RECURSSION AND THE METHOD
	// DISPLAYING THE LIST OF NUMBERS IN THE METHOD ITSELF | EASY TO UNDERSTAND |
	// TO BE TOLD IN INTERVIEW
	public static void printNumbers(int num) {
		if (num <= 100) {
			System.out.print(num); // printing the respective number
			// right in the method
			if(num<100) {
				System.out.print(",");
			}
			num++;
			printNumbers(num);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1;
		printNumbers(num);
	}

}
