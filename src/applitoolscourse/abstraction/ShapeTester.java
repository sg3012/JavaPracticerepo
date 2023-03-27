package src.applitoolscourse.abstraction;

public class ShapeTester {

    public static void main(String args[]){
        Shape rectangle  = new Rectangle(50, 30);
        rectangle.print();
        System.out.println(rectangle.calculateArea());
    }
    
}
