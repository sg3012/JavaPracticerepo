package src.practiceprograms;

import java.util.Scanner;

// Write a program to check if a number is binary. 
// A binary number is a number expressed in the base-2 numeral 
// system or binary numeral system, a method of mathematical 
// expression which uses only two symbols: typically "0" and "1".
// So, if each digit of a number is either 0 or 1
// then it's binary else not. 

public class CheckBinaryWithMethod {

    public static boolean checkBinary(int num) {

        if (num < 0) {

            return false;

        }

        while (num > 0) { 

            // Extracting each digit of the number by repeatedly 
            // dividing it by 10 and checking the remainder
            // If the remainder is either 0 or 1 keep dividing the number
            // else return false  
            if (num % 10 == 0 || num % 10 == 1) {

                num = num / 10;

            }

            else{

                return false;
            }
        }

        return true; // If we reach this point it means we loop over
                    // all digits of the number and they are
                    // either 0 or 1. That is why control has reached this point
                    // after completing each iteration of the loop.
    }

    private static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {

        int number;

        System.out.println("Enter a number of your choice: ");

        number = scan.nextInt();

        scan.close();

        boolean result = checkBinary(number);

        if(result){

            System.out.println(number+ " is a Binary number");
        }

        else{

            System.out.println(number+ " is not a Binary number");
        }
    }

}
