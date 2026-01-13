package src.practiceprograms.importantinterviewquestions.programs;
import java.text.*;

public class StringLengthWithoutUsingFunction {
	// Write a program to find the length of a string without using length().
	public static void main(String[] args) {
		String str = "This $ is an $ automation $ interview";
//		// METHOD 1: USING SIMPLE LOOPS AND COUNT | (TO BE TOLD IN INTERVIEW)
//		int count = 0;
//		char[] charArr = str.toCharArray();
//		for(int i = 0; i<charArr.length; i++) {
//			count++;
//		}
//		System.out.println("String length: " +count);
		
		// METHOD 2: USING STRING CHARACTERITERATOR | (TO BE TOLD IN INTERVIEW)
		CharacterIterator iterator = new StringCharacterIterator(str);
		int lastIndex = iterator.getEndIndex();
		
		System.out.println("String length: "+lastIndex);

	}

}
