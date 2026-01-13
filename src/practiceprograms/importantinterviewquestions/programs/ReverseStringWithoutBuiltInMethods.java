package src.practiceprograms.importantinterviewquestions.programs;
import java.util.Scanner;

// WAP in JAVA to Reverse a String without using any built-in
// reverse function
public class ReverseStringWithoutBuiltInMethods {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// METHOD 1 : USING AN EMPTY STRING AND APPENDING ORIGINAL 
		// STRING IN REVERSE ORDER TO IT | (TO BE TOLD IN INTERVIEW)
		System.out.println("Enter a String of your choice:");

		String originalString = scan.nextLine();

		scan.close();

		String reverseString = "";

		for(int i = (originalString.length()-1); i>=0; i--) {

			reverseString = reverseString + originalString.charAt(i);

		}

		System.out.println("Reverse String: "+reverseString);
	}

}
