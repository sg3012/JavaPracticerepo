package src.practiceprograms.importantinterviewquestions;

public class AddDigitsOfANumberUntilSingleDigit {

	// Given an integer number, write a program in JAVA to
	// add the individual digits of the number until the sum 
	// of the digits comes out to be a single digit
	// number. For e.g.
	// 1. for the number 567 add individual
	// digits first which will give the sum of digits as 18, now
	// add individual digits in 18 (1+8) which will give
	// the sum as 9. Now, stop adding because we have single digit
	// number which is the output.

	// 2. for the number 123 add individual
	// digits first which will give the sum of digits as 6, now
	// at this point we cannot add more digits to 6 as this is
	// a single digit number. So, 6 is the output.

	public static void main(String[] args) {
		long a = 567;
		long temp = a;
		long remainder = 0;
		long sum = 0;
		
		// INTERMEDIATE | USING SIMPLE LOOPS AND ARITHMETIC OPERATIONS|
		// | TIME COMPLEXITY O(logn) | TO BE TOLD IN INTERVIEW
		
		// Loop through original number and find the sum of individual digits
		// of the original number
		while (temp != 0) {
			remainder = temp % 10; 
			sum = sum + remainder;
			temp = temp / 10;
			// if at any point while calculating the sum of 
			// individual digits, the number comes out to be zero
			if (temp == 0) {
				// Then come inside if condition
				// and check whether the sum of the individual
				// digits was > 9 or not
				if (sum > 9) {
					// if sum was > 9 then again assign sum
					// to temp then repeat starting 3 lines
					// in the loop again to reduce the sum
					// to single digit number.
					temp = sum;
					sum = 0;
				}
			}
		}

		System.out.println("Sum: " + sum);
		
//		// INTERMEDIATE | USING SIMPLE LOOPS, ARITHMETIC AND STRING OPERATIONS|
//		// | TIME COMPLEXITY O(logn) | TO BE TOLD IN INTERVIEW
//		
//		// converting original input to string
//		String input = String.valueOf(a);
//		
//		if(input.startsWith("-")) {
//			input = input.substring(1);
//		}
//		
//		while(input.length() > 1) {
//			sum = 0;
//			
//			// loop through each character of the string input
//			for(char ch : input.toCharArray()) {
//				// Getting the int equivalent of each character in the
//				// string by using ASCII value of that character
//				// and subtracting the ASCII value of '0' from it.
//				// For if the character is '1' then to actually obtain
//				// (int) 1 we will subtract ASCII value of
//				// '0' i.e. 48 from ASCII value of '1' i.e. 49.
//				remainder = ch - '0';
//				sum = sum + remainder;
//			}
//			// reassigning the input to sum
//			input = String.valueOf(sum);
//		}
//		
//		System.out.println("Sum: " + input);
	}
}