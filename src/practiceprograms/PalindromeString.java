package src.practiceprograms;

import java.util.Scanner;

// WAP to check whether a given string is palindrome or not.

// Palindrome : A string is called a Palindrome if the reverse is 
// equal to the original string. 

// Palindrome strings : level, radar 
// Non - Palindrome strings : Book, Footer 

public class PalindromeString {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {
        // Method 1 :
        // Use String class
        // Loop through the original string characters, store them in
        // reverse order in a character array

        // String str;

        // char temp[];

        // System.out.println("Enter a string of your choice:");

        // str = scan.nextLine();

        // scan.close();

        // temp = new char[str.length()];

        // // Loop through the original string in reverse order and put
        // // all the elements of the string in reverse order in the character array.
        // for (int i = str.length() - 1; i >= 0; i--) {

        //     temp[(str.length() - 1) - i] = str.charAt(i);

        // }

        // // Convert the character array to reversed String using valueOf method
        // String reverse = String.valueOf(temp);

        // // System.out.println("Reverse String:" + reverse);

        // // Compare the reversed string with original string
        // if (reverse.equals(str)) {

        //     System.out.println("The String is a palindrome");

        // }

        // else {

        //     System.out.println("The String is not a palindrome");

        // }

        // Method 2:
        // Use StringBuilder class
        // Store the original string in an string builder object
        // and use the reverse() method of stringBuilder class
        // to reverse the string.

        System.out.println("Enter a string of your choice:");

        StringBuilder str2 = new StringBuilder(scan.nextLine());
        
        StringBuilder reverseString = new StringBuilder(str2); // in reverseString
        
        // we have stored str2 as
        // as if we store the reverse it
        // it will also reverse the contents of
        // original str2 object as a permanent change.
        reverseString = reverseString.reverse();

        // Compare the reversed string with original string using equals()
        if(String.valueOf(reverseString).equals(String.valueOf(str2))){

        System.out.println("The string is a palindrome");

        }

        else{
            
        System.out.println("The string is not a palindrome");

        }

        scan.close();

    }
}
