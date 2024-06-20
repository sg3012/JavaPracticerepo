package src.practiceprograms;

import java.util.Scanner;

// Write a program for binary search in an array
// Binary search is also known as half-interval search,
// logarithmic search, binary chop.

public class BinarySearch {

    private static Scanner scan = new Scanner(System.in);

    public static int binarySearchVersion1(int arr[], int targetElement) {

        // Binary search : Version 1 (Simplest form)

        double lowerBound = 0; // least index

        double upperBound = arr.length - 1; // largest index

        int mid; // mid index

        while ((int) lowerBound <= (int) upperBound) {

            mid = (int) Math.floor((lowerBound + upperBound) / 2); // Typecasting
            // the double value returned by floor function to int.

            if (arr[mid] > targetElement)

            {
                upperBound = mid - 1;

            }

            else if (arr[mid] < targetElement)

            {

                lowerBound = mid + 1;

            }

            else if (arr[mid] == targetElement) {

                return mid;

            }
        }

        return -1; // If we get to this point then
                   // it means the return statement inside
                   // loop was never ecountered and target element was not found.
                   // So, we have returned -1 here.
    }

    public static int binarySearchVersion2(int arr[], int targetElement) {

        // Binary search : Version 2(Instead of checking
        // if middle element equals the targetElement in each loop iteration
        // we check this only when 1 element is left inside the array, i.e.,
        // lowerBound = upperBound )

        double lowerBound = 0; // least index

        double upperBound = arr.length - 1; // largest index

        int mid; // mid index

        while ((int) lowerBound <= (int) upperBound) {

            System.out.println("Inside search loop");

            mid = (int) Math.ceil((lowerBound + upperBound) / 2); // Typecasting
            // the double value returned by floor function to int.

            if (arr[mid] > targetElement) {
				upperBound = mid - 1;
			} else {
				lowerBound = mid;
			}
        }

        if (arr[(int) lowerBound] == targetElement) {
			return (int) lowerBound; // typecasting double to int
		} else {
			return -1;
		}
    }

    public static int binarySearchVersion3(int arr[], int targetElement) {

        // Binary search : Version 3 (Returning the leftmost
        // element's index if duplicate elements exist in the array)

        double lowerBound = 0; // least index

        double upperBound = arr.length; // largest index

        int mid; // mid index

        while ((int) lowerBound < (int) upperBound) {

            mid = (int) Math.floor((lowerBound + upperBound) / 2); // Typecasting
            // the double value returned by floor function to int.

            if (arr[mid] < targetElement) {
				lowerBound = mid + 1;
			} else {
				upperBound = mid;
			}
        }

        return (int) lowerBound;
    }

    public static int binarySearchVersion4(int arr[], int targetElement) {

        // Binary search : Version 4 (Returning the rightmost
        // element's index if duplicate elements exist in the array)

        double lowerBound = 0; // least index

        double upperBound = arr.length; // largest index

        int mid; // mid index

        while ((int) lowerBound < (int) upperBound) {

            mid = (int) Math.floor((lowerBound + upperBound) / 2); // Typecasting
            // the double value returned by floor function to int.

            if (arr[mid] > targetElement) {
				upperBound = mid;
			} else {
				lowerBound = mid + 1;
			}
        }

        return (int) (upperBound-1);
    }

    public static void main(String args[]) {

        int arr[], size, target, position;

        System.out.println("Enter number of elements in the array:");

        size = scan.nextInt();

        arr = new int[size];

        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {

            arr[i] = scan.nextInt();

        }

        // First sort the array before searching or enter the sorted array itself.

        int temp;

        for (int i = 0; i < arr.length - 1; i++) { // Outer loop for
                                                   // the number of passes

            for (int j = 0; j < arr.length - 1; j++) { // inner loop for the
                                                       // number of comparisons.
                if (arr[j] > arr[j + 1]) {

                    temp = arr[j];

                    arr[j] = arr[j + 1];

                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array: ");

        for (int element : arr) {

            System.out.println(element);

        }

        System.out.println("Enter the element to be searched:");

        target = scan.nextInt();

        // Then search the array:
        position = binarySearchVersion1(arr, target);

        // position = binarySearchVersion2(arr, target);

        // position = binarySearchVersion3(arr, target);

        // position = binarySearchVersion4(arr, target);

        if (position >= 0 && !(position > arr.length - 1)) {

            if (arr[position] == target) {
                System.out.println("Element found at index: " + position);

            }

            else {

                System.out.println("Search unsuccessful. No Such element present !.");

            }

        }

        else {

            System.out.println("Search unsuccessful. No Such element present !.");

        }

        scan.close();
    }
}
