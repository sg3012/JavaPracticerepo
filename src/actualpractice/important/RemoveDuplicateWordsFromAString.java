package src.actualpractice.important;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicateWordsFromAString {
	// WAP to remove duplicate words from a string
	// i.e, it read whole String word by word,
	// remove any duplicate occurrences of that word
	// and print the final string containing only unique words.
	// The final string should contain all original words
	// (repeated once also) printed only once.

	//For e.g. The string "Selenium automation using automation library"
	//Should result into "Selenium automation using library"

	public static void main(String[] args) {
		String originalString = "Selenium automation using Automation library selenium test";

		String arrofWords[] = originalString.split(" ");

		Map<String,Integer> mapofWords = new LinkedHashMap<>(); // we have used linkedHashMap
		// because it keeps the order in which elements were inserted in it.

		Integer count = null;
		for(var word : arrofWords) {
			word = word.toLowerCase();
			count = mapofWords.get(word);
			if(count==null) {
				mapofWords.put(word, 1);
			}
			else {
				mapofWords.put(word, count+1);
			}
		}

		for(var word: mapofWords.entrySet()) {
			System.out.println(word.getKey()+": "+word.getValue());
		}

		String finalString="";
		for(var word: mapofWords.entrySet()) {
			finalString = finalString+word.getKey()+" ";
		}
		System.out.println("Original String: "+originalString.toLowerCase());
		System.out.println("Final String: "+finalString);

	}

}
