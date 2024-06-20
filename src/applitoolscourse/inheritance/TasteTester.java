package src.applitoolscourse.inheritance;

public class TasteTester {

    public static void main(String args[]){
        BirthdayCake birthdayCake = new BirthdayCake();
        WeddingCake weddingCake = new WeddingCake();

        birthdayCake.setPrice(300);
        System.out.println("Birthday cake price is "+ birthdayCake.getPrice());
        System.out.println("Birthday cake flavor is "+ birthdayCake.getFlavor());

        weddingCake.setPrice(2500);
        System.out.println("Wedding cake price is "+ weddingCake.getPrice());
        System.out.println("Wedding cake flavor is "+ weddingCake.getFlavor());

    }

}
