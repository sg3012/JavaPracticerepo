package src.applitoolscourse.inheritance.methodoverriding;

public class Square extends Rectangle {
    // This is called method overriding where 
    // calculatePerimeter() method from parent class 
    // Rectangle with exact same signature is used here
    // in child class Square but different implementation

    @Override
    public double calculatePerimeter(){
        return sides*length;
    }  
    
    // This is called method overloading using inheritance
    // where a method from the parent class is overloaded
    // in the child class with different parameters list
    public void print(String what){
        System.out.println("I am a "+ what);
    }
}
