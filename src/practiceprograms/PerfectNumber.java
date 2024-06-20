package src.practiceprograms;

import java.util.Scanner;

// Write a program to check whether a number is a perfect number.
// In number theory, a perfect number is a positive integer that
// is equal to the sum of its positive divisors, excluding the
// number itself. For instance, 6 has divisors 1, 2 and 3
// (excluding itself), and 1 + 2 + 3 = 6, so 6 is a perfect number.

public class PerfectNumber {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {

        int no, sum = 0;

        System.out.println("Enter a number of your choice: ");

        no = scan.nextInt();

        scan.close();

        if (no < 0) {

            System.out.println("Please enter only positive integers");
        }

        else if (no == 0) {

            System.out.println(no+" is not a perfect number");
        }

        else {

            for (int i = 1; i < no; i++) {

                if (no % i == 0) {

                    sum = sum + i;

                }

            }

            System.out.println("Sum of all the factors of " + no + " is " + sum);

            if (sum == no) {

                System.out.println(no + " " + "is a perfect number");

            }

            else {

                System.out.println(no + " " + "is not a perfect number");

            }

        }

    }

}
