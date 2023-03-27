package src.practiceprograms;

import java.util.Scanner;

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
