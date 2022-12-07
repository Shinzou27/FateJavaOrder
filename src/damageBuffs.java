public interface damageBuffs {
    public void setBuffs();
    public void setDebuffs();
    default double fromPercentage(int buff) {
        double aux = buff;
        return (aux/100)+1;
    }
    default double attributeModifier(String attackerAtt, String targetAtt) {
        //Sky > Earth > Man > Sky | Star <> Beast

        if (attackerAtt.equals("sky") &&
            targetAtt.equals("earth")) return 1.1;
        if (attackerAtt.equals("sky") &&
            targetAtt.equals("human")) return 0.9;

        if (attackerAtt.equals("earth") &&
            targetAtt.equals("human")) return 1.1;
        if (attackerAtt.equals("earth") &&
            targetAtt.equals("sky")) return 0.9;

        if (attackerAtt.equals("human") &&
            targetAtt.equals("sky")) return 1.1;
        if (attackerAtt.equals("human") &&
            targetAtt.equals("earth")) return 0.9;

        else return 1;
    }
}
