public class NotFiveStarException extends Exception {

    public NotFiveStarException() {
        super();
    }
    @Override
    public String toString() {
        return "Only 5-Stars Servants are allowed to be the rate-up Servant. Please choose another Servant.";
    }
    @Override
    public String getMessage() {
        return "Only 5-Stars Servants are allowed to be the rate-up Servant. Please choose another Servant.\nSetting rate-up to default Servant: Altria Pendragon.";
    }
}
