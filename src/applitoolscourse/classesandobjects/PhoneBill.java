package src.applitoolscourse.classesandobjects;
// a phone bill should have an ID, a base class, a number of allotted minutes and a number of minutes used. And then, it should also be able to calculate the overage, calculate the tax, and calculate the total.

// And then, it should also be able to print an itemized bill.

// You should also include three constructors

// a default one
// one that accepts the ID only
// one that accepts all fields
// Now no matter which of these constructors you use, all fields should be set eventually.

// Then you can also create a different class that instantiates the PhoneBill and prints out an itemized bill.

public class PhoneBill {
    static double overageCharge = 0.25;
    String id;
    double baseCost;
    double numberOfAllottedMinutes;
    double numberOfMinutesUsed;

    public PhoneBill(){
        id="";
        baseCost=0;
        numberOfAllottedMinutes=0;
        numberOfMinutesUsed=0;
    }

    public PhoneBill(String id){
        this.id = id;
        baseCost=0;
        numberOfAllottedMinutes=0;
        numberOfMinutesUsed=0;
    }

    public PhoneBill(String id, double baseCost, double numberOfAllotedMinutes
    ,double numberOfMinutesUsed){
        this.id = id;
        this.baseCost = baseCost;
        this.numberOfAllottedMinutes = numberOfAllotedMinutes;
        this.numberOfMinutesUsed = numberOfMinutesUsed;
    } 

    public String getId(){
        return id;
    }
  
    public void setId(String id){
        this.id = id;
    }

    public double getBaseCost(){
       return baseCost;
    }

    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }

    public double getAllotedMinutes(){
        return numberOfAllottedMinutes;
     }
 
    public void setAllotedMinutes(double numberOfAllottedMinutes){
        this.numberOfAllottedMinutes = numberOfAllottedMinutes;
     }

    public double getMinutesUsed(){
        return numberOfMinutesUsed;
     }
 
    public void setMinutesUsed(double numberOfMinutesUsed){
         this.numberOfMinutesUsed = numberOfMinutesUsed;
     }

    public double calculateOverageFees(double numberOfMinutesUsed) {
        double overageFees = numberOfMinutesUsed * overageCharge;
        return overageFees;
    }

    public double calculateTax(double subTotal) {
        double tax = (subTotal * 15) / 100;
        return tax;
    }

    public void calculateFinalBill(double baseCost,double overageFees,double tax) {
        double bill = baseCost + overageFees + tax;
        System.out.println("Phone bill statement");
        System.out.println("ID: "+id);
        System.out.println("Plan: " +"Rs."+ String.format("%.2f",baseCost));
        System.out.println("Overage: "+"Rs." + String.format("%.2f",overageFees));
        System.out.println("Tax: "+"Rs." + String.format("%.2f",tax));
        System.out.println("Total: "+"Rs." + String.format("%.2f",bill));
    }
}
