package src.practiceprograms;

// WAP to count number of digits after decimal/dot(.)
// in a decimal number
// For e.g.: For a number 112.8745 number
// of digits after decimal are 4.

public class DigitsAfterDecimal {

	public static void main(String[] args) {
		double number = 45888.65941354;
		String strNum = String.valueOf(number);

		String subStr = strNum.substring(strNum.indexOf('.')+1, strNum.length());
		System.out.println("Digits after decimal: "+subStr.length());

	}

}
