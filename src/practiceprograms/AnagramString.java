package src.practiceprograms;

import java.util.Arrays;
import java.util.Scanner;

// Write a program to check whether 2 strings are Anagram or not.
// An anagram is a word or phrase formed by rearranging the
// letters of a different word or phrase, typically using all
// the original letters with the same frequency as in the original string
// For example :
// “abcd” and “dabc” are anagram of each other
// "aacd" and "daca" are anagram of each other.
// "abcd" and "dabbc" are not anagram of each other.

public class AnagramString {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {

		String str1, str2;

		char ch1[], ch2[];

		boolean flag = false;

		System.out.println("Enter String1:");

		str1 = scan.nextLine();

		System.out.println("Enter String2:");

		str2 = scan.nextLine();

		// Removing all the white spaces from both the strings
		str1 = str1.replaceAll("\\s", "");

		str2 = str2.replaceAll("\\s", "");

		// Check if the length of the 2 Strings is equal or not.
		// If not the strings cannot be Anagram.

		if (str2.length() != str1.length()) {

			System.out.println(str2 + " is not an Anagram of " + str1);
		}

		else {

			// Converting the whole string to lower case
			// and storing in character array because if we don't do it
			// then 'R' will not be equal to 'r'.

			ch1 = str1.toLowerCase().toCharArray();

			ch2 = str2.toLowerCase().toCharArray();

			// Sort the two Strings

			Arrays.sort(ch1);

			Arrays.sort(ch2);

			// Compare each character from the 1st
			// String with the second String

			for (char element : ch1) {

				for (char element2 : ch2) {

					if (element != element2) {

						flag = false;

					}

					else {

						flag = true;

					}
				}
			}

			if (flag) {

				System.out.println(str2 + " is the Anagram of " + str1);
			}

			else {

				System.out.println(str2 + " is not the Anagram of " + str1);
			}

//            int stringCharacterCountTracker1[] = new int[26];
//
//            int stringCharacterCountTracker2[] = new int[26];

//            for(int i=0; i < str1.length(); i++){
//
//                 int index = stringCharacterCountTracker1[str1.toLowerCase().charAt(i) - 'a'];
//
//                System.out.println("Value at index "+ i+" " +str1.toLowerCase().charAt(i));
//
//                // System.out.println("ASCII value at index "+i+" "+stringCharacterCountTracker1[str1.charAt(i)]);
//
//                System.out.println("Index resolved " + (str1.toLowerCase().charAt(i) - 'a'));
//
//                index++;
//
//                System.out.println("Index increment "+index);
//
//
//        }
		}

		scan.close();

	}
}
