package src.applitoolscourse.methods;

import java.util.Scanner;

/**
 * VARIABLE SCOPE
 * Write an 'instant credit check' program that approves
 * anyone who makes more that Rs.25000 and has a credit
 * score of 700 or better. Reject all others.
 */

public class InstantCreditCheck {
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scan = new Scanner(System.in);

    public static double getSalary() {
        System.out.println("Enter your salary:");
        double salary = scan.nextDouble(); 
        return salary;
    }

    public static int getCreditScore(){
        System.out.println("Enter your credit score:");
        int creditScore = scan.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified(int creditScore, double salary) {
        if (creditScore >= requiredCreditScore && salary >= requiredSalary) {
          return true;
        }
        else{
            return false;
        }
    }

    public static void notifyUser(boolean isQualified){
       if(isQualified){
          System.out.println("Congrats! You have been approved.");
       }
       else{
          System.out.println("Sorry. You have been declined.");
       }
    }

    public static void main(String args[]) {

        // Get the unknown values from user input
        double salary = getSalary();
        int creditScore = getCreditScore();

        // Check if the user is qualified
        boolean qualified = isUserQualified(creditScore,salary);

        // Notify the user
        notifyUser(qualified);
    }
}
