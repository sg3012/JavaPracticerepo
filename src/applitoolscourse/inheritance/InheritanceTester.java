package src.applitoolscourse.inheritance;
import src.applitoolscourse.inheritance.methodoverriding.Rectangle;
import src.applitoolscourse.inheritance.methodoverriding.Square;

public class InheritanceTester {

    public static void main(String args[]){
        // Rectangle rectangle  = new Rectangle();
        // rectangle.print();

        // Square square = new Square();
        // square.print("square");

        // testSquareOverride();
        Mother mom = new Mother();
        mom.setName("Preeti");
        System.out.println(mom.getName()+" is a "+mom.getGender());
    }

    public static void testSquareOverride(){
      Rectangle rectangle = new Rectangle();
      rectangle.setLength(240);
      rectangle.setWidth(190);
      System.out.println(rectangle.calculatePerimeter());

      Square square = new Square();
      square.setLength(4);
      square.setWidth(4);
      System.out.println(square.calculatePerimeter()); // When child class square
                                                       // calls the overriden method
                                                       // calculatePerimeter() from the
                                                       // parent class it actually calls
                                                       // the overriding method of the same name
                                                       // from child class square.
    }
}
