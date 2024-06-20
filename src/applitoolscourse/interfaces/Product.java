package src.applitoolscourse.interfaces;

public interface Product {
    double getPrice();
    void setPrice(double price);

    String getName();
    void setName(String name);

    String getColor();
    void setColor(String color);

    // The keyword default in below line allows a user to
    // declare and define a method within the interface itself.
    default String getBarCode(){
        return "no barcode";
    }

}
