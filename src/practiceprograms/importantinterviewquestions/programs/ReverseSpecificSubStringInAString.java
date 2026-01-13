package src.practiceprograms.importantinterviewquestions.programs;

public class ReverseSpecificSubStringInAString {

	// Given a String - we have to only reverse some sub-string inside
	// it keeping rest of the string same.
	// For e.g. : Consider the string - "Today is my interview"
	// You have to reverse only the word "my" to "ym"
	// keeping rest of the string as it is.
	// So, the output should be "Today is ym interview"
	// Now, we have to keep in mind that the sub-string to reverse
	// may have multiple occurrences in the main string and
	// interviewer may ask to reverse only a particular occurrence.
	// Below solutions are crafted keeping this in mind.

	public static void main(String[] args) {
		String str1 = "Today is my interview";
		// The sub-string which we need to reverse
		String subStrToReverse = "my";
		// The occurrence of the sub-string
		// from where we have to split the main string
		int occurrenceNumber = 1;

//		METHOD 1 | BEGINNER | USING INDEXOF, SUBSTRING AND STRING SPLIT COMBINATION| 
//		EASY TO UNDERSTAND | (TO BE TOLD IN INTERVIEW)

//		// Variable to keep track of
//		// the index from where we have to start finding 
//		// the next occurrence of
//		// the sub-string to reverse
//		int searchStartIndex = 0;
//		// Variable to keep track of
//		// how many times the sub-string has been found till now
//		int foundCount = 0;
//		// Variable to keep track of
//		// the index where we have
//		// found the desired occurrence of the sub-string
//		// and now want to split the main string from this
//		// point. But this position keeps on changing
//		// until we find the desired index of the sub-string
//		// where we want to split main string from
//		int splitPosition = -1;
//
//		// Loop through the main string,
//		// find the desired occurrence and
//		// index of the sub-string from
//		// where we have to split the main
//		// string
//		for (int i = 0; i < occurrenceNumber; i++) {
//			splitPosition = str1.indexOf(subStrToReverse, searchStartIndex);
//
//			if (splitPosition == -1) {
//				break;
//			}
//
//			foundCount++;
//			searchStartIndex = splitPosition + 1;
//		}
//
//		if (splitPosition == -1 || foundCount < occurrenceNumber) {
//			System.out.println("The desired occurrence number " + occurrenceNumber + " for the substring " + "'"
//					+ subStrToReverse + "'" + " not found");
//		} else {
//			// Splitting main string from the splitting point
//			// around the desired sub-string
//			String beforeSplit = str1.substring(0, splitPosition);
//			String afterSplit = str1.substring(splitPosition + subStrToReverse.length());
//			
//			// Removing any leading and trailing spaces
//			// from the split strings
//			beforeSplit = beforeSplit.trim();
//			afterSplit = afterSplit.trim();
//
//			// Below loop code reverse the desired sub-string
//			String reverse = "";
//			for (int i = subStrToReverse.length() - 1; i >= 0; i--) {
//				reverse = reverse + subStrToReverse.charAt(i);
//			}
//			// reconstructing the main string
//			// again by appending the split string
//			// before and after the sub-string along with 
//			// the reversed sub-string
//			str1 = beforeSplit + " " + reverse + " " + afterSplit;
//			System.out.println(str1);
//		}
		
//		METHOD 2 | INTERMEDIATE | USING INDEXOF, SUBSTRING AND STRING SPLIT COMBINATION| 
//		EASY TO UNDERSTAND | (TO BE TOLD IN INTERVIEW)
		if (str1.isEmpty() || subStrToReverse.isEmpty() || occurrenceNumber < 1) {
			System.out.println(
					"Invalid Input. Original string and substring must be non-empty and occurrence must be atleast 1");
		}

		else {

			// Variable to keep track of
			// the index from where we have to start finding 
			// the next occurrence of
			// the sub-string to reverse
			int searchStartIndex = 0;
			// Variable to keep track of
			// how many times the sub-string has been found till now
			int foundCount = 0;
			// Variable to keep track of
//			// the index where we have
//			// found the desired occurrence of the sub-string
//			// and now want to split the main string from this
//			// point. But this position keeps on changing
//			// until we find the desired index of the sub-string
//			// where we want to split main string from
			int splitPosition = -1;

			// Loop through the main string,
			// find the desired occurrence and
			// index of the sub-string from
			// where we have to split the main
			// string
			while (foundCount < occurrenceNumber) {
				splitPosition = str1.indexOf(subStrToReverse, searchStartIndex);

				if (splitPosition == -1) {
					break;
				}

				foundCount++;

				if (foundCount == occurrenceNumber) {
					break;
				}

				searchStartIndex = splitPosition + subStrToReverse.length();
			}

			System.out.println("Split position: " + splitPosition);

			if (splitPosition == -1 || foundCount < occurrenceNumber) {
				System.out.println("The desired occurrence number " + occurrenceNumber + " for the substring " + "'"
						+ subStrToReverse + "'" + " not found");
			}

			else {
				// Splitting main string from the splitting point
				// around the desired sub-string
				String beforeSplit = str1.substring(0, splitPosition);
				String afterSplit = str1.substring(splitPosition + subStrToReverse.length());
				System.out.println("1st part before substring: " + beforeSplit);
				System.out.println("2nd part after substring: " + afterSplit);
				beforeSplit = beforeSplit.trim();
				afterSplit = afterSplit.trim();
				
				String reverse = "";
				
				// Below loop code reverse the desired sub-string
				for (int i = subStrToReverse.length() - 1; i >= 0; i--) {
					reverse = reverse + subStrToReverse.charAt(i);
				}
				
				System.out.println("Desired substring after reverse: " + reverse);
				// reconstructing the main string
				// again by appending the split string
				// before and after the sub-string along with 
				// the reversed sub-string
				str1 = beforeSplit + " " + reverse + " " + afterSplit;
				System.out.println(str1);
			}

		}
	}

}
