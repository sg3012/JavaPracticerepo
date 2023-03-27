package src.practiceprograms;

import java.util.Scanner;

// Write a program to make the string “Name is Smith” as “Smith is Name”
// Meaning reordering the String containing multiple words

public class StringReorder {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {

        String str;

        System.out.print("Enter a string: ");

        str = scan.nextLine();

        String arrayAfterSplit[] = str.split(" ");

        System.out.print("String after reverse: ");

        for (int i = (arrayAfterSplit.length - 1); i >= 0; i--) {

            System.out.print(arrayAfterSplit[i] + " ");
        }

        scan.close();
    }

}
