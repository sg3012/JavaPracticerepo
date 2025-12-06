package src.practiceprograms.importantinterviewquestions;

public class OnlyOneRepeatedString {
//	Given a string like “This $ is an $ automation $ interview”. You have to 
//	change this string in such a way that it only contains one occurrence 
//	of $, rest all occurrences will be removed. So, the output string 
//	should be “This $ is an automation interview”.

	public static void main(String[] args) {
		String str = "This $ is an $ automation $ interview";
		int firstDollarIndex = str.indexOf('$');
		System.out.println("Original String: "+str);
//		METHOD 1 | BEGINNER | USING INDEXOF, SUBSTRING AND SPLIT COMBINATION | 
//		TIME COMPLEXITY = o(n^2) | EASY TO UNDERSTAND | (TO BE TOLD IN INTERVIEW)
		// Find the index of first dollar

//		if (firstDollarIndex == -1) {
//			System.out.println(
//					"No dollars exist in the original string...So " + 
//			"result string is the original string: " + str);
//
//		}
//
//		else {
//			// Find the first sub-string up to first dollar
//			String firstSub = str.substring(0, firstDollarIndex + 1);
//
//			// Find next sub-string after the first dollar
//			String secondSub = str.substring(firstDollarIndex + 1, str.length());
//
//			// Splitting the second SubString from dollars
//			String arr[] = secondSub.split("\\$");
//
//			// Iterating the array obtained after splitting
//			// the second substring and appending each element
//			// which is also a substring (part of second substring)
//			// to the original string
//			for (int i = 0; i < arr.length; i++) {
//				arr[i] = arr[i].trim(); // trimming all leading and trailing
//				// spaces in each element of the array
//				str = firstSub + " " + arr[i];
//				firstSub = str;
//			}
//			System.out.println("String: " + str);
//		}
		
//		METHOD 2 | INTERMEDIATE | USING INDEXOF AND SUBSTRING COMBINATION | 
//		TIME COMPLEXITY = o(n) | EASY TO UNDERSTAND | (TO BE TOLD IN INTERVIEW)
		if (firstDollarIndex == -1) {
			System.out.println(
					"No dollars exist in the original string...So " + 
			"result string is the original string: " + str);

		}
		else {
			// First sub-string up to first dollar occurrence
			String firstSub = str.substring(0, firstDollarIndex+1);
			
			// Second sub-string after first dollar occurrence
			String secSub = str.substring(firstDollarIndex+1);
			
			// Replacing all dollars in the 2nd sub-string 
			// with only empty string
			secSub = secSub.replace("$", "");
			
			// Replacing additional spaces created by removing
			// dollars with empty string ("") with
			// just single space in the 2nd sub-string
			secSub = secSub.replaceAll(" +", " ");
			
			// Concatenating 1st and 2nd substrings to get
			// the final string
			str = firstSub + secSub;
			
			System.out.println("Final String: "+str);
		}

	}

}
