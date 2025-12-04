package src.practiceprograms.important;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintAlphabetAccordingtoNumbers {

	// Given a AlphaNumeric String - we have to print each character the same
	// number of times as the number written after it, in the string.
	// For e.g. - For the string "a7b11c2", a should be printed 7 seven times,
	// b should be printed 11 times, c should be printed 2 times.
	public static void main(String[] args) {
		
		// METHOD 1 | Brute Force using STRINGBUILDER | o(n+m) | (TO BE TOLD IN INTERVIEW)
		String str = "n8m0k7i10";
		StringBuilder output = new StringBuilder(); // output stringbuilder
		// object to print the final object
		int i = 0;
		
		while(i<str.length()) {
			char ch = str.charAt(i++); // taking each character of the original string
			// into ch one by one
			StringBuilder num = new StringBuilder(); // this stringbuilder
			// is for storing the number value is the form of string
			// which is coming just after previous character
			
			// This loops finds the current number value in the form
			// of string and append it to the num object
			while(i<str.length() && Character.isDigit(str.charAt(i))) {
				num = num.append(str.charAt(i));
				i++;
			}
			
			// If num length() is > 0 then assign the same length
			// after parsing to int using parseint() method to count variable 
			// else assign 0 to it.
			int count = (num.length() > 0) ? Integer.parseInt(num.toString()): 0;
			
			// Print the character count times, after which integer is coming
			for(int k = 0; k<count; k++) {
				output = output.append(ch);
			}
			
			System.out.print(output);
			output.setLength(0); // setting the length to 0
			// every time after printing previous output
			// so that it doesn't print the previous
			// appended string in the current output
			System.out.println();
		}
		
//		// METHOD 2 | USING PATTER MATCHER And STRINGBUILDER() | o(n+m) | (TO BE TOLD IN INTERVIEW)
//		Pattern p = Pattern.compile("([A-Za-z])(\\d+)");
//		Matcher m = p.matcher(str);
//		StringBuilder output = new StringBuilder();
//		while(m.find()) {
//			String ch = m.group(1);
//			int count = Integer.parseInt(m.group(2));
//			if(count > 0) {
//				output.append(ch.repeat(count));
//			}
//			System.out.print(output);
//			output.setLength(0);
//			System.out.println();
//		}	
	}

}
