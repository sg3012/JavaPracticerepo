package src.actualpractice.important;

public class RemoveDuplicatesFromString {
	// WAP to remove duplicate characters from a string
	// i.e, it read whole String character by character
	// and remove any duplicate occurrence of that character

	// For e.g. The string "test automation"
	// Should result into "tes auomin"

	public static void main(String[] args) {
		String originalString = "abacaadf testing ii kill out";
		originalString = originalString.toLowerCase().trim();
		System.out.println("Original String: "+ originalString);

		String cleanString = "";
		for(int i=0; i<originalString.length(); i++) {
			char charAtPos = originalString.charAt(i);
			if(cleanString.indexOf(charAtPos)<0) {
				cleanString = cleanString+charAtPos;
			}

			if(originalString.charAt(i)==' ') {
				cleanString = cleanString+originalString.charAt(i);
			}
		}
		System.out.println("String after duplicates removal: " + cleanString);

	}

}
