package src.practiceprograms;

import java.util.Scanner;

// Write a program to extract numeric values from a string.

public class FindIntegersInString {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {

        String str;

        System.out.print("Enter a string: ");

        str = scan.nextLine();

        scan.close();

        System.out.println("Numeric values are: ");

        for (int i = 0; i < str.length(); i++) {

            if (String.valueOf(str.charAt(i)).matches(".*[0-9].*")) {

                System.out.print(str.charAt(i));
            }
        }

    }

}
