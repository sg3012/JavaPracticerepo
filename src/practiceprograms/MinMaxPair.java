package src.practiceprograms;

import java.util.Scanner;

// This program will return pair of minimum and maximum
// elements in an array.
public class MinMaxPair {

    static class Pair {

        int min;

        int max;
    }

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");

        int n = Integer.parseInt(scan.nextLine());

        int[] arr = new int[n];

        int i = 0;

        System.out.println("Enter array elements: ");

        while (i < n) {

            arr[i] = Integer.parseInt(scan.nextLine());

            i++;
        }

        Pair p = getMinMax(arr, n);

        System.out.println("Maximum and Minimum pair: ");

        System.out.println("Max:" + p.max + " " + "Min:" + p.min);

        scan.close();

    }

    static Pair getMinMax(int arr[], int no) {

        // This is how we create object of a Static class contained in a
        // Non-static class.
        MinMaxPair.Pair pair = new MinMaxPair.Pair();

        // Accessing the max variable of static class Pair through it's Object reference
        pair.max = arr[0];

        // Finding maximum element
        for (int element : arr) {

            if (element > pair.max) {

                pair.max = element;
            }
        }


        // Accessing the max variable of static class Pair through it's Object reference
        pair.min = arr[0];

        // Finding minimum element
        for (int element : arr) {

            if (element < pair.min) {

                pair.min = element;
            }
        }

        return pair;
    }

}
