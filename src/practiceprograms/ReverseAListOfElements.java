package src.practiceprograms;

import java.util.Scanner;

// Write a program to reverse elements in a list.
// For eg : Consider following list of elements:
// {7,8,10,1,2,3}
// Reverse list will look like : {3,2,1,10,8,7}

// Logic : In the list keep doing the comparisons until
// the middle index or closest to middle index is reached.
// While doing the comparisons keep swapping the elements at the corresponding positions

public class ReverseAListOfElements {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {

        int size, listOfElements[];

        System.out.print("Enter number of elements in the list: ");

        size = scan.nextInt();

        listOfElements = new int[size];

        int numberOfPasses = (listOfElements.length) / 2; // number of passes is calculated for getting number
                                                          // of comparisons between the list elements.

        int mod = (listOfElements.length) % 2; // mod is calculated to check if the numberOfPasses
                                               // is a whole number or not and accordingly we
                                               // iterate the elements in the list.
                                               // It's value is either 0 or 1.

        System.out.println("Enter the elements: ");

        for (int i = 0; i < listOfElements.length; i++) {

            listOfElements[i] = scan.nextInt();
        }

        int temp;

        if (mod > 0) { // Meaning number of passes is not a whole number

            for (int j = listOfElements.length - 1; j > numberOfPasses; j--) {

                temp = listOfElements[j];

                listOfElements[j] = listOfElements[listOfElements.length - (j + 1)];

                listOfElements[listOfElements.length - (j + 1)] = temp;
            }

        }

        else { // Meaning number of passes is a whole number

            for (int j = listOfElements.length - 1; j >= numberOfPasses; j--) {

                temp = listOfElements[j];

                listOfElements[j] = listOfElements[listOfElements.length - (j + 1)];

                listOfElements[listOfElements.length - (j + 1)] = temp;
            }

        }

        System.out.println("Reversed list: ");

        for (int listOfElement : listOfElements) {

            System.out.println(listOfElement);
        }

        scan.close();

    }
}
