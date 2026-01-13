package src.practiceprograms.importantinterviewquestions.programs;

import java.util.HashMap;
import java.util.Map;

// Write a program to check whether 2 strings are Anagram or not.
// An anagram is a word or phrase formed by rearranging the
// letters of a different word or phrase, typically using all
// the original letters with the same frequency as in the original string

// NOTE: FREQUENCY OF LETTERS must be same in both strings for
// them to be considered Anagram. Otherwise, they will not
// be Anagram
// For example :
// “abcd” and “dabc” are anagram of each other
// "aacd" and "daca" are anagram of each other.
// "abcd" and "dabbc" are not anagram of each other because
// b is occurring one time in 1st string and 2 times in second.

public class AnagramString {
	public static void main(String args[]) {
		String str1 = "abcd"; 
		String str2 = "dabc";
		
		System.out.println("STRING 1: "+ str1);
		System.out.println("STRING 2: "+ str2);
		
//		METHOD 1 | BEGINNER | USING SIMPLE STRING FUNCTIONS AND LOOPS | 
//		EASY TO UNDERSTAND | (TO BE TOLD IN INTERVIEW)
		// Removing all the white spaces from both the strings
		String cleanStr1 = str1.replaceAll(" +", "").toLowerCase();
		String cleanStr2 = str2.replaceAll(" +", "").toLowerCase();
		boolean flag = false;

		// Check if the length of the 2 Strings is equal or not(FREQUENCY OF LETTERS IN
		// BOTH STRINGS).
		// If not the strings cannot be Anagram.
		if (cleanStr2.length() != cleanStr1.length()) {
			System.out.println(str2 + " is not an Anagram of " + str1+" because length of both the strings are different");
		}
		else {
			// Compare each character from the 1st
			// String with the second String
			// using contains() method
			for (int i = 0; i < cleanStr1.length(); i++) {
				System.out.println("Comparing " + cleanStr1.charAt(i) + " with " + cleanStr2.charAt(i) + "....");
				if (cleanStr2.contains(String.valueOf(cleanStr1.charAt(i)))) {
					flag = true;
				} 
				else {
					break;
				}
			}
		}
		
		// After getting the value from the if-else block
		// above (true or false). We will create a map, store the count
		// of each character from the first string and then subtracting the
		// count of the same character from the second and storing
		// it's value in the same map as a value of concerned key.
		// Here, key will be each character from either of the strings.
		Map<Character,Integer> countsOfChar = new HashMap<Character,Integer>();
		if(flag) {
			// Storing the count of each character
			// from the first string in the map
			Integer count = null;
			for(int i =0; i<cleanStr1.length(); i++) {
				count = countsOfChar.get(cleanStr1.charAt(i));
				if(count == null) {
					countsOfChar.put(cleanStr1.charAt(i),1);
				}
				else{
					countsOfChar.put(cleanStr1.charAt(i),count+1);
				}
			}
			// Subtracting the count of the same character
			// from second string in the same map.
			for(int j =0; j<cleanStr2.length(); j++) {
				count = countsOfChar.get(cleanStr2.charAt(j));
				if(count == null) {
					countsOfChar.put(cleanStr2.charAt(j),-1); // if either of the character
					// from the first string is not there in the map then store the value "-1"
					// against it.
				}
				else{
					countsOfChar.put(cleanStr2.charAt(j),count-1); // else 
					// subtract -1 from the already existing count
					// value against that character which was inserted
					// when we iterated first string and same
					// character was encountered.
				}
			}
		}
		
		// After adding counts for each character
		// in both the strings, if the count
		// value (Here it is represented by e)
		// is either null or not equals 0
		// it means that character was not there
		// in first String. We mark flag false in such case
		// and break from if and loop.
		// Else it will be true which is coming from above if.
		for(Integer e :countsOfChar.values()) {
			if(e==null || e!=0) {
				flag = false;
				break;
			}
		}
		if(flag) {
			 System.out.println(str2 + " is an Anagram of " + str1);
		}
		else {
			 System.out.println(str2 + " is not an Anagram of " + str1);
		}
	}
}
