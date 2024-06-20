package src.practiceprograms;

import java.util.Scanner;

// Write a program to swap 2 elements in a list.
// For eg : Consider following list of elements:
// {7,8,10,1,2,3}
// And we have to swap 8 and 10 then after swapping the list
// will look like : {7,10,8,1,2,3}

public class SwapElementsInaList {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {

        int size, listOfIntegers[];

        System.out.print("Enter the size of the list of integers: ");

        size = scan.nextInt();

        listOfIntegers = new int[size];

        System.out.println("Enter the list of integers: ");

        for (int i = 0; i < listOfIntegers.length; i++) {

            listOfIntegers[i] = scan.nextInt();
        }

        int element1, element2, i, j = 0;

        boolean flag = false; // This variable will be used to track
                              // if the elements to be swapped are present in the list or not.

        System.out.println("Enter the elements to be swapped: ");

        System.out.print("Element1: ");

        element1 = scan.nextInt();

        System.out.print("Element2: ");

        element2 = scan.nextInt();

        // Search if the elements exist in the array or not
        // If not exit from the program otherwise swap them.

        for (i = 0; i < listOfIntegers.length; i++) {

            // The 2nd check in the below if condition is applied
            // because when element1 is found at a certain index
            // we start finding element2 after that index and if
            // the element1's index is the last one in the array
            // then element2 will not be there as the whole array is already
            // traversed.
            if (element1 == listOfIntegers[i] && i < listOfIntegers.length) {

                for (j = 0; j < listOfIntegers.length; j++) {

                    if (element2 == listOfIntegers[j]) {

                        flag = true;

                        break;
                    }
                }

                break;
            }
        }

        // If flag true, Element found swap the numbers

        if (flag) {

            System.out.println("List after Swapping the elements:");

            int temp;

            temp = listOfIntegers[j];

            listOfIntegers[j] = listOfIntegers[i];

            listOfIntegers[i] = temp;

            for (int listOfInteger : listOfIntegers) {

                System.out.println(listOfInteger);
            }
        }

        // else Element not found

        else {

            System.out.println(element1 + " and " + element2 + " don't exist in the array");
        }

        scan.close();
    }

}
