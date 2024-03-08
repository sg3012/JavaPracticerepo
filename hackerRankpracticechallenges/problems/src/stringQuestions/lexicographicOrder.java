package hackerRankpracticechallenges.problems.src.stringQuestions;

import java.util.Scanner;

public class lexicographicOrder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */

        // Print sum of the lengths of both Strings
        int lengthSum = A.length() + B.length();

        System.out.println(lengthSum);

        // Check if String A is lexicographically greater than String B or not
        int flag = -1;

        for (int i = 0; i < A.length(); i++) {

            // To check if we have reached the end of the comparing String (B)
            // while picking up and checking the elements from compared String (A)
            // This way we only have run till the length of comparing string (B)
            if (i == B.length()) {

                break;
            }

            for (int j = i; j <= i; j++) {

                System.out.println("Numeric value at i= " +
                        i + " " + Character.getNumericValue(A.charAt(i)));

                System.out.println("Numeric value at j= " +
                        j + " " + Character.getNumericValue(B.charAt(j)));

                if (Character.getNumericValue(A.charAt(i)) > Character.getNumericValue(B.charAt(j))) {

                    flag = 1;

                    break;

                }

                else if (Character.getNumericValue(A.charAt(i)) < Character.getNumericValue(B.charAt(j))) {

                    System.out.println("Entered in else if");

                    flag = 0;

                    break;

                }
            }

            if (flag == 0 || flag == 1) {

                break;
            }
        }

        if (flag == 1) {

            System.out.println("Flag: " + flag + " " + "Yes");

        }

        else if (flag == 0) {

            System.out.println("Flag: " + flag + " " + "No");

        }

        else {

            System.out.println("Both the Strings are equal!");
        }

    }

}
