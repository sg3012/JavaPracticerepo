package src.practiceprograms.importantinterviewquestions;

import java.util.Scanner;

// WAP to remove duplicate characters from a string
// i.e, it read whole String character by character
// and remove any duplicate occurrence of that character

// For e.g. The string "test automation"
// Should result into "tes auomin"
public class RemoveDuplicatesFromString {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {

		System.out.println("Enter a string:");
		// METHOD 1: USING INDEXOF METHOD | (TO BE TOLD IN INTERVIEW) 
		String originalString = scan.nextLine(); // abacaadf

		originalString = originalString.toLowerCase().trim();
		// we are converting this original string in lowercase
		// so that which comparing the characters in the original
		// string from the clean string JAVA doesn't treat upper
		// and lower case characters differently. Also, we are trimming
		// so that we get a clean string for comparison removing all
		// trailing and leading spaces.

		scan.close();

		String cleanString="";

		// This code block of loop below will iterate over original string
		// and append a character from the original string
		// to the clean string only if it is not
		// present in the clean string already.
		for(int i=0; i<originalString.length(); i++) {

			char charAtPos = originalString.charAt(i);

			if(cleanString.indexOf(charAtPos)<0) { // index of method will return
				// -1 if a particular character is not present in a specified string.
				// So here, if a particular character is not present in the
				// clean string then this if block will append the character
				// from original string to the clean string.

				cleanString = cleanString+charAtPos;
			}
		}

		System.out.println("Clean String:"+cleanString);
	}

}
