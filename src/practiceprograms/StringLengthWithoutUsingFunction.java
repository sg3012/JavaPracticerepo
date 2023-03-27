package src.practiceprograms;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Scanner;

// Write a program to find the length of a string without using length().

public class StringLengthWithoutUsingFunction {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {

        String str;

        int count = 0;

        System.out.println("Enter a string of your choice:");

        str = scan.nextLine();

        // // Method 1.
        // // Convert String to char array using toCharArray() method
        // // Loop through the char array and increase the count to find length.

        // char arr[] = str.toCharArray();

        // for(int i =0; i<arr.length; i++){

        // count++;
        // }

        System.out.println("Length of the string: "+count);

        // Method 2.
        // Using StringCharacterIterator class's Instace to traverse each
        // character of the string.

        CharacterIterator iterator = new StringCharacterIterator(str);

        // // getIndex() returns the index after the last character in the text
        // // i.e., last index + 1.

        int index = iterator.getEndIndex();

        System.out.println("Length of the string: " + index);

        scan.close();

    }

}
