import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Objects
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        //Game variables
        String[] enemies = {"Skellyton", "Zombie", "Berserker", "Rexxar from Hearthstone"};
        int maxEnemyHealth = 65;
        int maxEnemyAtkDmg = 25;

        //Player variables
        int health = 100; //Player Starting Health
        int AtkDmg = 35; //Player Starting Damage
        int numHealthPots = 3; //Max Number of Health Potions on Player
        int HealAmountPot = 30; //Amount each potion heals
        int DropRateHealthPot = 45; //Percentage Drop Rate for Health Pots
        boolean running = true;

        System.out.println("Welcome to the Dungeon");

        GAME:
        while (running) {
            System.out.println("---------------------------------------------------------");
            ///Start of combat
            int enemyHealth = rand.nextInt(maxEnemyHealth);
            String enemy = enemies[rand.nextInt(enemies.length)];
            System.out.println("\t#" + enemy + " has appeared! #\n");

            //Choices in Combat
            while (enemyHealth > 0 || health > 0) {
                System.out.print("\tYour HP:" + health);
                System.out.print("\t" + enemy + "'s HP:" + enemyHealth);
                System.out.print("\n\tWhat would you like to do?");
                System.out.print("\t1.Attack");
                System.out.print("\t2.Drink Health Potion");
                System.out.print("\t3.Run!");

                //Deal damage, take damage
                String input = in.nextLine();
                if (input.equals("1")) {
                    int damageDealt = rand.nextInt(AtkDmg);
                    int damageTaken = rand.nextInt(maxEnemyAtkDmg);

                    enemyHealth -= damageDealt;
                    health -= damageTaken;

                    System.out.println("\t> You strike the " + enemy + "for " + damageDealt + " damage!");
                    System.out.println("\t> You receive " + damageTaken + " in retaliation!");

                    //Death
                    if (health < 1) {
                        System.out.println("\t> You have taken too much damage. You are too weak to continue.");
                        break;
                    }

                    //Drink Potion
                } else if (input.equals("2")) {
                    if (numHealthPots > 0) {
                        health += HealAmountPot;
                        numHealthPots--;
                        System.out.println("\t> You drink a health potion, healing yourself for " + HealAmountPot + "."
                                + "\n\t You now have " + health + "HP."
                                + "\n\t> You have " + numHealthPots + "health potions left. \n");
                    } else {
                        System.out.println("\t> You have no health potions left. Defeat more enemies to receive potions.");
                    }

                    //Run
                } else if (input.equals("3")) {
                    System.out.println("\t You run away from the " + enemy + "!");
                    continue GAME;
                } else {
                    System.out.println("\tInvalid Command");
                }
            }
            if (health < 1) {
                System.out.print("You limp out of the dungeon, broken from battle.");
                break;
            }

            System.out.println("---------------------------------------------------------");
            System.out.print(" # " + enemy + " was defeated! # ");
            System.out.println(" # You have " + health + " HP left. # ");

            if (rand.nextInt(100) < DropRateHealthPot) {
                numHealthPots++;
                System.out.print(" # The " + enemy + " dropped a health potion! # ");
                System.out.println(" # You now have " + numHealthPots + " health potion(s). # ");
            }
            System.out.println("---------------------------------------------------------");
            System.out.println("What would you like to do?");
            System.out.println("1.Continue fighting");
            System.out.println("2.Exit The Dungeon");

            String input = in.nextLine();

            while (!input.equals("1") && !input.equals("2")) {
                System.out.println("Invalid Command");
                input = in.nextLine();

            }

            if(input.equals("1")){
                System.out.println("You continue on your adventure!");
            }
            else if(input.equals("2")){
                System.out.println("You exit the dungeon, successful in your adventures!");
                break;
            }
        }

        System.out.println("###################################");
        System.out.println("# ELF #");
        System.out.println("###################################");

    }


}