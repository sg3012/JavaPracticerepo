package src.practiceprograms;
import java.util.Scanner;

// Write a program to find the factorial of large numbers
// 5! = 5*4*3*2*1 or 1*2*3*4*5  

// Source : 
// https://iq.opengenus.org/factorial-of-large-numbers/
// https://www.javatpoint.com/factorial-of-a-large-number-in-java
// https://www.geeksforgeeks.org/factorial-large-number/
// https://www.youtube.com/watch?v=OkfDSFrxOBc - Small code
// https://www.youtube.com/watch?v=vxPBrr5x2jk - Geeks for Geeks (Shashwat Tiwari)

public class FactorialOfLargeNumbers {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String args[]){

        int number;

        int size = 1, carry=0, temp, i=0, j=0;
        // size is initialized to 1 as the resultant array will have atleast one element.

        int resultArray[] = new int[500];

        resultArray[0] = 1; // 1 is stored as the starting number 
                            // as the 1 will be the starting/last number
                            // to be multiplied while finding the factorial.

        System.out.println("Enter a number of your choice: ");

        number = scan.nextInt();

        for(i=2; i<=number; i++){ // This loop keeps track of the next number we 
                                  // have to multiply in the existing number

            carry = 0;

            for(j = 0; j<size; j++){ // This loop will multiply the current number
                                     // with next number i.e. , i, calculates the
                                    // carry and stores them at appropriate positions.

                System.out.println("Inside the inner loop:");

                System.out.println("Size of the resultant array:" + resultArray.length);

                System.out.println("carry: "+carry);

                temp = resultArray[j]; // storing each digit of the array in temp

                resultArray[j] = ((temp * i) + carry) % 10; // This line will find the product 
                                                            // using value at current array index and i
                                                            // and if there is a carry it will 
                                                            // store only the unit's place of the product
                                                            // at the current array index.   
                                                            // For e.g: 12%10 = 2

                carry = ((temp * i) + carry) / 10;  // This line will calculate the carry
                                                    // by storing the remaining value except 
                                                    // the unit's place value of the product 
                                                    // (calculated in above line)
                                                    // For e.g. : 12/10 = 1

                System.out.println("j: "+j);

                System.out.println("resultArray["+j+"] "+resultArray[j]);
            }

            while(carry > 0){  // After the digits at all the indices
                               // of the array are multipled by i (next number)
                               // and product's unit place digit and remaining
                               // carry's unit's place digit are stored at appropriate places, 
                               // this loop will store the remaining digits of carry
                               // at appropriate index in the array.

                System.out.println("In while loop: ");

                System.out.println("carry: "+carry);
                
                System.out.println("j: "+j);

                System.out.println("Before carry, resultArray["+j+"] "+resultArray[j]);

                resultArray[j] = carry%10;

                carry = carry / 10;

                System.out.println("After carry, resultArray["+j+"] "+resultArray[j]);

                System.out.println("carry: "+carry);

                j++;

                System.out.println("j: "+j);
            }

            size = j;

            System.out.println("Value of j: "+j);

            System.out.println("Value of size: "+size);
        }

        System.out.println("Factorial of "+number+": ");

        for(int k = j-1  ; k >= 0; k--){
          
            System.out.print(resultArray[k]);

        }
        scan.close();
        
    }
}
