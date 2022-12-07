import java.util.Scanner;

public class enemyServant extends Servant {
    public enemyServant(Servant servant) {
        this.id = servant.id;
        this.collectionNo = servant.collectionNo;
        this.name = servant.name;
        this.originalName = servant.originalName;
        this.attribute = servant.attribute;
        this.rarity = servant.rarity;
        this.hpMax = servant.hpMax;
        this.atkMax = servant.atkMax;
        this.lvMax = servant.lvMax;
        this.className = servant.className;
        this.atkGrowth = servant.atkGrowth;
        this.hpGrowth = servant.hpGrowth;
        this.buffs = servant.buffs;
        this.debuffs = servant.debuffs;
    }
    public void calculateDamage(Servant target){
        this.classModifiers.loadModifiers(className);
        double classModifier = classModifiers.multiplier(target.className);
        double attributeModifier = this.attributeModifier(this.attribute, target.attribute);
        System.out.println("Servo inimigo " + this.name + " atacou o Servo "+target.name+".");
        System.out.println("Dano = " + (int)(
                                        (this.atkMax-4000) *
                                        this.buffs*
                                        target.debuffs*
                                        classModifier*
                                        attributeModifier
        ));
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
        System.out.println("Agora voce devera inserir os valores de debuffs do Servo inimigo.");
        System.out.print("Diminuicao da resistencia de carta (Quick/Arts/Buster): ");
        int cardDefenseDown = prompt.nextInt();
        System.out.print("Diminuicao da defesa: ");
        int defenseDown = prompt.nextInt();
        this.debuffs =  fromPercentage(cardDefenseDown)*
                        fromPercentage(defenseDown);
    }
}