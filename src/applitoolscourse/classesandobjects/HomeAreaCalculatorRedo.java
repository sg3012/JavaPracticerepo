package src.applitoolscourse.classesandobjects;
import java.util.Scanner;
// This class showcase how methods can have 
// paramters and return types as objects 
public class HomeAreaCalculatorRedo {
   private Scanner scan = new Scanner(System.in);
   
    public static void main(String args[]){
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen, bathroom);
        System.out.println("Total area is: "+area);
        calculator.scan.close();
    }

    public Rectangle getRoom(){
        System.out.println("Enter the length of your room:");
        double length = scan.nextDouble();
    
        System.out.println("Enter the width of your room:");
        double width = scan.nextDouble();

        return new Rectangle(length,width);
    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}

