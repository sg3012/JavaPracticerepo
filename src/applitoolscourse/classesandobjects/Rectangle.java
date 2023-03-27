package src.applitoolscourse.classesandobjects;
// This class represents the blue print of a rectangle object.
// And calculates it's area and perimeter.
public class Rectangle{
    private double length; 
    private double width;

    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width){
        this.length = length; // we can set the class variables by assigning a value explicitly.
        setWidth(width); // or, we can set the class variables by setter method.
    }
    
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

    public double calculatePerimeter(){
        return 2*(length+width);
    }

    public double calculateArea(){
        return length*width;
    }
}
