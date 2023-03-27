package src.practiceprograms;

import java.util.Scanner;

// WAP to check whether a given number is Armstrong or not.
// Armstrong number definition is the number in any given 
// number base, which forms the total of the same number, 
// when each of its digits is raised to the power of the number 
// of digits in the number.

// For example : using a simple number 153 and the decimal 
// system, we see there are 3 digits in it. If we do a simple 
// mathematical operation of raising each of its digits to the 
// power of 3, and then totalling the sum obtained, we get 153.
// So, 153 is an Armstrong number.

public class ArmstrongNumber {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {


        // We have used double data type for Remainder and numberOfDigits
        // because pow() function takes both arguments as double type. 
        double numberOfDigits = 0, remainder;

        // We have used long to store large integers.
        long number, temp;

        System.out.println("Enter a number of your choice:");

        temp = scan.nextLong();

        number = temp;

        // Finding the length of the number.
        // if > 10 then print a message and exit from the program
        // if <=10 then go ahead and check if it's armstrong or not.
        while (number != 0) {

            number = number / 10;

            numberOfDigits++;

        }

        if (numberOfDigits > 10) {

            System.out.println("Only numbers less than 10 digits are allowed");

        }

        else {

            double sum = 0;

            number = temp; // here we have assigned the value of temporary variable to original
                           // number as temp is getting changed in the loop which will eventually
                           // become 0 and will not be equal to sum ever.

            while (temp != 0) {

                remainder = temp % 10;

                temp = temp / 10;

                sum = sum + Math.pow(remainder, numberOfDigits);

                System.out.println("Sum inside loop:"+sum);

            }

            if ((int) sum == number) { // Typecasting double sum value to int sum value

                System.out.println(number+" is an Armstrong number");

            }

            else {

                System.out.println(number+" is not an Armstrong number");

            }

        }

        scan.close();

    }
}
