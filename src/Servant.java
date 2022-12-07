import org.json.JSONException;

import java.util.Scanner;

public class Servant extends servantClass implements combatFormulas, damageBuffs, Comparable<Servant> {
    protected int id;
    protected int collectionNo;
    protected String name;
    protected String originalName;
    protected String attribute;
    protected int rarity;
    protected int hpMax;
    protected int atkMax;
    protected int lvMax;
    protected int[] atkGrowth;
    protected int[] hpGrowth;
    protected double buffs = 1;
    protected double debuffs = 1;

    public Servant() throws JSONException {
    }
    @Override
    public void setBuffs() {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Agora voce devera inserir os valores de buffs.");
        System.out.print("Buff de carta (Quick/Arts/Buster): ");
        int cardPerformanceUp = prompt.nextInt();
        System.out.print("Buff de aumento de ataque: ");
        int atkUp = prompt.nextInt();
        System.out.print("Buff de aumento de dano do NP: ");
        int npDMG = prompt.nextInt();
        System.out.print("Buff de dano especial: ");
        int powerModDMG = prompt.nextInt();
        System.out.print("Buff de multiplicador especial de NP: ");
        int npExtraDMG = prompt.nextInt();
        this.buffs = fromPercentage(cardPerformanceUp)*
                        fromPercentage(atkUp)*
                        fromPercentage(npDMG)*
                        fromPercentage(powerModDMG)*
                        fromPercentage(npExtraDMG);
    }

    @Override
    public void setDebuffs() {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Agora voce devera inserir os valores de debuffs do seu Servo.");
        System.out.print("Diminuicao da resistencia de carta (Quick/Arts/Buster): ");
        int cardDefenseDown = prompt.nextInt();
        System.out.print("Diminuicao da defesa: ");
        int defenseDown = prompt.nextInt();
        this.debuffs = fromPercentage(cardDefenseDown)*
                        fromPercentage(defenseDown);
    }
    public void setDebuffs(int cardDefenseDown) {
        this.debuffs = fromPercentage(cardDefenseDown);
    }

    public void calculateDamage(enemyServant target){
        this.classModifiers.loadModifiers(className);
        double classModifier = classModifiers.multiplier(target.className);
        double attributeModifier = this.attributeModifier(this.attribute, target.attribute);
        System.out.println("Servo " + this.name + " atacou o Servo inimigo "+target.name+".");
        System.out.println("Dano = " + (int)(
                                    this.atkMax *
                                    this.buffs*
                                    target.debuffs*
                                    classModifier*
                                    attributeModifier
                                    ));

    }
    public void calculateDamage(generalEnemy target){
        this.classModifiers.loadModifiers(className);
        double classModifier = classModifiers.multiplier(target.className);
        double attributeModifier = this.attributeModifier(this.attribute, target.attribute);
        System.out.println("Servo " + this.name + " atacou o inimigo " + target.name + ".");
        System.out.println("Dano = " + (int)(
                                        this.atkMax *
                                        this.buffs*
                                        target.debuffs*
                                        classModifier*
                                        attributeModifier
        ));
    }

    @Override
    public int compareTo(Servant o) {
        return this.name.compareTo(o.name);
    }
    public void grail() {
        this.hpMax = hpGrowth[99];
        this.atkMax = atkGrowth[99];
        this.lvMax = 100;
    }
    public void superGrail() {
        this.hpMax = hpGrowth[119];
        this.atkMax = atkGrowth[119];
        this.lvMax = 120;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCollectionNo() {
        return collectionNo;
    }

    public void setCollectionNo(int collectionNo) {
        this.collectionNo = collectionNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public int getHpMax() {
        return hpMax;
    }

    public void setHpMax(int hpMax) {
        this.hpMax = hpMax;
    }

    public int getAtkMax() {
        return atkMax;
    }

    public void setAtkMax(int atkMax) {
        this.atkMax = atkMax;
    }

    @Override
    public String toString() {
        return "-----" + name + "-----\n" +
                "Collection Number: " + collectionNo + '\n' +
                "Class: " + className.toUpperCase() + " | " + "Rarity: " + rarity + " STARS\n" +
                "Attribute: " + attribute.toUpperCase() + '\n' +
                "\tLevel: " + lvMax + '\n' +
                "ATK: " + atkMax + " | " + "HP: " + hpMax + '\n';
    }
}
/*
-----| Nagao Kagetora |-----
Collection Number: 252
Class: LANCER | Rarity: 4 STARS
Attribute: MAN
      Level: 80
ATK: 9617 | HP: 11360
 */