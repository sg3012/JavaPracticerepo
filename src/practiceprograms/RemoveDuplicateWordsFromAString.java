package src.practiceprograms;

import java.util.HashMap;
import java.util.Map;

// WAP to remove duplicate words from a string
// i.e, it read whole String word by word, 
// remove any duplicate occurrences of that word
// and print the final string containing only unique words.
// The final string should contain all original words
// (repeated once also) printed only once.

//For e.g. The string "test automation using selenium test automation"
//Should result into "test automation using selenium"

public class RemoveDuplicateWordsFromAString {

	public static void main(String[] args) {
		String originalString = "test automation using Selenium test automation";

		// Split the input String into words by space
		// and storing all words in a separate array

		String arrOfWords[] = originalString.split(" ");

		// Create a HashMap to store each word in the array

		Map<String, Integer> mapOfString = new HashMap<String, Integer>();

		// Declare a Integer variable to track the count of each word in the HashMap

		Integer count = null;

		// Iterate through words array and put each word inside the map with it's
		// frequency

		for (String word : arrOfWords) {
			// convert each word to lowercase in the array
			// so that comparison would be fair

			String lowerCaseWord = word.toLowerCase();
			count = mapOfString.get(lowerCaseWord);
			if (count == null) {
				mapOfString.put(lowerCaseWord, 1);
			}

			else {
				mapOfString.put(lowerCaseWord, count + 1);
			}
		}

		// Printing each key with it's value in the Map
		for (var e1 : mapOfString.entrySet()) {
			System.out.print(e1.getKey() + ": " + e1.getValue());
			System.out.println();
		}
		
		System.out.println("-----------");

		// Create a String builder object to store the unique
		// words and create the resultant string

		StringBuilder resultantString = new StringBuilder();

		// Iterate through the map and append each key in the
		// map to the Stringbuilder

		for (var word : mapOfString.entrySet()) {

			// if a particular key has a count of 1 as well as
			// other than 1 then append it to the string builder

			resultantString.append(word.getKey()).append(" ");
		}

		// Convert the resultant Stringbuilder to String and remove any trailing spaces
		// by trimming it and store it in a final string
		String finalString = resultantString.toString().trim();

		// Print the final string with unique characters
		System.out.println("Original string: " + originalString);
		System.out.println("Final string: " + finalString);

	}

}
