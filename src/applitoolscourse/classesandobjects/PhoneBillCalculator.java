package src.applitoolscourse.classesandobjects;

public class PhoneBillCalculator {

    public static void main(String args[]) {
        // Get the values of unknown variables from user input
        PhoneBill bill  = new PhoneBill("5");
        bill.setBaseCost(82.45);
        double baseCost = bill.getBaseCost();

        bill.setMinutesUsed(9);
        double overageMinutes = bill.getMinutesUsed();

        double overCharge = bill.calculateOverageFees(overageMinutes);

        double subTotal = overCharge+baseCost;

        double tax = bill.calculateTax(subTotal);

        bill.calculateFinalBill(baseCost, overCharge, tax);


    }
}
