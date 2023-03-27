package src.practiceprograms;

import java.util.Scanner;

// WAP to find a minimum integer from a given list of integers. 
//                1<= N<=10
// Where, N = number of integers in the list.

public class MinimumInteger {

    private static Scanner scan = new Scanner(System.in);

    public static int findMinimumInteger(int listSize, int list[]) {
        int min;

        min = list[0];

        // search array find for the minimum element
        for (int j = 0; j < list.length; j++) {

            if (list[j] < min) {

                min = list[j];

            }
        }

        return min;

    }

    public static void main(String args[]) {

        int size = 0;

        System.out.println("Enter number of intergers in the list:");

        size = scan.nextInt();

        if (size < 1 || size > 10) {

            System.out.println("Size cannot be less than 1 or greater than 10");

        }

        else {

            int elements[] = new int[size];

            // Enter integers in the given list
            System.out.println("Enter integers:");

            for (int i = 0; i <= (elements.length) - 1; i++) {

                elements[i] = scan.nextInt();

            }

            int minimum = findMinimumInteger(size, elements);

            System.out.print("Minimum element in the list is: " + minimum);

        }

        scan.close();
    }
}
