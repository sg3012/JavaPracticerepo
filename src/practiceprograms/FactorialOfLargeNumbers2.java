package src.practiceprograms;

import java.math.BigInteger;

// This class calculates Big Factorials

// METHOD 2: This method implements the logic using
// BigInteger class in JAVA and some comparisons

public class FactorialOfLargeNumbers2 {

	public static BigInteger factorial(int num) {
		if (num < 0) {
			return BigInteger.valueOf(-1);
		} else if (num == 0) {
			return BigInteger.valueOf(1);
		} else {
			BigInteger result = BigInteger.valueOf(1);
			for (int i = 1; i <= num; i++) {
				result = result.multiply(BigInteger.valueOf(i));
			}
			return result;
		}
	}

	public static void main(String[] args) {
		BigInteger factorial = factorial(100);
		if (factorial.intValue() < 0) {
			System.out.println("Factorial of Negative numbers is not defined!. Please enter a valid number");
		} else {
			System.out.println(factorial);
		}
	}
}
