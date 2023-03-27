package src.practiceprograms;

import java.util.*;

// Write a program to find duplicate characters in a string.
// For e.g. : If there is a string like "abcaadcccd"
// The duplicates will be : a , c, d

public class DuplicateCharactersInString {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {

        String sampleString;

        System.out.println("Enter the string:");

        sampleString = scan.nextLine();
        
        // Converting the whole string to lower case so, that 'A' and 'a' are
        // not treated different characters
        sampleString = sampleString.toLowerCase();

        // Method 1: Using 2 loops outer loop to pick a String element to compare
        // and inner loop to be iterated on remaining elements using
        // the element from outer loop.
        // But this method will work only when
        // an element is repeated 2 times else it will fail.

        // char searchCharacter;

        System.out.println("Duplicate elements are: ");

        // for(int i = 0;i<(sampleString.length()-1);i++){

        // // searchCharacter = sampleString.charAt(i);

        // for(int j=i+1; j<=sampleString.length()-1; j++){

        // if(sampleString.charAt(i) == sampleString.charAt(j)){

        // System.out.println(sampleString.charAt(i));

        // }
        // }
        // }

        // Method 2 : Using a combination of SET and HashMap datastructures
        // as they will store only unique values

        Integer count = null;

        // 1. Create a Hashmap corresponding to the sample string above
        // which will hold Character key and Integer value
        // <Character, Integer>
        Map<Character, Integer> mapOfSampleString = new HashMap<Character, Integer>();

        // Loop through the string to Check whether or not
        // the character in the sampleString above is alreay
        // stored as a key inisde the hashMap
        // if it is there in the map already then increment
        // the value against that key by 1 else
        // insert that character as a key with value/count 1

        for (int i = 0; i < sampleString.length(); i++) {

            count = mapOfSampleString.get(sampleString.charAt(i)); // Check if a particular
                                                                   // character in the
                                                                   // String present in the
                                                                   // map also or not.

            if (count == null) {

                mapOfSampleString.put(sampleString.charAt(i), 1);
            }

            else {

                count += 1;

                mapOfSampleString.put(sampleString.charAt(i), count);
            }
        }

        // using var as return type of value in the loop
        // as we don't know which type of is it in the set

        for (var ch : mapOfSampleString.entrySet()) { // entry set method will
                                                      // convert map into set
                                                      // So, that we could iterate
                                                      // the Set using loop.

            if (ch.getValue() > 1) {

                System.out.print(ch.getKey()+", Occurences: " + ch.getValue());

                System.out.println();
            }
        }

        scan.close();
    }
}
