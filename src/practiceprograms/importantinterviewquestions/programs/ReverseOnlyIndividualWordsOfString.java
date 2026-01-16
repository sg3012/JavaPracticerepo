package src.practiceprograms.importantinterviewquestions.programs;

public class ReverseOnlyIndividualWordsOfString {

	// Given a string we have to reverse only the individual words
	// in the string not the complete string i.e., if a word
	// was at index 1 then it should remain at index one but
	// in a reversed state. For e.g. if the original string is
	// "Today interview" then the output should be "yadot weivretni"
	// and not "weivretni yadot". Meaning, the only each word at
	// a respective index is reversed.

	public static void main(String[] args) {
		String originalStr = "Shubham Gupta";

//		// [BEGINNER] | TIME COMPLEXITY - O(n^2)
//		// Split main string to get individual words
//		// i.e., from spaces
//		String arrOfWords[] = originalStr.split(" ");
//		
//		// Separate string to construct the new
//		// string with reversed words
//		String reverse = "";
//		
//		// outerloop to iterate through the 
//		// array of words, assign each word
//		// to a separate string and reverse that word
//		for (int i = 0; i < arrOfWords.length; i++) {
//			// Assign each word in the array to this string variable
//			String str1 = arrOfWords[i];
//			// Iterate through this new string variable
//			// consisting of each word from main string
//			// and reverse that word
//			for (int j = str1.length() - 1; j >= 0; j--) {
//				reverse = reverse + str1.charAt(j);
//			}
//			// After each word is reversed,
//			// append it to the reverse string variable
//			// and keep appending a space at the right of 
//			// whatever words are reversed till now in 
//			// the outerloop only.
//			reverse = reverse + " ";
//		}
//		System.out.print(reverse);

		// [INTERMEDIATE] | TO BE TOLD IN INTERVIEW | TIME COMPLEXITY - O(n)
		String arrOfWords[] = originalStr.split(" ");

		// Using string builder to construct the string with
		// only words reversed
		StringBuilder reverse = new StringBuilder("");
		for (int i = 0; i < arrOfWords.length; i++) {
			String temp = arrOfWords[i];
			for (int j = temp.length() - 1; j >= 0; j--) {
				reverse.append(temp.charAt(j));
			}
			reverse.append(" ");
		}
		System.out.print(reverse);
	}

}
