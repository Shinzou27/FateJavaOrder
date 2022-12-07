import java.util.*;

public abstract class Gacha extends GachaFormulas {
    protected Servants inventory;
    protected int collectionNoRateUp;
    protected Set<Servant> roll = new TreeSet<>();
    protected Iterator<Servant> itr;
    public ArrayList<Servant> rollTest = new ArrayList<>();
    public void setRateUp(int collectionNo) {
        roll.clear();
        rollTest.clear();
        super.rateUp = 0.8;
        this.collectionNoRateUp = collectionNo;
    }
    public void setRoll(int i) {
        Random rng = new Random();
        Servant sortedServant;
        int rarity = mapProbabilities();
        while (true) {
            int collectionNo = rng.nextInt(inventory.servants.length)+1;
            sortedServant = inventory.getServant(collectionNo);
            if (rarity == 6 && collectionNo == collectionNoRateUp) {

                System.out.println("---------------------");
                System.out.println("| "+i+" - " + sortedServant.name + " | " + sortedServant.rarity + " Stars |");
                System.out.println("---------------------");
                break;
            }
            if(sortedServant.rarity == rarity) {
                System.out.println(i+" - " + sortedServant.name + " | " + sortedServant.rarity + " Stars");
                break;
            }
        }
        this.roll.add(sortedServant);
        this.rollTest.add(sortedServant);
        this.itr = roll.iterator();
    }
}
