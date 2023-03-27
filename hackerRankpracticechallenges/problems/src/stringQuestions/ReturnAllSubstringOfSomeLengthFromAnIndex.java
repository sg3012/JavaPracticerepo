package hackerRankpracticechallenges.problems.src.stringQuestions;

import java.util.Scanner;

public class ReturnAllSubstringOfSomeLengthFromAnIndex {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        // Loop through the main string and find all the substrings of length 3

        String arr[] = new String[s.length() - (k - 1)];

        for (int i = 0; i < s.length(); i++) {

            if (i + k > s.length()) {

                break;
            }

            else {
                arr[i] = s.substring(i, i + k);
            }

        }

        String temp = "";

        for (int j = 0; j < (arr.length - 1); j++) {

            for (int i = j + 1; i < arr.length; i++) {

                if (arr[j].compareTo(arr[i]) > 0) {

                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

                else {

                }
            }

        }

        smallest = arr[0];
        largest = arr[arr.length - 1];

        System.out.println("Smallest substring:" + smallest);
        System.out.println("Largest Substring: " + largest);

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.print(getSmallestAndLargest(s, k));
    }
}
