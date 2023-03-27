package src.applitoolscourse.ifelsestructure;

import java.util.Scanner;

/*
  IF-ELSE
  All salesperson are expected to make 10 sales per week
  For those who do, they receive a congratulatory message
  For thos who don't, they are informed of how many sales they were short.
*/
public class QuotaCalculator {
    public static void main(String args[]) {
        // Initialize the known values
        int quota = 10;

        // Get the unknown values
        System.out.println("How many sales did employee make this week?");
        Scanner scan = new Scanner(System.in);
        int sales = scan.nextInt();
        scan.close();

        // Make a decision on path to take-output
        if (sales >= quota) {
            System.out.println("Congratulations!, you've met your quota");
        } else {
            int salesShort = quota - sales;
            System.out.println("Sorry!, you did not make your quota and remained short of " + salesShort + " Sale(s)");
        }
    }
}
