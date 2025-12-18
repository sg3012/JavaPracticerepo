package src.practiceprograms.importantinterviewquestions;

public class SingleDigit {
	
	// Given an integer number, write a program in JAVA to
	// add the individual digits of the number until a single digit 
	// number is formed. For e.g. 
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
		
//		int a = 256;
//		int temp = a; 
//		int remainder = 0;
//		int sum=0;
		
		long a = 4589797l;
		long temp = a; 
		int remainder = 0;
		long sum=0l;
		
		// Loop through original number and find the sum of individual digits
		// of the original number
		while(temp!=0) {
			remainder = (int)temp%10; // typecasting the obtained long remainder
			                          // value in int because remainder is an int value
			sum = sum+remainder;
			temp = temp/10;
		}
		
		// Assigning sum of digits of original number
		// for further calculation on the sum obtained
		// to get the single digit number
		temp = sum;
		
		// Assigning sum back to 0 again to recalculate
		// the sum of digits of the number obtained from the
		// adding digits of original number
		sum = 0;
		
		// Loop through the sum obtained by adding digits of original
		// number and add it's digits until we get the final single digit number
		while(sum <= 9 && temp!=0) {
			remainder = (int)temp%10; // typecasting the obtained long remainder
                                      // value in int because remainder is an int value
			sum = sum+remainder;
			temp = temp/10;
		}
		
		System.out.println("Sum:"+sum);
	}
}