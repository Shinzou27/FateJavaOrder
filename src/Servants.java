public class Servants implements catchServant {
    protected Servant[] servants;

    public Servant[] getServants() {
        return servants;
    }

    public void setServants(Servant[] servants) {
        this.servants = servants;
    }
    public Servant getServant(int collectionNo) throws ArrayIndexOutOfBoundsException {
        for (int i = 0; i < servants.length; i++) {
            if (servants[i].collectionNo == collectionNo) {
                return servants[i];
            }
        }
        return null;
    }
    public Servant getServant(String name) throws ArrayIndexOutOfBoundsException {
        for (int k = 0; k < servants.length; k++) {
            if(name.equalsIgnoreCase(servants[k].name)) {
                return servants[k];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String toString = "\n";
        for (Servant servant: servants) {
            toString += "Collection No.: " + servant.collectionNo + " | \t" + servant.name + '\n';
        }
        return toString;
    }
}
