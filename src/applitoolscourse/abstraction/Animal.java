package src.applitoolscourse.abstraction;

public abstract class Animal {
    public abstract void makeSound();

    public void eat(Animal animal){
        System.out.println(animal+" eats");
    }
}
