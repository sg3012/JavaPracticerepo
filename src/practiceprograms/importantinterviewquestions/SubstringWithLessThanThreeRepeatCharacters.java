package src.practiceprograms.importantinterviewquestions;

import java.util.ArrayList;

public class SubstringWithLessThanThreeRepeatCharacters {

	// Given a string, the task is to find the length
	// of the longest substring of the string in JAVA such
	// that no three consecutive characters in the substring are same.

	// For e.g.: If we have a string like "abaaaccddghhhkkllnhnnnm"
	// Following substrings can be constructed from this string which
	// don't have 3 or more consecutive characters:
	// abaa
	// accddghh
	// hkkllnhnn
	// nm
	// The longest of all these sub-strings should be "hkkllnhnn"
	// of length 9, rest all sub-string length is less than 9.

	public static void main(String[] args) {
		String str = "abaaaccddghhhkkllnhnnnm";
		String subStr = "";

		ArrayList<String> listOfSubstr = new ArrayList<String>();
		int count = 0; 
		
		for (int i = 0; i < str.length(); i++) {
			char charAtPos = str.charAt(i);
			subStr = subStr + charAtPos;
			if (subStr.charAt(subStr.length() - 1) == charAtPos) {
				count++;
				if(count<3) {
					subStr = subStr + charAtPos;
				}
				else {
					listOfSubstr.add(subStr);
					subStr="";
					count = 0;
				}
				
			}
			else {
				subStr = subStr + charAtPos; 
			}
		}
		
		System.out.println(listOfSubstr);

	}

}
