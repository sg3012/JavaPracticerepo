package src.applitoolscourse.inputoutput;

import java.util.Scanner;
public class SampleIO {
public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter age:");
        int i = scan.nextInt();
        // System.out.println("Enter name:");
        // String name = scan.next();
        scan.close();

        System.out.println("Age: "+"["+i+"]");
        // System.out.println("Name:"+"["+name+"]");
}   
}
