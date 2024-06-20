package src.practiceprograms;
import java.util.Scanner;

// Write a program to check whether a number is even/odd
// without using division(/) or Modulus(%) operator.


public class EvenOddWithoutOperators {

    private static Scanner scan = new Scanner(System.in);

    public static boolean isEven(int number){

        // Method 1.
        // - Take a boolean variable named "flag" with initial value of True or False.
        // - Switch it's values between True and False "number" times.
        // - If the number is even then final value of flag becomes the Same of initial value.
        //   else it becomes opposite of initial value.

        // This solution doesn't deal with -ve numbers as such unless
        // we pass the number as String, remove minus(-) and again
        // convert it to Integer

        number  = Math.abs(number); // Function abs() of Math class
                                    // will return absolute value of the number
                                    // entered. If the number is -ve then
                                    // it will return the positive value
                                    // else it will return the number itself.

        boolean flag = true;

        for(int i=1; i<=number; i++){

            flag = !(flag);
        }

            return flag;
    }

    public static int checkEvenOrOdd(int number){

        // Method 2. Using Bitwise AND Operator
        // If Bitwise AND between 1 and the number
        // gives output as 0 then the number is even.
        // If Bitwise AND between 1 and the number
        // gives output as 1 then the number is odd.

        return (number & 1);
    }

    public static void main(String args[]){

        int num;

        System.out.println("Enter a number of your choice: ");

        num = scan.nextInt();

        // boolean evenOrNot = isEven(num);

        // if(evenOrNot){

        //     System.out.println(num+" is an even number");
        // }

        // else{

        //     System.out.println(num+" is an odd number");
        // }

        int checkNumber = checkEvenOrOdd(num);

        if(checkNumber == 0){

            System.out.println(num+" is an even number");
        }

        else{

            System.out.println(num+" is an odd number");
        }

        scan.close();
    }

}
