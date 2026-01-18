package src.practiceprograms.importantinterviewquestions.programs;

public class ReverseWordsInStringArray {
	
	// Given a string array we have to write
	// a program in JAVA to reverse all words
	// in the Array at their respective positions.
	
	// For e.g. - if their is an Input string array like
	// {"Java", "Python", "Csharp"}
	// then the output array should be {"avaJ", "nohtyP", "prahsC"}

	public static void main(String[] args) {
		
		// String array before reversal
		String [] arrOfWords = {"Java", "Python", "Csharp"}; 
		
		// Outer loop to traverse the original array
		// word by word at each index and reversing each word at 
		// the respective index using the inner loop
		for(int i =0; i<arrOfWords.length; i++) {
			String word = arrOfWords[i]; // storing each word at the original
			// string array inside this string word variable
			
			String reverse = ""; // this variable to store the reverse
			// of each word. And when the word is reversed using
			// the inner loop below then assign this variable back to empty
			// string
			
			// Below inner loop is to actually traverse each
			// word in the array and then reverse it by traversing
			// from the last index
			for(int j =word.length()-1; j>=0; j--) {
				reverse = reverse + word.charAt(j);
			}
			arrOfWords[i] = reverse; // after reversing each word in the array
			// at each respective index, assigning the same reversed word
			// back to the same respective index in the initial array as 
			// it was in the original form
		}
		
		// traversing the changed array now and printing
		// each element/word in the reversed form
		for(int i =0; i < arrOfWords.length; i++) {
			System.out.println(arrOfWords[i]);
		}

	}

}
