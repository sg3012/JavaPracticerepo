package src.applitoolscourse.methods;
import java.util.Scanner;
/**
 * FIRST METHOD
 * Write a method that asks a user for their name, then greets them by name.
 */

public class Greetings {

    public static void greetUser(String userName){
        System.out.println("Hello, "+userName);
    }
    
    public static void main(String args[]){
        System.out.println("Enter your name:");
        Scanner scan = new Scanner(System.in);
        String name= scan.next();
        scan.close();
        greetUser(name);
    }
}
