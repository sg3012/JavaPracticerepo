package src.applitoolscourse.loops;
import java.util.Scanner;
/**
 * FOR LOOP
 * Write a cashier program that will scan a given number of items and tally the cost.
 */
public class Cashier {
    public static void main(String args[]){
        // Get the user input for unkown values
           System.out.println("Enter the number of items you would like to scan:");
           Scanner scan = new Scanner(System.in);
           int quantity = scan.nextInt();
           double total=0;
           
        // Create loop to iterate over all items and accumulate the cost
        for(int i=0; i<quantity; i++){
         System.out.println("Enter the cost of the item:");
         double price = scan.nextDouble();
         total = total+price;
        }
        scan.close();
        System.out.println("YOur total is Rs."+total);
    }
}
