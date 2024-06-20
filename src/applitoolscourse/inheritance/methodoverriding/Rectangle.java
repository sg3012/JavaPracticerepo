package src.applitoolscourse.inheritance.methodoverriding;

public class Rectangle {
    // Private fields of a super class are not inherited in the sub-class
    // If we try to give a stricter access modifier to any member of a parent
    // class in the child class then JAVA will not allow this. For e.g. :
    // if any member in the parent class is declared has public and we try
    // to make it protected in the child class it will throw an error.
    protected double length;
    protected double width;
    protected double sides =4;

    public double getLength(){
        return length;
    }

    public void setLength(double length){
      this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getSides(){
        return sides;
    }

    public void setSides(double sides){
        this.sides = sides;
    }

    public double calculatePerimeter(){
        return (2*(length + width));
    }

    public void print(){
        System.out.println("I am a rectangle");
    }
}


