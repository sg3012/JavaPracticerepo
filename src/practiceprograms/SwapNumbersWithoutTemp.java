package src.practiceprograms;

import java.util.Scanner;

// Write a program to swap 2 numbers without using a temp variable

public class SwapNumbersWithoutTemp {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {

        int a, b;
        System.out.println("Enter the 2 numbers: ");

        System.out.print("a= ");

        a = scan.nextInt();

        System.out.print("b= ");

        b = scan.nextInt();

        System.out.println("Numbers after swap:");
        
           // 1. Using arithmetic addition and subtraction
            a = a+b;
            		
            b =a - b;

            a = a - b;
    
        System.out.println("a= " + a);

        System.out.println("b= " + b);
        
        //2. Using XOR operator
        // Returns 1 for X XOR Y if there are odd number of 1s i.e., 1,3,5.....so on number
        // of ones else it will return 0.
        
//        a = a ^ b;
//        
//        b = a ^ b;
//        
//        a = a ^ b;
//        
//        System.out.println("a= " + a);
//
//        System.out.println("b= " + b);

        scan.close();

    }
}
