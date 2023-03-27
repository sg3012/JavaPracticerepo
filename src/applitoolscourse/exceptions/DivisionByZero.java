package src.applitoolscourse.exceptions;

public class DivisionByZero {

     public static void divide(){
         
        try {
            int c = 30/0;
            System.out.println("Result: "+c);
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero is not allowed in JAVA."+
            "Please divide by other number");
        }
        finally{
            System.out.println("Division is fun");
        }

     }
    public static void main(String args[]){
       divide();
    }
    
}
