package src.practiceprograms;

import java.util.Scanner;

public class MaximumInteger {

	private static Scanner scan = new Scanner(System.in);

    public static int findMaximumInteger(int listSize, int list[]) {
        int max;

        max = list[0];

        // search array find for the minimum element
        for (int element : list) {

            if (element > max) {

                max = element;

            }
        }

        return max;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

            int maximum = findMaximumInteger(size, elements);

            System.out.print("Maximum element in the list is: " + maximum);

        }

        scan.close();

	}

}
