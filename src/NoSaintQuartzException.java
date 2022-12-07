
public class NoSaintQuartzException extends Exception{
    protected int saintQuartz;
    public NoSaintQuartzException(int saintQuartz) {
        super();
        this.saintQuartz = saintQuartz;
    }
    @Override
    public String toString() {
        return "Unfortunately, you don't have enough Saint Quartz to perform a multi-Summon. Instead, you'll be summoning a 1x Roll.";
    }
    @Override
    public String getMessage() {
        if(this.saintQuartz > 2) {
            return "Unfortunately, you don't have enough Saint Quartz to perform a multi-Summon. Instead, you'll be summoning a 1x Summon.";
        }
        else {
            return "Unfortunately, you don't have enough Saint Quartz to perform neither a multi-Summon nor a 1x Summon.";
        }
    }
    public int defineCounter() {
        if (this.saintQuartz > 2) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
