package src.practiceprograms;

import java.util.Scanner;

//Write a program using recursion to check 
//  whether a number is prime or not. 

public class PrimeNumberUsingRecursion {

    private static Scanner scan = new Scanner(System.in);

    public static boolean checkPrime(String number, int divisor) {

        int convertedNumber;

        if (number.equals("1") || number.equals("0") || number.contains("-")) {

            return false;

        }

        convertedNumber = Integer.parseInt(number);

        if (divisor < convertedNumber) {

            if (convertedNumber % divisor != 0) {

                return checkPrime(number, divisor + 1);
            }

            else {

                return false;
            }
        }

        // if we reach this point, it means that
        // the whole if block above was continously executed
        // until the divisor became the number itself and the number
        // is Prime.
        return true;
    }

    public static void main(String args[]) {

        String number;

        boolean checkResult;

        System.out.println("Enter a number of your choice: ");

        number = scan.nextLine();

        scan.close();

        checkResult = checkPrime(number, 2);

        if (checkResult) {

            System.out.println(number + " is a prime number");
        }

        else {

            System.out.println(number + " is not a prime number");

        }
        
    }
}
