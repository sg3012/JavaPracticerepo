package src.applitoolscourse.loops;
import java.util.Scanner;
/**
 * DO WHILE LOOP
 * Write a program that allows a user to enter two numbers,
 * and the  n sums the 2 numbers. The user should be able to
 * repeat the action until they indicate they are done. 
 */

public class AddNumbers {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

     boolean again;

     do{
         System.out.println("Enter the first number:");

         double num1 = scan.nextDouble();

         System.out.println("Enter the second number:");

         double num2 = scan.nextDouble();

         double sum = num1+num2;

         System.out.println("The sum is:"+sum);

         System.out.println("Do you want to continue? (true or false):");
         
         again=scan.nextBoolean();
     }while(again);

    scan.close();
    }
}
