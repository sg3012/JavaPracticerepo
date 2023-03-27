package src.applitoolscourse.methodoverloading;
import java.util.Scanner;
public class MonthCalculator {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your month in Integer:");
        int monthValueInt = scan.nextInt();
        System.out.println(Month.getMonth(monthValueInt));

        System.out.print("Enter your month in String:");
        String monthValueString = scan.next();
        System.out.println(Month.getMonth(monthValueString));

        scan.close();
    }

}
