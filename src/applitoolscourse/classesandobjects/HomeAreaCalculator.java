package src.applitoolscourse.classesandobjects;
public class HomeAreaCalculator {
    public static void main(String[] args) {
        /***********************
         RECTANGLE 1
         ***********************/
        Rectangle room1 = new Rectangle();
        room1.setLength(80);
        room1.setWidth(30);
        double area1 = room1.calculateArea();

        /***********************
         RECTANGLE 2
         ***********************/
        Rectangle room2 = new Rectangle(90,50);
        double area2 = room2.calculateArea();
        double totalArea = area1 + area2;
        System.out.println("Area of both rooms is: "+totalArea);
        System.out.println("Instance of room2 is: "+room2.getClass().getSimpleName());
    }
}