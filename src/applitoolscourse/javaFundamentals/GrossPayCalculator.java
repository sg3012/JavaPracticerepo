package src.applitoolscourse.javaFundamentals;
import java.util.Scanner;
public class GrossPayCalculator {
    public static void main(String arg[]){
        //1. Get the number of hours worked
        System.out.println("Enter number of hours employee worked: ");
        Scanner scan = new Scanner(System.in);
        int hours =scan.nextInt();

        //2. Get the hourly pay rate
        System.out.println("Enter employee's pay rate: ");
        double payRate=scan.nextDouble();
        scan.close();

        //3. Multiple hours and pay rate
        double grossPay=hours*payRate;

        //4. Display result
        System.out.println("Employee's gross pay is: Rs."+grossPay);

    }
}
