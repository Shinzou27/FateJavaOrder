import org.json.JSONObject;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class classModifiers {
    protected int saber, archer, lancer, rider, caster, assassin, berserker, shielder, ruler, alterEgo, avenger, demonGodPillar, beastII, beastI, moonCancer, beastIIIR, foreigner, beastIIIL, beastUnknown, pretender, beastIV, cccFinaleEmiyaAlter;
    protected ArrayList<Integer> multipliers = new ArrayList<>();

    protected String jsonString = "{\"saber\":{\"saber\":1000,\"archer\":500,\"lancer\":2000,\"rider\":1000,\"caster\":1000,\"assassin\":1000,\"berserker\":2000,\"shielder\":1000,\"ruler\":500,\"alterEgo\":1000,\"avenger\":1000,\"demonGodPillar\":1000,\"beastII\":1000,\"beastI\":1000,\"moonCancer\":1000,\"beastIIIR\":1000,\"foreigner\":1000,\"beastIIIL\":1000,\"beastUnknown\":1000,\"pretender\":1000,\"beastIV\":1000,\"cccFinaleEmiyaAlter\":1000},\"archer\":{\"saber\":2000,\"archer\":1000,\"lancer\":500,\"rider\":1000,\"caster\":1000,\"assassin\":1000,\"berserker\":2000,\"shielder\":1000,\"ruler\":500,\"alterEgo\":1000,\"avenger\":1000,\"demonGodPillar\":1000,\"beastII\":1000,\"beastI\":1000,\"moonCancer\":1000,\"beastIIIR\":1000,\"foreigner\":1000,\"beastIIIL\":1000,\"beastUnknown\":1000,\"pretender\":1000,\"beastIV\":1000,\"cccFinaleEmiyaAlter\":1000},\"lancer\":{\"saber\":500,\"archer\":2000,\"lancer\":1000,\"rider\":1000,\"caster\":1000,\"assassin\":1000,\"berserker\":2000,\"shielder\":1000,\"ruler\":500,\"alterEgo\":1000,\"avenger\":1000,\"demonGodPillar\":1000,\"beastII\":1000,\"beastI\":1000,\"moonCancer\":1000,\"beastIIIR\":1000,\"foreigner\":1000,\"beastIIIL\":1000,\"beastUnknown\":1000,\"pretender\":1000,\"beastIV\":1000,\"cccFinaleEmiyaAlter\":1000},\"rider\":{\"saber\":1000,\"archer\":1000,\"lancer\":1000,\"rider\":1000,\"caster\":2000,\"assassin\":500,\"berserker\":2000,\"shielder\":1000,\"ruler\":500,\"alterEgo\":1000,\"avenger\":1000,\"demonGodPillar\":2000,\"beastII\":1000,\"beastI\":2000,\"moonCancer\":1000,\"beastIIIR\":1000,\"foreigner\":1000,\"beastIIIL\":1000,\"beastUnknown\":1000,\"pretender\":1000,\"beastIV\":1000,\"cccFinaleEmiyaAlter\":1000},\"caster\":{\"saber\":1000,\"archer\":1000,\"lancer\":1000,\"rider\":500,\"caster\":1000,\"assassin\":2000,\"berserker\":2000,\"shielder\":1000,\"ruler\":500,\"alterEgo\":1000,\"avenger\":1000,\"demonGodPillar\":2000,\"beastII\":1000,\"beastI\":2000,\"moonCancer\":1000,\"beastIIIR\":1000,\"foreigner\":1000,\"beastIIIL\":1000,\"beastUnknown\":1000,\"pretender\":1000,\"beastIV\":1000,\"cccFinaleEmiyaAlter\":1000},\"assassin\":{\"saber\":1000,\"archer\":1000,\"lancer\":1000,\"rider\":2000,\"caster\":500,\"assassin\":1000,\"berserker\":2000,\"shielder\":1000,\"ruler\":500,\"alterEgo\":1000,\"avenger\":1000,\"demonGodPillar\":2000,\"beastII\":1000,\"beastI\":2000,\"moonCancer\":1000,\"beastIIIR\":1000,\"foreigner\":1000,\"beastIIIL\":1000,\"beastUnknown\":1000,\"pretender\":1000,\"beastIV\":1000,\"cccFinaleEmiyaAlter\":1000},\"berserker\":{\"saber\":1500,\"archer\":1500,\"lancer\":1500,\"rider\":1500,\"caster\":1500,\"assassin\":1500,\"berserker\":1500,\"shielder\":1000,\"ruler\":1500,\"alterEgo\":1500,\"avenger\":1500,\"demonGodPillar\":1500,\"beastII\":1000,\"beastI\":1500,\"moonCancer\":1500,\"beastIIIR\":1000,\"foreigner\":500,\"beastIIIL\":1000,\"beastUnknown\":1000,\"pretender\":1500,\"beastIV\":1000,\"cccFinaleEmiyaAlter\":1000},\"shielder\":{\"saber\":1000,\"archer\":1000,\"lancer\":1000,\"rider\":1000,\"caster\":1000,\"assassin\":1000,\"berserker\":1000,\"shielder\":1000,\"ruler\":1000,\"alterEgo\":1000,\"avenger\":1000,\"demonGodPillar\":1000,\"beastII\":1000,\"beastI\":1000,\"moonCancer\":1000,\"beastIIIR\":1000,\"foreigner\":1000,\"beastIIIL\":1000,\"beastUnknown\":1000,\"pretender\":1000,\"beastIV\":1000,\"cccFinaleEmiyaAlter\":1000},\"ruler\":{\"saber\":1000,\"archer\":1000,\"lancer\":1000,\"rider\":1000,\"caster\":1000,\"assassin\":1000,\"berserker\":2000,\"shielder\":1000,\"ruler\":1000,\"alterEgo\":1000,\"avenger\":500,\"demonGodPillar\":1000,\"beastII\":1000,\"beastI\":1000,\"moonCancer\":2000,\"beastIIIR\":1000,\"foreigner\":1000,\"beastIIIL\":1000,\"beastUnknown\":1000,\"pretender\":1000,\"beastIV\":1000,\"cccFinaleEmiyaAlter\":1000},\"alterEgo\":{\"saber\":500,\"archer\":500,\"lancer\":500,\"rider\":1500,\"caster\":1500,\"assassin\":1500,\"berserker\":2000,\"shielder\":1000,\"ruler\":1000,\"alterEgo\":1000,\"avenger\":1000,\"demonGodPillar\":1000,\"beastII\":1000,\"beastI\":1000,\"moonCancer\":1000,\"beastIIIR\":1200,\"foreigner\":2000,\"beastIIIL\":1200,\"beastUnknown\":1000,\"pretender\":500,\"beastIV\":1000,\"cccFinaleEmiyaAlter\":1200},\"avenger\":{\"saber\":1000,\"archer\":1000,\"lancer\":1000,\"rider\":1000,\"caster\":1000,\"assassin\":1000,\"berserker\":2000,\"shielder\":1000,\"ruler\":2000,\"alterEgo\":1000,\"avenger\":1000,\"demonGodPillar\":1000,\"beastII\":1000,\"beastI\":1000,\"moonCancer\":500,\"beastIIIR\":1000,\"foreigner\":1000,\"beastIIIL\":1000,\"beastUnknown\":1000,\"pretender\":1000,\"beastIV\":1000,\"cccFinaleEmiyaAlter\":1000},\"demonGodPillar\":{\"saber\":2000,\"archer\":2000,\"lancer\":2000,\"rider\":1000,\"caster\":1000,\"assassin\":1000,\"berserker\":2000,\"shielder\":1000,\"ruler\":1000,\"alterEgo\":1000,\"avenger\":500,\"demonGodPillar\":1000,\"beastII\":1000,\"beastI\":1000,\"moonCancer\":1000,\"beastIIIR\":1000,\"foreigner\":1000,\"beastIIIL\":1000,\"beastUnknown\":1000,\"pretender\":1000,\"beastIV\":1000,\"cccFinaleEmiyaAlter\":1000},\"beastII\":{\"saber\":1000,\"archer\":1000,\"lancer\":1000,\"rider\":1000,\"caster\":1000,\"assassin\":1000,\"berserker\":1000,\"shielder\":1000,\"ruler\":1000,\"alterEgo\":1000,\"avenger\":1000,\"demonGodPillar\":1000,\"beastII\":1000,\"beastI\":1000,\"moonCancer\":1000,\"beastIIIR\":1000,\"foreigner\":1000,\"beastIIIL\":1000,\"beastUnknown\":1000,\"pretender\":1000,\"beastIV\":1000,\"cccFinaleEmiyaAlter\":1000},\"beastI\":{\"saber\":2000,\"archer\":2000,\"lancer\":2000,\"rider\":1000,\"caster\":1000,\"assassin\":1000,\"berserker\":2000,\"shielder\":1000,\"ruler\":1000,\"alterEgo\":1000,\"avenger\":500,\"demonGodPillar\":1000,\"beastII\":1000,\"beastI\":1000,\"moonCancer\":1000,\"beastIIIR\":1000,\"foreigner\":1000,\"beastIIIL\":1000,\"beastUnknown\":1000,\"pretender\":1000,\"beastIV\":1000,\"cccFinaleEmiyaAlter\":1000},\"moonCancer\":{\"saber\":1000,\"archer\":1000,\"lancer\":1000,\"rider\":1000,\"caster\":1000,\"assassin\":1000,\"berserker\":2000,\"shielder\":1000,\"ruler\":500,\"alterEgo\":1000,\"avenger\":2000,\"demonGodPillar\":1000,\"beastII\":1000,\"beastI\":1000,\"moonCancer\":1000,\"beastIIIR\":1200,\"foreigner\":1000,\"beastIIIL\":1000,\"beastUnknown\":1000,\"pretender\":1000,\"beastIV\":1000,\"cccFinaleEmiyaAlter\":1200},\"beastIIIR\":{\"saber\":1000,\"archer\":1000,\"lancer\":1000,\"rider\":1000,\"caster\":1000,\"assassin\":1000,\"berserker\":1000,\"shielder\":1000,\"ruler\":1000,\"alterEgo\":1000,\"avenger\":1000,\"demonGodPillar\":1000,\"beastII\":1000,\"beastI\":1000,\"moonCancer\":1000,\"beastIIIR\":1000,\"foreigner\":1000,\"beastIIIL\":1000,\"beastUnknown\":1000,\"pretender\":1000,\"beastIV\":1000,\"cccFinaleEmiyaAlter\":1000},\"foreigner\":{\"saber\":1000,\"archer\":1000,\"lancer\":1000,\"rider\":1000,\"caster\":1000,\"assassin\":1000,\"berserker\":2000,\"shielder\":1000,\"ruler\":1000,\"alterEgo\":500,\"avenger\":1000,\"demonGodPillar\":1000,\"beastII\":1000,\"beastI\":1000,\"moonCancer\":1000,\"beastIIIR\":1000,\"foreigner\":2000,\"beastIIIL\":1200,\"beastUnknown\":1000,\"pretender\":2000,\"beastIV\":1000,\"cccFinaleEmiyaAlter\":1000},\"beastIIIL\":{\"saber\":1000,\"archer\":1000,\"lancer\":1000,\"rider\":1000,\"caster\":1000,\"assassin\":1000,\"berserker\":1000,\"shielder\":1000,\"ruler\":1000,\"alterEgo\":1000,\"avenger\":1000,\"demonGodPillar\":1000,\"beastII\":1000,\"beastI\":1000,\"moonCancer\":1000,\"beastIIIR\":1000,\"foreigner\":1000,\"beastIIIL\":1000,\"cccFinaleEmiyaAlter\":1000},\"beastUnknown\":{\"saber\":1000,\"archer\":1000,\"lancer\":1000,\"rider\":1000,\"caster\":500,\"assassin\":1000,\"berserker\":1000,\"shielder\":1000,\"ruler\":1000,\"alterEgo\":1000,\"avenger\":1000,\"demonGodPillar\":1000,\"beastII\":1000,\"beastI\":1000,\"moonCancer\":1000,\"beastIIIR\":1000,\"foreigner\":1000,\"beastUnknown\":1000,\"pretender\":1000,\"beastIV\":1000,\"cccFinaleEmiyaAlter\":1000},\"pretender\":{\"saber\":1500,\"archer\":1500,\"lancer\":1500,\"rider\":500,\"caster\":500,\"assassin\":500,\"berserker\":2000,\"shielder\":1000,\"ruler\":1000,\"alterEgo\":2000,\"avenger\":1000,\"demonGodPillar\":1000,\"beastII\":1000,\"beastI\":1000,\"moonCancer\":1000,\"beastIIIR\":1000,\"foreigner\":500,\"beastIIIL\":1000,\"beastUnknown\":1000,\"pretender\":1000,\"beastIV\":1000,\"cccFinaleEmiyaAlter\":1000},\"beastIV\":{\"saber\":1000,\"archer\":1000,\"lancer\":1000,\"rider\":1000,\"caster\":500,\"assassin\":1000,\"berserker\":1000,\"shielder\":1000,\"ruler\":1000,\"alterEgo\":1000,\"avenger\":1000,\"demonGodPillar\":1000,\"beastII\":1000,\"beastI\":1000,\"moonCancer\":1000,\"beastIIIR\":1000,\"foreigner\":1000,\"beastUnknown\":1000,\"pretender\":1000,\"beastIV\":1000,\"cccFinaleEmiyaAlter\":1000},\"cccFinaleEmiyaAlter\":{\"saber\":1000,\"archer\":1000,\"lancer\":1000,\"rider\":1000,\"caster\":1000,\"assassin\":1000,\"berserker\":1000,\"shielder\":1000,\"ruler\":1000,\"alterEgo\":1000,\"avenger\":1000,\"demonGodPillar\":1000,\"beastII\":1000,\"beastI\":1000,\"moonCancer\":1000,\"beastIIIR\":1000,\"foreigner\":1000,\"beastIIIL\":1000,\"beastUnknown\":1000,\"pretender\":1000,\"beastIV\":1000}}";
    protected JSONObject json = new JSONObject(jsonString);

    public classModifiers() {
    }
    public void loadModifiers(String className) {
        this.saber = json.getJSONObject(className).getInt("saber");
        this.archer = json.getJSONObject(className).getInt("archer");
        this.lancer = json.getJSONObject(className).getInt("lancer");
        this.rider = json.getJSONObject(className).getInt("rider");
        this.caster = json.getJSONObject(className).getInt("caster");
        this.assassin = json.getJSONObject(className).getInt("assassin");
        this.berserker = json.getJSONObject(className).getInt("berserker");
        this.shielder = json.getJSONObject(className).getInt("shielder");
        this.ruler = json.getJSONObject(className).getInt("ruler");
        this.alterEgo = json.getJSONObject(className).getInt("alterEgo");
        this.avenger = json.getJSONObject(className).getInt("avenger");
        this.demonGodPillar = json.getJSONObject(className).getInt("demonGodPillar");
        this.beastII = json.getJSONObject(className).getInt("beastII");
        this.beastI = json.getJSONObject(className).getInt("beastI");
        this.moonCancer = json.getJSONObject(className).getInt("moonCancer");
        this.beastIIIR = json.getJSONObject(className).getInt("beastIIIR");
        this.foreigner = json.getJSONObject(className).getInt("foreigner");
        this.beastIIIL = json.getJSONObject(className).getInt("beastIIIL");
        this.beastUnknown = json.getJSONObject(className).getInt("beastUnknown");
        this.pretender = json.getJSONObject(className).getInt("pretender");
        this.beastIV = json.getJSONObject(className).getInt("beastIV");
        this.cccFinaleEmiyaAlter = json.getJSONObject(className).getInt("cccFinaleEmiyaAlter");
        this.multipliers.add(this.saber);
        this.multipliers.add(this.archer);
        this.multipliers.add(this.lancer);
        this.multipliers.add(this.rider);
        this.multipliers.add(this.caster);
        this.multipliers.add(this.assassin);
        this.multipliers.add(this.berserker);
        this.multipliers.add(this.shielder);
        this.multipliers.add(this.ruler);
        this.multipliers.add(this.alterEgo);
        this.multipliers.add(this.avenger);
        this.multipliers.add(this.demonGodPillar);
        this.multipliers.add(this.beastII);
        this.multipliers.add(this.beastI);
        this.multipliers.add(this.moonCancer);
        this.multipliers.add(this.beastIIIR);
        this.multipliers.add(this.foreigner);
        this.multipliers.add(this.beastIIIL);
        this.multipliers.add(this.beastUnknown);
        this.multipliers.add(this.pretender);
        this.multipliers.add(this.beastIV);
        this.multipliers.add(this.cccFinaleEmiyaAlter);
    }
    
    public double multiplier(String targetClass) {
        Field[] fields = classModifiers.class.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            if (targetClass.equals(fields[i].getName())) {
                double multiplier = (double)multipliers.get(i)/1000;
                return multiplier;
            }
        }
        return 1;
    }

    @Override
    public String toString() {
        return "Class Modifiers:" +
                "\nsaber=" + saber +
                ", \narcher=" + archer +
                ", \nlancer=" + lancer +
                ", \nrider=" + rider +
                ", \ncaster=" + caster +
                ", \nassassin=" + assassin +
                ", \nberserker=" + berserker +
                ", \nshielder=" + shielder +
                ", \nruler=" + ruler +
                ", \nalterEgo=" + alterEgo +
                ", \navenger=" + avenger +
                ", \ndemonGodPillar=" + demonGodPillar +
                ", \nbeastII=" + beastII +
                ", \nbeastI=" + beastI +
                ", \nmoonCancer=" + moonCancer +
                ", \nbeastIIIR=" + beastIIIR +
                ", \nforeigner=" + foreigner +
                ", \nbeastIIIL=" + beastIIIL +
                ", \nbeastUnknown=" + beastUnknown +
                ", \npretender=" + pretender +
                ", \nbeastIV=" + beastIV +
                ", \ncccFinaleEmiyaAlter=" + cccFinaleEmiyaAlter +
                '}';
    }
}
