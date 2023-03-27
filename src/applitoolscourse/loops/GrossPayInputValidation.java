package src.applitoolscourse.loops;
import java.util.Scanner;
/**
 * WHILE LOOP
 * Each store employee earn Rs.50 an hour. Write a program that
 * allows the employee to enter the number of hours worked for 
 * the week. Do not allow the overtime
 */

public class GrossPayInputValidation {
  public static void main (String arg[]){
      // Initialize known variables
      int rate = 50;
      int maxHours = 40;

      // Get input for unkown variables
      System.out.println("How many hours you have worked for this week?");
      Scanner scan = new Scanner(System.in);
      double hoursWorked = scan.nextDouble();

      // Validate the input
      while(hoursWorked>maxHours || hoursWorked<1){
          System.out.println("Invalid Input. Hours worked must be between 1 and 40. Try again.");
          hoursWorked = scan.nextDouble();
      }
      scan.close();

      // Calculate gross pay for the employee
      double grossPay = rate * hoursWorked;
      System.out.println("Gross Pay: Rs."+grossPay);
  }    
}
