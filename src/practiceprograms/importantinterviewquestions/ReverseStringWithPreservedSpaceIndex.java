package src.practiceprograms.importantinterviewquestions;

import java.util.ArrayList;

public class ReverseStringWithPreservedSpaceIndex {

//	Given a String - we have to reverse it in such a way that the 
//	resultant string should contain spaces at the same indices as in 
//	the original string. For e.g. - if the string is "Shubham Gupta Delhi" 
//	and contains spaces at 7th and 13th indices then the resultant reversed 
//	string should also contain spaces at 7th and 13th indices respectively
//  and output should be "ihleDat puGma hbuhS"

	public static void main(String[] args) {

		String str = "Shubham Gupta Delhi";

//		// BRUTE FORCE | USING ARRAYLIST, STRING METHODS AND LOOP
//		// COMBINATIONS | TIME COMPLEXITY - O(n^2) | TO BE TOLD IN INTERVIEW
//		String reverse = "";
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			if (ch == ' ') {
//				list.add(i);
//			}
//		}
//
//		for (int i = str.length() - 1; i >= 0; i--) {
//			if (str.charAt(i) == ' ') {
//				reverse = reverse + "";
//			} else {
//				reverse = reverse + str.charAt(i);
//			}
//		}
//
//		String reverseFinal = "";
//		int count = 0;
//		for (int j = 0; j < str.length(); j++) {
//			if (list.contains(j)) {
//				reverseFinal = reverseFinal + ' ';
//			} else {
//				reverseFinal = reverseFinal + reverse.charAt(count);
//				count++;
//			}
//		}
//		System.out.println("Original String: "+ str);
//		System.out.println("Reversed String: "+reverseFinal);

		// INTERMEDIATE | USING CHARACTER ARRAY, STRING METHODS, TWO-POINTER AND LOOP
		// COMBINATIONS | TIME COMPLEXITY - O(n) | TO BE TOLD IN INTERVIEW
		
		// creating a character array from original string
		char[] strChars = str.toCharArray();
		
		// creating this array to reverse the original string,
		// placing the non-space characters at reverse positions/indices
		// and the spaces at the same positions/indices
		// as the original string
		char[] intermediateResult = new char[str.length()]; 
		
		// This is the variable/pointer
		// that keeps track of iterations
		// on original string/character array
		// from the right-most index. It 
		// is moving from right to left.
		int j = str.length() - 1;
		
		// Loop to iterate the character array
		// placing the spaces at the same positions
		// as in the original string in the intermediate result
		// and the non-spaces at the positions
		// where they meant  to be while reversing
		// in the intermediate result. This whole 
		// loop's iterations corresponds to the
		// indices of the intermediate result array
		// which is to be built in reverse order of the original string.
		// The variable/pointer "i" is to keep
		// track of spaces from left most index.
		for(int i =0; i<str.length(); i++) {
			// Check if there is a space 
			// at some index in the original
			// string character array then place
			// the space at the same position in the
			// intermediate result array
			if(strChars[i] == ' ') {
				intermediateResult[i] = ' ';
			}
			else {
				
				// Check if there is a non-space 
				// character at some index in the original
				// string character array then start the right
				// side pointer/variable and check for spaces 
				// on the way. If there are spaces from right side
				// also then just decrement j because they are being tracked
				// by i from left side.
				while(j>=0 && strChars[j] == ' ') {
					j--;
				}
				
				// After all the spaces from the right side are skipped
				// and non-space character is encountered then
				// place that non-space character at the same
				// the corresponding ith position (as this outer loop
				// iteration) in the intermediate result character array
				intermediateResult[i] = strChars[j];
				
				// decrement j again to check remaining characters
				// in the original character array
				j--;
			}
		}
		
		// construct the final string again using
		// the string class's constructor String(char[] ch) from
		// the intermediate result character array
		String result = new String(intermediateResult);
		System.out.println("Original String: "+ str);
		System.out.println("Reversed String: "+result);

	}

}
