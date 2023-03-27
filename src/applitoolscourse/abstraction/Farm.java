package src.applitoolscourse.abstraction;

public class Farm {
    
    public static void main(String args[]){
        Animal pig = new Pig();
        pig.makeSound();

        Duck donald = new Duck();
        donald.makeSound();

        Pig porky = new Pig();
        porky.makeSound();
    }
}
