import java.util.Random;

public abstract class GachaFormulas {
    protected double rateUp;
    protected int mapProbabilities() {
        int mapRNG = new Random().nextInt(100000);
        if (mapRNG < 1000) {
            if(mapRNG < (this.rateUp * 1000)){
                return 6;
            }
            return 5;
        }
        else if (mapRNG < 4000) {
            return 4;
        }
        else {
            return 3;
        }
    }
}
