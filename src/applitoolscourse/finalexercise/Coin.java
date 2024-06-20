package src.applitoolscourse.finalexercise;
import java.util.Random;

public class Coin {
    private String side;
    public static String HEADS = "heads";
    public static String TAILS = "tails";

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void flip(){
        Random random = new Random();

        if(random.nextBoolean()){
            setSide(HEADS);
        }
        else{
            setSide(TAILS);
        }

    }


}
