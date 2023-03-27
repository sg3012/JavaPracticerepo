package src.practiceprograms;

import java.util.Scanner;

// Write a program to reverse a string using recursion.

public class ReverseStringUsingRecursion {

    private static Scanner scan = new Scanner(System.in);

    public static String reverseStringRecursion(String str, int position, char temp[]) {

        String reverse;

        if (position < 0) {

            reverse = String.valueOf(temp);

            return reverse;
        }

        else {

            temp[(str.length() - 1) - position] = str.charAt(position);

            position -= 1;

            return reverseStringRecursion(str, position, temp);
        }
    }

    public static void main(String args[]) {

        String originalString, reverseString;

        int pos;

        char temp[];

        System.out.print("Enter a string of your choice: ");

        originalString = scan.nextLine();

        scan.close();

        pos = originalString.length() - 1;

        temp = new char[originalString.length()];

        System.out.println("Reversed String: ");

        reverseString = reverseStringRecursion(originalString, pos, temp);

        System.out.println(reverseString);

    }
}
