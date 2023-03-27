package src.applitoolscourse.polymorphism;

public class Market {

    public static void squeeze(Fruit fruit) {
        System.out.println("Squeezing....");
        fruit.makeJuice();
    }

    public static void main(String args[]) {
        // Apple apple = new Apple();
        // System.out.println("Apple has "+apple.getCalories()+" calories");
        // apple.makeJuice();

        Fruit fruit = new Apple();
        System.out.println("Apple has " + fruit.getCalories() + " calories");
        ((Apple)fruit).removeSeeds();
        squeeze(fruit);

        fruit = new Banana();
        System.out.println("Banana has " + fruit.getCalories() + " calories");
        ((Banana) fruit).peel();
        squeeze(fruit);
    }

}
