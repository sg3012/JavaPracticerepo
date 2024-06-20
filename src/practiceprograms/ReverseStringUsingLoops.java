package src.practiceprograms;
import java.util.Scanner;

// WAP in JAVA to Reverse a String without using any built-in
// reverse function
public class ReverseStringUsingLoops {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a String of your choice:");

		String originalString = scan.nextLine();

		scan.close();

		String reverseString = "";

		for(int i = (originalString.length()-1); i>=0; i--) {

			reverseString = reverseString + originalString.charAt(i);

		}

		System.out.println("Reverse String:"+reverseString);
	}

}
