package src.practiceprograms.importantinterviewquestions.programs;

public class SubstringWithLessThanThreeRepeatCharacters {

	// Given a string, the task is to find the length
	// of the longest substring of the string in JAVA such
	// that no three consecutive characters in the substring are same.

	// For e.g.: If we have a string like "aaab"
	// Following substrings can be constructed from this string which
	// don't have 3 or more consecutive characters from any starting point:

	// FROM INDEX 0 AS STARTING POINT:
	// aa

	// FROM INDEX 1 AS STARTING POINT:
	// aab

	// FROM INDEX 2 AS STARTING POINT:
	// ab

	// FROM INDEX 3 AS STARTING POINT:
	// b
	// The longest of all these sub-strings should be "aab"
	// of length 3, rest all sub-string length is less than 3.

	public static void main(String[] args) {
		String str = "aabbbcd";

//		// [BEGINNNER] | USING SIMPLE LOOPS, TRACKING VARIABLES AND
//		// STRING FUNCTIONS | EASY TO UNDERSTAND | TIME COMPLEXITY - O(n^2) 
//		// | TO BE TOLD IN INTERVIEW
//		int maxLength = 0; // variable to track the maximum length sub-string. Initially 0 
//		int bestStart = 0; // variable to track next best start index where we can start finding
//		                   // the next sub-string from
//		int bestEnd = 0;   // variable to track next best End index where we can stop building
//        					   // this sub-string at
//		
//		// Outer-loop to start at a particular point
//		// in the main string so that we can find all
//		// sub-strings lengths, starting and ending indices from 
		// this point until the end of main string
//		for (int start = 0; start < str.length(); start++) {
//			// initializing consecutiveCount to 1
//			// at the start of every outer loop
//			// iteration assuming that every character
//			// at the starting index will count for at least one
//			// character in the next sub-string
//			int consecutiveCount = 1;
//			
//			// Inner-loop to start from a particular index/starting point
//			// as given by the outer loop in the main string
//			// and build maximum lengths of all possible
//			// sub-string from that starting point.
//			for (int end = start; end < str.length(); end++) {
//				
//				// This condition checks if we have moved
//				// forward from the starting point
//				// as given by the outer-loop or not
//				if (end > start) {
//					// If above if is true then do the following
//					char currentChar = str.charAt(end); // current character at the index "end"
//					char previousChar = str.charAt(end - 1); // current character at the index "end-1"
//					
//					// if current character equals prev character 
//					if (currentChar == previousChar) {
//						// Then increase the consecutiveCount by 1
//						consecutiveCount++;
//					} else {
//						// else set consecutive to 1. Meaning, the current character
//						// is new compared to all characters checked till now
//						consecutiveCount = 1;
//					}
//					
//					// After above if-else blocks, check if
//					// consecutive count was >=3. This if condition
//					// will always be executed irrespective whether
//					// the if or else block executes above.
//					if (consecutiveCount >= 3) {
//						// if it was >=3 then break this inner loop
//						// because we can only allow maximum of 2 repeated
//						// characters in any sub-string we build
//						break;
//					}
//				}
//				
//				// After the above if block
//				// the below lines of code
//				// will always execute 
//				int currentLength = end - start + 1; // set the current sub-string
//				                                     // length to the number of characters
//				                                     // added in the sub-string so far  
//				
//				if (currentLength > maxLength) { // if current length of the sub-string
//					                             // is greater than the latest maximum length
//					                             // sub-string built so far
//					
//					maxLength = currentLength; // Then assign maxLength becomes the currentLength
//					                           // sub-string constructed so far
//					
//					bestStart = start;         // bestStart becomes the start index in the
//					                           // latest maximum length sub-string to be created
//					
//					bestEnd = end;             // bestEnd becomes the end index in the
//                    							  // latest maximum length sub-string to be created
//				}
//			}
//		}
//
//		String longestSubString = "";
//		if (maxLength > 0) {
//			// If maxLength is greater than 0
//			// then construct the final sub-string
//			// using the final bestStart and bestEnd values
//			// obtained from above loops
//			longestSubString = str.substring(bestStart, bestEnd + 1);
//		}
//
//		System.out.println("Longest sub-string: " + longestSubString);
//		System.out.println("Longest sub-string length: " + maxLength);

		// [INTERMEDIATE] | USING SIMPLE LOOPS, VARIABLE SIZE SLIDING WINDOW APPROACH | 
		// EASY TO UNDERSTAND | TIME COMPLEXITY - O(n) | TO BE TOLD IN INTERVIEW
		
		// NOTE: 
		// 1. The approach below is called VARIABLE SIZE SLIDING WINDOW approach
		// because we use 2 variables/pointers to traverse through the main string
		// and keeping track of the length and number of consecutive
		// characters in such a way that visually it looks like a window.
		// This window will keep changing it's location and size using
		// these 2 variables. That is why the name variable size sliding window.
		
		// The approach can also be called 2 pointer approach as it uses
		// 2 variables or pointers to track the characters in the string
		// from both the left and right ends.
		
		int maxLength = 1; // variable to track the maximum length sub-string. Initially 1
		                   // because we already know that the least length
		                   // sub-string that can be formed from the main string 
		                   // will be of length 1.
		
		int left = 0; // variable to track the left index of the sliding window over
		              // the main string
		
		int bestStart = 0; // variable to track next best start index where we can start finding
        					  // the next sub-string from 
		
		int bestEnd = 0;  // variable to track next best End index where we can stop building
						 // this sub-string at
		int consecutiveCount = 1; // variable to track the number of consecutive characters being added
		                          // in the current sub-string. Initially 1.

		// Loop to start at index 1 (because the left index is assigned 0 above)
		// in the main string so that we can find all
		// sub-strings lengths, starting and ending indices from this point 
		// until the end of main string.
		for (int right = 1; right < str.length(); right++) { // the right variable inside the loop
			// here will serve 2 purpose:
			                                                 // - track the character to the right of the current left index.
			                                                 // - track the size of the sliding window over characters.
			
			char currentChar = str.charAt(right); // current character at the index "right"
			
			char previousChar = str.charAt(right - 1); // previous character at the index "right-1"
			
			// if current character equals prev character
			if (currentChar == previousChar) {
				// Then increase the consecutiveCount by 1
				consecutiveCount++; 
			} else {
				// else set consecutive to 1. Meaning, the current character
				// is new compared to all characters checked till now
				consecutiveCount = 1;
			}
			
			// After above if-else blocks, check if
			// consecutive count was >=3. This if condition
			// will always be executed irrespective whether
			// the if or else block executes above.
			if (consecutiveCount >= 3) {
				left = right - 1; // if the consecutive characters count becomes
				                  // greater than or equal to 3 then move
				                  // the left index of the window just one index
				                  // before the current right index (value of the variable right) 
				                  // so that adding the character at the current index
				                  // will not exceed the limit of only 2 consecutive characters
				                  // in the current window/sub-string.
				
				consecutiveCount = 2; // update the consecutiveCount to 2
				                      // because moving the value of left index
				                      // just before the current right index
				                      // will always make the current window
				                      // length to 2. (VISUALIZE THESE 2 STEPS WITH THE HELP
				                      // OF A DRY-RUN TO UNDERSTAND CLEARLY)
			}

			int currentWindowSize = right - left + 1; // set the current sub-string/window
                                                      // length to the number of characters
                                                      // added in the sub-string so far
			
			if (currentWindowSize > maxLength) { // if current length of the window
                                                 // is greater than the latest maximum length
                                                 // sub-string built so far
				
				maxLength = currentWindowSize;  // then assign currentLength to maxLength
				
				bestStart = left;              // bestStart becomes the start index in the
                                               // latest maximum length sub-string to be created
            
				bestEnd = right;              // bestEnd becomes the end index in the
				                              // latest maximum length sub-string to be created
			}
		}
		
		String longestSubString = str.substring(bestStart,bestEnd+1);
		System.out.println("Longest sub-string: " + longestSubString);
		System.out.println("Longest sub-string length: " + maxLength);
	}

}
