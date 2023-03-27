package src.applitoolscourse.inheritance;

public class BirthdayCake extends Cake{
    protected int candles;

    public BirthdayCake(){
        setFlavor("Banana");
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
    
}
