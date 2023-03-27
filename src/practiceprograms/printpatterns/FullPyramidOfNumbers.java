package src.practiceprograms.printpatterns;

import java.util.Scanner;

// WAP to print a full pyramid shown below on the basis
// of number of rows entered from user input
// on console using numbers.

//         1
//       1 1 1
//     1 1 1 1 1
//   1 1 1 1 1 1 1
// 1 1 1 1 1 1 1 1 1

public class FullPyramidOfNumbers {
    public static void main(String args[]) {
        int rows, columns, k;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        rows = scan.nextInt();
        
         // This loop is for tracking number of rows.
        for (int i = rows; i >= 1; i--) {

            // this for loop will run odd number of times to print spaces.
            for (columns = 1; columns <= (2 * i) - 1; columns++) {
                System.out.print(" ");
            }

            // this for loop will run odd number of times to print elements.
            for (k = (2 * rows) - 1; k >= (2 * i) - 1; k--) {
                System.out.print(k - (k - 1));
                System.out.print(" ");
            }
            
            System.out.println();
        }
        scan.close();
    }
}
