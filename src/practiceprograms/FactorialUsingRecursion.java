package src.practiceprograms;

import java.util.Scanner;

// Write a program to find the factorial of a number using recursion
// Symbol of factorial is exclamation mark (!).
// Following is the technique to calculate factorial of a number :
// For e.g : 5! = 5x4x3x2x1 = 120
// 4! = 4x3x2x1 = 24

public class FactorialUsingRecursion {

    private static Scanner scan = new Scanner(System.in);

    public static long calculateFactorial(long number) {

        if(number == 1 || number ==0){ // if number is 1 or 0 then return 1
                                       // as factorial of 1 or 0 is 1

            return 1;

        }

        else {

            return number * calculateFactorial(number-1); // this is
             // recursive call to the function calculateFactorial
            //  until the number becomes 1 or 0
            //  and 1 is returned by the if statement.

        }
    }

    public static void main(String args[]){

        long num, factorial;

        System.out.println("Enter a number of your choice:");

        num = scan.nextInt();

        scan.close();

        System.out.print(num+"!= ");

        factorial = calculateFactorial(num);

        System.out.print(factorial);

    }
}
