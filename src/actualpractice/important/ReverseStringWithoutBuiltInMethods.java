package src.actualpractice.important;

import java.util.Objects;

public class ReverseStringWithoutBuiltInMethods {

	// WAP in JAVA to Reverse a String without using any built-in
	// reverse function

	public static void main(String[] args) {
		String originalString = "";

		if (Objects.isNull(originalString)) {
			System.out.println("Cannot reverse the String " + originalString + " because it is " + originalString);
		}

		else {
			System.out.println("Original String: " + originalString);
			int lengthOfOriginalString = originalString.length();
			if (lengthOfOriginalString == 1) {
				System.out.println("Cannot reverse the String " + originalString + " because the length is "
						+ lengthOfOriginalString);
			}

			if (originalString.isBlank()) {
				System.out.println("Blank?: " + originalString.isBlank());
				System.out.println("Cannot reverse the String " + originalString + " because it is blank");
			}
			String reverseString = "";
			for (int i = originalString.length() - 1; i >= 0; i--) {
				reverseString = reverseString + originalString.charAt(i);
			}
			System.out.println("Reverse String is: " + reverseString);
		}

	}
}
