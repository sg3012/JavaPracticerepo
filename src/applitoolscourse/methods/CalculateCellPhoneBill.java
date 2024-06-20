package src.applitoolscourse.methods;
import java.util.Scanner;

// OBJECTIVE-You're going to calculate a cellphone bill.

// So, what you're going to do is allow the user to input
// the plan fee and the number of overage minutes. And then you're going to charge 25 cents for every minute that they've gone over, and then a 15% tax on the subtotal.

// create separate methods to calculate the tax, to
// calculate the overage fees, and to calculate and print the final total.

// Please print this as an itemized bill. I have an example
// of the output expected down below.

// Example Output:

// Enter base cost of the plan:
// 82.45
// Enter overage minutes:
// 9
// Phone Bill Statement
// Plan: $82.45
// Overage: $2.25
// Tax: $12.71
// Total: $97.41

public class CalculateCellPhoneBill {
    static double overageCharge = 0.25;
    static Scanner scan = new Scanner(System.in);

    public static double calculateOverageFees(double overageMinutes) {
        double overageFees = overageMinutes * overageCharge;
        return overageFees;
    }

    public static double calculateTax(double subTotal) {
        double tax = (subTotal * 15) / 100;
        return tax;
    }

    public static void calculateFinalBill(double baseCost,double overageFees,double tax) {
        double bill = baseCost + overageFees + tax;
        System.out.println("Phone bill statement");
        System.out.println("Plan: " +"Rs."+ String.format("%.2f",baseCost));
        System.out.println("Overage: "+"Rs." + String.format("%.2f",overageFees));
        System.out.println("Tax: "+"Rs." + String.format("%.2f",tax));
        System.out.println("Total: "+"Rs." + String.format("%.2f",bill));
    }

    public static void main(String args[]) {
        // Get the values of unknown variables from user input
        System.out.println("Enter base cost of the plan:");
        double baseCost = scan.nextDouble();

        System.out.println("Enter overage minutes:");
        double extraMinutes = scan.nextDouble();
        scan.close();

        // calculate overgae fees
        double overageFees = calculateOverageFees(extraMinutes);

        // calculate subtotal
        double subTotal = overageFees + baseCost;

        // calculate tax
        double tax = calculateTax(subTotal);

        // calculate final total and display the itemised bill
        calculateFinalBill(baseCost,overageFees,tax);
    }
}
