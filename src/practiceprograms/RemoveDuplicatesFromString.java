package src.practiceprograms;

import java.util.Scanner;

// WAP to remove duplicate characters from a string
// i.e, it read whole String character by character
// and remove any duplicate occurrence of that character

// For e.g. The string "test automation in selenium test automation"
// Should result into "tes auominl"
public class RemoveDuplicatesFromString {
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		System.out.println("Enter a string:");
		
		String originalString = scan.nextLine();
		
		scan.close();
		
		String cleanString="";
		
		for(int i=0; i<originalString.length(); i++) {
			
			char charAtPos = originalString.charAt(i);
			
			if(cleanString.indexOf(charAtPos)<0) {
				
				cleanString = cleanString+charAtPos;
			}
		}
		
		System.out.println("Clean String:"+cleanString);
	}

}
