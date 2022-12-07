import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collections;

public class Account extends Gacha implements catchServant {
    protected String masterName;
    protected int saintQuartz;
    protected ArrayList<Servant> servantsInventory = new ArrayList<>();

    public Account(){
    }

    public void claimServant(Servant servant) {
        servantsInventory.add(servant);
        Collections.sort(servantsInventory);
    }
    public void claimServant(int index) {
        int i = 0;
        while (itr.hasNext()) {
            if (i == index) {
                servantsInventory.add(rollTest.get(index));
                Collections.sort(servantsInventory);
                break;
            }
            i++;
        }
    }

    public void showServants() {
        for (Servant servant : servantsInventory) {
            System.out.println("Collection No.: " + servant.collectionNo + " | \t" + servant.name);
        }
    }
    
    public void roll(Servant servant) throws MalformedURLException {
        int counter = 10;
        try {
            if(servant.rarity != 5) {
                throw new NotFiveStarException();
            }
        } catch (NotFiveStarException e) {
            System.err.println(e.getMessage());
            servant = inventory.getServant(2);
        }
        try {
            if (saintQuartz < 30) {
                throw new NoSaintQuartzException(saintQuartz);
            }
        }
        catch (NoSaintQuartzException e) {
            System.err.println(e.getMessage());
            counter = e.defineCounter();
        }
        if (counter > 0) {
            System.out.println("\n" + counter + " Multi-Roll:");
        }
        this.setRateUp(servant.collectionNo);
        for(int i = 0; i < counter; i++) {
            this.setRoll(i);
            saintQuartz -= 3;
        }
        if (counter > 0) {
            Screen gachaGUI = new Screen();
            gachaGUI.getRoll(this.rollTest, collectionNoRateUp);
            gachaGUI.setVisible(true);
            gachaGUI.toFront();
        }
        System.out.println(saintQuartz + "SQ remaining.");
    }
    
    public void updateSQ(int value) {
        System.out.println("Saint Quartz before: " + saintQuartz);
        saintQuartz += value;
        System.out.println("Saint Quartz after: " + saintQuartz);
    }

    @Override
    public Servant getServant(String name) {
        for (Servant servant : servantsInventory) {
            if (servant.name.equals(name)) {
                return servant;
            }
        }
        return null;
    }

    @Override
    public Servant getServant(int collectionNo) {
        for (Servant servant : servantsInventory) {
            if (servant.collectionNo == collectionNo) {
                return servant;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String servants = "";
        for (Servant servant: servantsInventory) {
            servants += "Collection No.: " + servant.collectionNo + " | \t" + servant.name + '\n';
        }
        return masterName + "'s Account\n" +
                "Saint Quartz: " + saintQuartz + '\n' +
                "Servants they have:\n" +  servants;
    }
}
