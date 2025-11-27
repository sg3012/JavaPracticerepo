package src.practiceprograms.important;

public class OnlyOneRepeatedString {
//	Given a string like “This $ is an $ automation $ interview”. You have to 
//	change this string in such a way that it only contains one occurrence 
//	of $, rest all occurrences will be removed. So, the output string 
//	should be “This $ is an automation interview”.

	public static void main(String[] args) {
		String str = "This $ is an $ automation $ interview";
		// Find the index of first dollar
		int firstDollarIndex = str.indexOf('$'); 
		
		// Find the first sub-string up to first dollar
		String firstSub = str.substring(0,firstDollarIndex+1);
		
		// Find next sub-string after the first dollar
		String secondSub = str.substring(firstDollarIndex+1,str.length());
		
		// Splitting the second SubString from dollars
		String arr[] = secondSub.split("\\$");
		
		// Iterating the array obtained after splitting
		// the second substring and appending each element
		// which is also a substring (part of second substring)
		// to the original string
		for(int i = 0; i<arr.length; i++) {
			arr[i] = arr[i].trim(); // trimming all leading and trailing
			// spaces in each element of the array
			str = firstSub+" "+arr[i];
			firstSub = str;
		}
		System.out.println("String: " + str);

	}

}
