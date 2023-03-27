package src.practiceprograms;

import java.util.Scanner;

//Write a program to check if a number is binary. 
// A binary number is a number expressed in the base-2 numeral 
// system or binary numeral system, a method of mathematical 
// expression which uses only two symbols: typically "0" and "1".
// So, if each digit of a number is either 0 or 1
// then it's binary else not. 

public class CheckBinaryNumberWithoutMethod {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {

        long number, temp;

        boolean flag = false;

        System.out.println("Enter a number of your choice: ");

        number = scan.nextInt();

        scan.close();

        temp = number;

        if (number < 0) {

            System.out.println(number + " is not a binary number");

        }

        else {

            // Loop through the number and check
            // if each of it's digit is either 0 or 1.

            while (temp > 0) { // Here the check is >=0 because if the left most
                               // is 0 then it will skip it.

                if (temp % 10 == 0 || temp % 10 == 1) {

                    flag = true;

                    temp = temp / 10;

                }

                else {

                    flag = false;

                    break;
                }
            }

            if (flag) {

                System.out.println(number + " is a Binary number");
            }

            else {

                System.out.println(number + " is not a Binary number");
            }
        }
    }
}
