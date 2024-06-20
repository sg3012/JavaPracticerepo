package src.applitoolscourse.polymorphism;

public class Apple extends Fruit {

    public Apple(){
        setCalories(200);
    }

    public void removeSeeds(){
      System.out.println("Remove seeds of Apple before eating");
    }

    @Override
    public void makeJuice(){
        System.out.println("Apple Juice is made");
    }

}
