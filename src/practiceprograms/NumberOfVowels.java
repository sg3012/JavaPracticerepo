package src.practiceprograms;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

//Write a program to find the number of vowels in a string
// Vowels : a,e,i,o,u  OR A,E,I,O,U

public class NumberOfVowels {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {

        int count_1 = 0;

        String str;

        System.out.println("Enter a string:");

        str = scan.nextLine();

        scan.close();

        System.out.print("Vowels in the string: ");

        // Method 1 : This method is efficient only when
        // there is no repition of vowels in string.

        // for(int i=0; i<str.length(); i++){

        // if(String.
        // valueOf(str.charAt(i)).
        // equalsIgnoreCase("a") ||

        // String.
        // valueOf(str.charAt(i)).
        // equalsIgnoreCase("e") ||

        // String.
        // valueOf(str.charAt(i)).
        // equalsIgnoreCase("i") ||

        // String.
        // valueOf(str.charAt(i)).
        // equalsIgnoreCase("o") ||

        // String.
        // valueOf(str.charAt(i)).
        // equalsIgnoreCase("u")) {

        // count+=1;
        // }
        // }

        // System.out.println(count);

        // Method 2 : This method will use SET and HashMap data structures
        // to find out unique set of vowels
        // in the string and print total number of unique vowels in it.

        Integer count_2 = null;

        // 1. Create a Hashmap corresponding to the sample string above
        // which will hold String key and Integer value
        // <Character, Integer>
        Map<String, Integer> mapOfStr = new HashMap<String, Integer>();

        // Loop through the string to Check whether or not
        // the character in the str above is alreay
        // stored as a key inisde the hashMap
        // if it is there in the map already then increment
        // the value against that key by 1 else
        // insert that character as a key with value/count 1

        for (int i = 0; i < str.length(); i++) {

            // Converted the character at a particular index of 
            // the string first to String and then lowercase

            // We have converted to lowercase so, that the characters
            // with different cases count as only 1.

            String mapKey = String.valueOf(str.charAt(i)).toLowerCase();

            count_2 = mapOfStr.get(mapKey); // Check if a particular
                                                   // character in the
                                                   // String present in the
                                                   // map also or not.

            if (count_2 == null) { // if that character is not present
                                   // then insert it into the map
                                   // otherwise leave it as it is.

                mapOfStr.put(mapKey, 1);
            }

            else {

                mapOfStr.put(mapKey, count_2 += 1);
            }

        }

        // Initialized count_2 to 0 to
        // to accumulate the sum of total vowel occurences in the string.
        count_2 = 0;

        // using var as return type of value in the loop
        // as we don't know which type of is it in the set

        for (var ch : mapOfStr.entrySet()) { // entry set method will
                                             // convert map into set
                                             // So, that we could iterate
                                             // the Set using loop.

            if (String.valueOf(ch.getKey()).equalsIgnoreCase("a") ||
                    String.valueOf(ch.getKey()).equalsIgnoreCase("e") ||
                    String.valueOf(ch.getKey()).equalsIgnoreCase("i") ||
                    String.valueOf(ch.getKey()).equalsIgnoreCase("o") ||
                    String.valueOf(ch.getKey()).equalsIgnoreCase("u")) {

                System.out.print(ch.getKey() + " ");

                count_1 += 1;

                count_2 = count_2 + ch.getValue();

            }
        }
        System.out.println();

        System.out.println("Distinct Vowels: " + count_1);

        System.out.println("Total Vowels: " + count_2);
    }
}
