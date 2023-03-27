package src.applitoolscourse.polymorphism;

public class Banana extends Fruit {

    public Banana(){
        setCalories(600);
    }

    public void peel(){
      System.out.println("Peel banana skin before eating");
    }

    @Override
    public void makeJuice(){
        System.out.println("Banana Juice is made");
    }
    
}
