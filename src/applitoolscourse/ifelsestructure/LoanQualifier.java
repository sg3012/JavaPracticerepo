package src.applitoolscourse.ifelsestructure;

import java.util.Scanner;
/*
  NESTED IF STATEMENTS
  To qualify for a loan, a person must make Rs.50000
  and have been working at their current job for atleast 2 years.
 */
public class LoanQualifier {
    public static void main(String args[]) {
        // Initialize known values
        int requiredSalary = 50000;
        int requiredYearsEmployed = 2;

        // Get unkown values
        System.out.println("Enter your salary:");
        Scanner scan = new Scanner(System.in);
        double salary = scan.nextDouble();
        System.out.println("Enter number of years with your current employer:");
        double years = scan.nextDouble();
        scan.close();

        // Make decision
        if (salary >= requiredSalary) {
            if (years >= requiredYearsEmployed) {
                System.out.println("Congrats!, you qualify for the loan");
            }
            else {
                System.out.println("Sorry!, you must have worked at your job atleast "
                        + requiredYearsEmployed + " Years");
            }
        }
        else {
            System.out.println("Sorry!, you must earn atleast Rs."
            + requiredSalary+" to qualify for the loan");
        }
    }
}
