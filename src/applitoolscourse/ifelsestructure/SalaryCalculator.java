package src.applitoolscourse.ifelsestructure;
import java.util.Scanner;
/*
IF
This file illustrates the use of only if statements.
All salespeople get a payment of Rs1000 a week
Salespeople who exceed 10 sales get an additional bonus of Rs.250
*/
public class SalaryCalculator {
    public static void main(String args[]){
       // Initialize already known values.
       int salary=1000;
       int bonus=500;
       int quota=10;

       // Get the values for unknown
       System.out.println("How many sales did employee make?");
       Scanner scan=new Scanner(System.in);
       int sales=scan.nextInt();
       scan.close();

       // If else statment for bonus calculator
       if(sales>quota){
           salary=salary+bonus;
       }

       // Output
       System.out.println("Employee's pay for the week is Rs. "+salary);        
    }
}
