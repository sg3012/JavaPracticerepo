package src.applitoolscourse.inheritance;

public class WeddingCake extends Cake {
    protected int tiers;

    public WeddingCake(){
        setFlavor("Choco Lava");
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }

}
