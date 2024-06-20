package src.practiceprograms;

import java.util.ArrayList;
import java.util.Scanner;

//Write a program to find fibonacci series using recursion.

public class FibonacciSeriesUsingRecursion {

    private static Scanner scan = new Scanner(System.in);

    public static ArrayList<Long> fibonacci(ArrayList<Long> series,
            long f0, long f1, long sum, long seriesLength) {

        if (series.size() == seriesLength) {

            return series;
        }

        else {

            sum = f0 + f1;

            f0 = f1;

            f1 = sum;

            series.add(sum);

            return fibonacci(series, f0, f1, sum, seriesLength);
        }

    }

    public static void main(String args[]) {

        long f0 = 0, f1 = 1, fN;

        long sum = 0;

        ArrayList<Long> series = new ArrayList<>();

        System.out.println("Enter the size of the Fibonacci Sequence:");

        fN = scan.nextInt();

        fN = fN - 2; // We have decreased the size of the series to
                     // 2 as we already know the 1st 2 elements.

        System.out.println("Your Series: ");

        System.out.print(f0 + " " + f1 + " ");

        series = fibonacci(series, f0, f1, sum, fN);

        // Printing the Fibonacci Series in the form of ArrayList
        for (Long element : series) {

            System.out.print(element + " ");
        }

        scan.close();

    }

}
