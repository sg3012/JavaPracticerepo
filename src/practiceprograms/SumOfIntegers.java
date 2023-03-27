package src.practiceprograms;

import java.util.Scanner;

// WAP find a sum of 5 integers
// Integers are the numbers without any fraction part invloved.
// Positive Integers range from 1-infinity
// Negative integers range from -1 - Infinity
// 0 is also an integer

public class SumOfIntegers {

    private static Scanner scan = new Scanner(System.in);

    public static int calculateSum(int num1, int num2, int num3, int num4, int num5) {

        return (num1 + num2 + num3 + num4 + num5);
    }

    public static void main(String args[]) {

        String myNumber1, myNumber2, myNumber3, myNumber4, myNumber5;

        char digit;

        boolean flag1 = true;

        System.out.println("Enter 5 integers of your choice: ");

        myNumber1 = scan.nextLine();

        myNumber2 = scan.nextLine();

        myNumber3 = scan.nextLine();

        myNumber4 = scan.nextLine();

        myNumber5 = scan.nextLine();

        scan.close();

        // Checking if the entered numbers contain decimal in them at some place or not
        for (int i = 0; i < myNumber1.length(); i++) {

            digit = myNumber1.charAt(i);

            if (digit == '.') {

                flag1 = false;

                break;
            }
        }

        for (int i = 0; i < myNumber2.length(); i++) {

            digit = myNumber2.charAt(i);

            if (digit == '.') {

                flag1 = false;

                break;
            }
        }

        for (int i = 0; i < myNumber3.length(); i++) {

            digit = myNumber3.charAt(i);

            if (digit == '.') {

                flag1 = false;

                break;
            }
        }

        for (int i = 0; i < myNumber4.length(); i++) {

            digit = myNumber4.charAt(i);

            if (digit == '.') {

                flag1 = false;

                break;
            }
        }

        for (int i = 0; i < myNumber5.length(); i++) {

            digit = myNumber5.charAt(i);

            if (digit == '.') {

                flag1 = false;

                break;
            }
        }

        if (flag1) {

            int number1 = Integer.parseInt(myNumber1);

            int number2 = Integer.parseInt(myNumber2);

            int number3 = Integer.parseInt(myNumber3);

            int number4 = Integer.parseInt(myNumber4);

            int number5 = Integer.parseInt(myNumber5);

            System.out.println("Sum of the integers entered:");

            int sum = calculateSum(number1, number2, number3, number4, number5);

            System.out.println(sum);

        }

        else {

            System.out.println("Decimal numbers are not Integers");
        }
    }

}
