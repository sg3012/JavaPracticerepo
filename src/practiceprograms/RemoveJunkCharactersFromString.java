package src.practiceprograms;

import java.util.Scanner;

// Junk character could be anything which is unwanted in a string
// It could mean special symbols on the keyboard or symbols
// of a language other than English
// In this program we will remove all the characters in a string
// except alphabets in English and digits

public class RemoveJunkCharactersFromString {
	
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a String of your choice:");
		
		String str = scan.nextLine();
		
		scan.close();
		
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(str);
		

	}

}
