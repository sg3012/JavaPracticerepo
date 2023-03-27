package src.practiceprograms;

import java.util.Scanner;

// Write a program to check the number of times substring appears in a string.
// For e.g. Consider the follwing string:
// "abhhkihhcdkkdkk"
// The occurence of substring "hh" is 2 times.

public class SubStringOccurences {

  private static Scanner scan = new Scanner(System.in);

  public static void main(String args[]) {
    String mainString, subString;

    int count = 0;

    String[] splitString;

    boolean flag = false;

    System.out.println("Enter a string of your choice:");

    mainString = scan.nextLine();

    System.out.println("Enter substring to search for:");

    subString = scan.nextLine();

    while (mainString.indexOf(subString) >= 0) { // to check whether substring occurence
      // there or not in the mainString.
      // indexOf() will return the index of a substring within the main string.

      splitString = mainString.split(subString, 2); // this 2nd argument of split method
      // is used to define the limit for
      // number of occurences of substring
      // if it's value is +ve then
      // it will split the string to Value -1
      // So, here it will split the mainString
      // only one time as the limit argument is
      // 2


      // This loop will iterate through the split string array
      // and assign the remaining string which has not been traversed
      // to the main string, after the occurence of sub-string using split method above.  
      for (int i = 0; i < splitString.length; i++) {

        // This condition will check if the next index in the split string array
        // is the one after the last index or not.
        // If yes then the end of the split string array has reached and there are no
        // elements to be traversed further and loop will break.
        if (i + 1 >= splitString.length) {

          flag = true;

          break;
        }

        // else we will assign the remaining string stored at next index
        // in the Split String array to the mainString.
        else {

          mainString = splitString[i + 1];
        }
      }

      // Increase the count by 1 at last of each iteration
      // of while loop.
      count += 1;
    }

    if(flag){

      System.out.println("Substring " +"'"+ subString +"'"+" Occurs " + count + " time(s)");

    }
   
    else{

      System.out.println("No Occurrences of "+"'"+subString+"'"+" found!!.");
    }
    
    scan.close();
  }
}
