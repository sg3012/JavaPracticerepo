package src.practiceprograms;

import java.util.ArrayList;
import java.util.List;

public class StringNumericPart {

	/*
	 * WAP to extract only numeric part from an input string For e.g. get only
	 * numeric part from this String: String s =
	 * "your transaction id is:12345 and reference id is 34567";
	 */

	// METHOD 1:Function with void return type
	public void getNumericValue(String inputString) {
		for (int i = 0; i < inputString.length(); i++) {
			char c = inputString.charAt(i);
			if (c >= 48 && c <= 57) {
				System.out.print(c);
			}

			// Printing the space after each numeric value is completed
			// inside this loop in the function only
			else if ((i > 0) &&
					!(c >= 48 && c <= 57) && // i > 0 why ? control comes in this block
													  // only when c is not an
													  // integer in the first if condition
					(inputString.charAt(i - 1) >= 48 && inputString.charAt(i - 1) <= 57)) {
				if(i!=inputString.length()-1) {
					System.out.print(' ');
				}

			}
		}

	}

	// METHOD 2:Function with a list of Long integers return type
	// Below function will return a list of Long integers extracted
	// from a String
	public List<Long> getNumericValue2(String inputString) {
		String numStr= "";
		List<Long> numList = new ArrayList<>();
		for (int i = 0; i < inputString.length(); i++) {
			char c = inputString.charAt(i);
			if (c >= 48 && c <= 57) {
				if(i == inputString.length()-1) {  // This condition for the case when the last
					                               // character in the string in number. So, we are
					                               // checking if i is the last index or not. If it
					                               // is then store the value on it in the List.
					numStr = numStr+String.valueOf(c);
					numList.add(Long.parseLong(numStr));
				}

				else {
					numStr = numStr+String.valueOf(c);
				}

				System.out.println("------formation of num string first if condition ---------");
				System.out.print(numStr);
			}

			// Checking if the current character is non-numeric, previous
			// character is numeric the add the numberFormat string to the
			// list
			else if ((i > 0) && !(c >= 48 && c <= 57) // i > 0 why ? control comes in this block
																	// only when c is not an
																	// integer in the first if condition
					&& (inputString.charAt(i - 1) >= 48 && inputString.charAt(i - 1) <= 57)) {
				numList.add(Long.parseLong(numStr));
				numStr = ""; // Changing the number format String back to empty
				             // String state after adding it to the list
				             // because if we don't do it then previous number format
				             // String will be appended to this number format string,
				             // which was already added to the list
			}
		}
		return numList;
	}

	public static void main(String[] args) {
		StringNumericPart obj = new StringNumericPart();
		// obj.getNumericValue("m 121 111 21212 ansknas 4bd5e");
		List<Long> numFromStringList = obj.getNumericValue2("m 121111 ansknas 4b5");
		System.out.println("Number list size: "+numFromStringList.size());
		for(int i = 0; i<numFromStringList.size(); i++) {
			System.out.print(numFromStringList.get(i));
			if(i!=numFromStringList.size()-1) { // This condition is applied for the case when
				                                // control reaches at the end of the number list.
				                                // So, if the control is at the last index then no
				                                // need to print space, else print the space.
				System.out.print(" ");
			}
		}
	}

}
