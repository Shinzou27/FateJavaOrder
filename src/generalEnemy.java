import java.util.*;

public class generalEnemy implements damageBuffs {
    protected String name;
    protected String attribute;
    protected String className;
    protected double debuffs;
    protected HashSet<String> enemyNames = new HashSet<>();
    protected HashSet<String> enemyAttributes = new HashSet<>();
    
    public generalEnemy(String className) {
        generateEnemyName();
        generateEnemyAttribute();
        this.className = className;
    }

    @Override
    public void setBuffs() {
        System.out.println("Esta unidade não possui buffs.");
    }
    @Override
    public void setDebuffs() {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Agora voce devera inserir os valores de debuffs do inimigo.");
        System.out.print("Diminuicao da resistencia de carta (Quick/Arts/Buster): ");
        int cardDefenseDown = prompt.nextInt();
        System.out.print("Diminuicao da defesa: ");
        int defenseDown = prompt.nextInt();
        this.debuffs =  fromPercentage(cardDefenseDown)*
                        fromPercentage(defenseDown);
    }
    private void generateEnemyName() {
        enemyNames.add("Skeleton");
        enemyNames.add("Wyvern");
        enemyNames.add("Golem");
        enemyNames.add("Snake");
        enemyNames.add("Bicorn");
        enemyNames.add("Crab");
        enemyNames.add("Tsuchigumo");
        enemyNames.add("Oni");
        enemyNames.add("Pirate");
        enemyNames.add("Roman Soldier");
        enemyNames.add("French Soldier");
        enemyNames.add("Uruk Soldier");
        enemyNames.add("Zombie");
        enemyNames.add("Book");
        enemyNames.add("Hand of Dawn");
        enemyNames.add("Shadow Servant");
        Random rdm = new Random();
        int chosen = rdm.nextInt(enemyNames.size());
        int index = 0;
        for (String enemyName : enemyNames) {
            if (chosen == index) {
                this.name = enemyName;
                break;
            }
            index++;
        }
    }
    private void generateEnemyAttribute() {
        enemyAttributes.add("human");
        enemyAttributes.add("earth");
        enemyAttributes.add("sky");
        enemyAttributes.add("beast");
        enemyAttributes.add("star");
        Random rdm = new Random();
        int chosen = rdm.nextInt(enemyAttributes.size());
        int index = 0;
        for (String enemyAttribute : enemyAttributes) {
            if (chosen == index) {
                this.attribute = enemyAttribute;
                break;
            }
            index++;
        }
    }

    @Override
    public String toString() {
        return  "\n------------------\nEnemy: "+ name + '\n' +
                "Class: " + className.toUpperCase() + " | Attribute: " + attribute +
                "\n------------------\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getDebuffs() {
        return debuffs;
    }

    public void setDebuffs(double debuffs) {
        this.debuffs = debuffs;
    }
}


