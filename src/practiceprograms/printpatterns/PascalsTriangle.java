package src.practiceprograms.printpatterns;

import java.util.Scanner;

// WAP to print the Pascal's triangle shown below on the basis
// of number of rows entered from user input

// The triangle may be constructed in the following 
// manner: In row 0 (the topmost row), there is a unique 
// nonzero entry 1. Each entry of each subsequent row is constructed 
// by adding the number above and to the left with the number 
// above and to the right, treating blank entries as 0. 
// For example, the initial number in the first (or any other) 
// row is 1 (the sum of 0 and 1), whereas the numbers 1 and 3 in 
// the third row are added to produce the number 4 in the fourth row.

//            1 - Row 0
//          1   1 - Row 1
//        1   2   1 - Row 2
//      1   3   3    1 - Row 3
//    1  4    6   4   1 - Row 4
//  1  5   10   10  5   1 - Row 5

// Sources: 
// https://en.wikipedia.org/wiki/Pascal%27s_triangle
// https://www.mathsisfun.com/pascals-triangle.html
public class PascalsTriangle {

    public static void main(String args[]) {
        int rows;

        int currentRow[]; // array to represent the current row of the triangle
                          // the size of this array will be determined at the run time
                          // because it might be the case that there is only one
                          // row in the triangle. Hence, currentRow will not be needed.

        int previousRow[] = new int[] { 1 }; // This array will hold
                                             // the values which will be used to
                                             // construct next row. Initially
                                             // previous row will hold only
                                             // the value "1" as the top most
                                             // row of a Pascal's triangle only
                                             // contain "1".

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of rows: ");

        rows = scan.nextInt();

        int count = 0; // this variable is used to track the elements' indices 
                       // in the individual rows.

        for (int i = 0; i <= rows - 1; i++) { // This loop will track of the number of rows in the triangle
                                              // i.e, if there are 2 rows then it will run 2 times, 
                                              // if there are 3 rows then it will run 3 times.

            currentRow = new int[i + 1];      // Initializing the current row array
                                              // with the number of elements = row number + 1
                                              // every time a new row starts. So, at row number
                                              // 0 there will be 1 element, at row number 1
                                              // there will be 2 elements and so on.

            for (int j = rows; j > i; j--) {  // This loop will keep track of the number of spaces
                                              // to be printed in each row depending on the total
                                              // number of rows and current row number.

                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) { // This loop will keep track of the number of elements
                                           // to be printed in each row depending on the total
                                           // number of rows and current row number.

                if (count == 0) { // This condition will check if count equals
                                  // the starting element index of the current row i.e., 0.

                    // System.out.println("Inside first if condition");

                    currentRow[k] = 1;

                    System.out.print(currentRow[k]);

                    System.out.print(" ");

                }

                else if (k == i) { // This condition will check if k equals
                                   // the last element index of the current row i.e., row number.
                                   // For e.g : if the current row number is 3 then last element 
                                   // index would also be 3.

                    currentRow[k] = 1;

                    System.out.print(currentRow[k]);

                    System.out.print(" ");
                }

                else if (count < i) { // This condition will check if count equals
                                      // an element's index greater than the start index
                                      // and less than the last index for the current row number.

                    currentRow[k] = previousRow[k - 1] + previousRow[k];

                    System.out.print(currentRow[k]);

                    System.out.print(" ");
                }

                count++;
            }
            System.out.println();

            previousRow = currentRow;

            count = 0;
        }
        scan.close();
    }
}
