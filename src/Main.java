/*
Feito por: Felipe Cassiano Barbosa


Caso queira excluir o arquivo nice_servant_lang_en.json por ser
muito pesado, o basic_servant.json pode substitui-lo na linha 24
ao criar o arquivo, mas parte do código quebrará (ex.: métodos
grail, superGrail, que precisam do lvMax, hpGrowth e atkGrowth).
 */

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner prompt = new Scanner(System.in);
        Account acc = new Account();
        System.out.println("Insira seu nome de Mestre:");
        acc.masterName = prompt.nextLine();
        Gson gson = new Gson();
        try {
            File arquivo = new File("nice_servant_lang_en.json");
            FileReader fileReader = new FileReader(arquivo);
            JsonReader reader = new JsonReader(fileReader);
            System.out.println("Archive loaded: " + arquivo.exists());
            acc.inventory = gson.fromJson(reader, Servants.class);
            fileReader.close();
        }
        catch (FileNotFoundException exception) {
            System.out.println("Arquivo nao encontrado, veja se o caminho do arquivo esta correto.");
        }
        Servant mash = acc.inventory.getServant("Mash Kyrielight");
        acc.claimServant(mash);
        int choice = 0;
        while(choice != 9) {
            System.out.println("-------------------------------------------------------------------------------------------------");
            System.out.println("Mestre: " + acc.masterName);
            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
            System.out.println("1 para rodar");
            System.out.println("2 para ver a lista de servos na conta");
            System.out.println("3 para adicionar Saint Quartz na conta");
            System.out.println("4 para simular dano de um Servo.");
            System.out.println("5 para mostrar todos os Servos do jogo.");
            System.out.println("6 para ver a conta.");
            System.out.println("8 para gravar os dados da conta no computador.");
            System.out.println("9 para sair");
            System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
            choice = prompt.nextInt();
            if (choice == 1) {
                System.out.println("Insira o Servo para rodar.");
                prompt.nextLine();
                Servant servant = acc.inventory.getServant(prompt.nextLine());
                int choiceRoll = 0;
                while (choiceRoll == 0) {
                    acc.roll(servant);
                    System.out.println("---------------------");
                    System.out.println("Digite 0 para continuar rodando.");
                    System.out.println("Digite 1 para adicionar um Servo na conta.");
                    System.out.println("Digite 2 para sair.");
                    System.out.println("---------------------");
                    choiceRoll = prompt.nextInt();
                    if (choiceRoll == 1) {
                        System.out.println("Digite o indice do servo a adicionar");
                        int index = prompt.nextInt();
                        acc.claimServant(index);
                        System.out.println("O Servo " + acc.rollTest.get(index).name + " foi adicionado a conta.");
                    }
                    if (choiceRoll == 2) {
                        break;
                    }
                }
            }
            if (choice == 2) {
                int choiceShowServants = 0;
                acc.showServants();
                while (choiceShowServants != 9){
                    menuShowServants();
                    choiceShowServants = prompt.nextInt();
                    if (choiceShowServants == 1) {
                        System.out.println("Digite o Collection Number do Servo desejado.");
                        int collectionNo = prompt.nextInt();
                        Servant servant = acc.getServant(collectionNo);
                        System.out.println(servant);
                    }
                    if (choiceShowServants == 2) {
                        System.out.println("Digite o Collection Number do Servo desejado.");
                        int collectionNo = prompt.nextInt();
                        Servant servant = acc.getServant(collectionNo);
                        servant.grail();
                    }
                    if (choiceShowServants == 3) {
                        System.out.println("Digite o Collection Number do Servo desejado.");
                        int collectionNo = prompt.nextInt();
                        Servant servant = acc.getServant(collectionNo);
                        servant.superGrail();
                    }
                    if (choiceShowServants == 4) {
                        System.out.println("Digite o Collection Number do Servo desejado.");
                        int collectionNo = prompt.nextInt();
                        Servant servant = acc.getServant(collectionNo);
                        acc.servantsInventory.remove(servant);
                    }
                }
            }
            if (choice == 3) {
                System.out.println("Insira a quantidade desejada de Saint Quartz para adicionar.");
                acc.updateSQ(prompt.nextInt());
            }
            if (choice == 4) {
                int choiceCalculateDamage = 0;
                while (choiceCalculateDamage != 9) {
                    menuCalculateDamage();
                    choiceCalculateDamage = prompt.nextInt();
                    if (choiceCalculateDamage == 1) {
                        acc.showServants();
                        System.out.println("Escolha um dos Servos acima com base no Collection Number.");
                        int collectionNo = prompt.nextInt();
                        Servant servant = acc.getServant(collectionNo);
                        System.out.println("Digite o nome de um Servo inimigo.");
                        String enemyName = prompt.next();
                        enemyServant enemyServant = new enemyServant(acc.inventory.getServant(enemyName));
                        System.out.println(enemyServant);
                        servant.setBuffs();
                        enemyServant.setDebuffs();
                        servant.calculateDamage(enemyServant);
                    }
                    if (choiceCalculateDamage == 2) {
                        acc.showServants();
                        System.out.println("Escolha um dos Servos acima com base no Collection Number.");
                        int collectionNo = prompt.nextInt();
                        Servant servant = acc.getServant(collectionNo);
                        System.out.println("Escolha a classe do inimigo.");
                        String className = prompt.next();
                        System.out.println(className);
                        generalEnemy enemy = new generalEnemy(className);
                        System.out.println(enemy);
                        servant.setBuffs();
                        enemy.setDebuffs();
                        servant.calculateDamage(enemy);
                    }
                    if (choiceCalculateDamage == 3) {
                        System.out.println("Digite o nome de um Servo inimigo.");
                        String enemyName = prompt.next();
                        enemyServant enemyServant = new enemyServant(acc.inventory.getServant(enemyName));
                        System.out.println(enemyServant);
                        acc.showServants();
                        System.out.println("Escolha um dos Servos acima com base no Collection Number.");
                        int collectionNo = prompt.nextInt();
                        Servant servant = acc.getServant(collectionNo);
                        enemyServant.setBuffs();
                        servant.setDebuffs();
                        enemyServant.calculateDamage(servant);
                    }
                }

            }
            if (choice == 5) {
                System.out.println(acc.inventory);
            }
            if (choice == 6) {
                System.out.println(acc);
            }
            if (choice == 8) {
                AccountExport a = new AccountExport();
                a.export(acc);
            }
        }
        prompt.close();
        Screen.getWindows()[0].dispose();
    }

    public static void menuShowServants() {
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println("O que deseja fazer agora?");
        System.out.println("1 - Mostrar dados de um Servo");
        System.out.println("2 - Dar graal para um Servo");
        System.out.println("3 - Dar super graal para um Servo");
        System.out.println("4 - Queimar um Servo");
        System.out.println("9 para sair");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
    }

    private static void menuCalculateDamage() {
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println("Escolha uma das opcoes abaixo:\n");
        System.out.println("1 - Servo da sua conta atacando um Servo inimigo.");
        System.out.println("2 - Servo da sua conta atacando um inimigo aleatorio.");
        System.out.println("3 - Servo inimigo atacando um Servo da sua conta.");
        System.out.println("9 - Sair");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
    }
}
