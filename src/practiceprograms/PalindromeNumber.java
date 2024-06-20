package src.practiceprograms;

import java.util.Scanner;

// WAP to check whether a given number is Palindrome or not.
// Palindrome number is a number which remains unchanged when
// its digits are reversed.

// For example : using a simple number 252 and the decimal
// system, we see that if we reverse the digits then number
// is still 252. Hence, it is palindrome number.

public class PalindromeNumber {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {
        long number, temp, remainder;

        System.out.print("Enter a number: ");

        temp = scan.nextLong();

        scan.close();

        number = temp;

        long sum = 0;

        while (temp > 0) {

            remainder = temp % 10;

            sum = (sum * 10) + remainder;

            temp = temp / 10;
        }

        if (sum == number) {

            System.out.println("The number is a Palindrome");
        }

        else {

            System.out.println("The number is not a Palindrome");
        }
    }

}
