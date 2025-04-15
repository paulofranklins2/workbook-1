package com.example.src.main.java;

import java.util.Scanner;

public class MethodMiniExerciseTwo {
    public static String getPlayerName(String playerName) {
        return "Lord: " + playerName;
    }

    public static int doubleXP(int exp) {
        return exp * 2;
    }

    public static boolean hasLeveledUp(int currentExp, int threshold) {
        return currentExp > threshold;
    }

    public static int rollDice() {
        return (int) (Math.random() * 6 + 1);
    }

    public static int calculateDamage(int strength, int enemyDefense) {
        int dmgValue = (strength * 2) - enemyDefense;
        boolean damageIsGreater = dmgValue > 0;

        if (damageIsGreater) {
            return dmgValue;
        }
        return 0;
    }

    public static boolean canOpenChest(boolean hasKey, boolean lockIsBroken) {
        return hasKey || lockIsBroken;
    }

    public static String getPlayerClass(int choice) {
        return switch (choice) {
            case 1 -> "Warrior";
            case 2 -> "Mage";
            case 3 -> "Rogue";
            default -> "Peasant";
        };
    }

    public static int addGold(int currentGold, int goldFound) {
        boolean overHundred = goldFound > 100;
        final double overHundredTax = 0.90;
        if (overHundred) {
            return currentGold += (int) (goldFound * overHundredTax);
        }
        return currentGold += goldFound;
    }

    public static boolean isQuestComplete(int tasksDone, int totalTasks) {
        return tasksDone == totalTasks;
    }

    public static boolean isBossDefeated(int playerHP, int bossHP, boolean usedPotion) {
        if (usedPotion) {
            playerHP += 50;
        }

        if (bossHP <= 0) {
            return true;
        }

        return playerHP > bossHP;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println(getPlayerName(name));

        System.out.println("Choose your class:\n1 - Warrior\n2 - Mage\n3 - Rogue");
        int classChoice = scanner.nextInt();
        String playerClass = getPlayerClass(classChoice);
        System.out.println("You are a mighty " + playerClass + "!");

        int xp = 10;
        xp = doubleXP(xp);
        System.out.println("You gained double XP! Current XP: " + xp);

        boolean leveledUp = hasLeveledUp(xp, 15);
        System.out.println(leveledUp ? "You leveled up!" : "Keep grinding!");

        System.out.println("Rolling dice for damage...");
        int diceRoll = rollDice();
        int damage = calculateDamage(diceRoll, 3);
        System.out.println("You dealt " + damage + " damage!");

        System.out.println("Do you have a key? (true/false)");
        boolean hasKey = scanner.nextBoolean();
        System.out.println("Is the lock broken? (true/false)");
        boolean lockBroken = scanner.nextBoolean();
        if (canOpenChest(hasKey, lockBroken)) {
            int goldFound = (int) (Math.random() * 200);
            int totalGold = addGold(0, goldFound);
            System.out.println("You opened the chest and found " + goldFound + " gold! Total gold: " + totalGold);
        } else {
            System.out.println("You couldn't open the chest.");
        }

        System.out.println("Time to fight the boss! Input your HP:");
        int playerHP = scanner.nextInt();
        System.out.println("Input boss HP:");
        int bossHP = scanner.nextInt();
        System.out.println("Did you use a potion during the fight? (true/false)");
        boolean usedPotion = scanner.nextBoolean();

        if (isBossDefeated(playerHP, bossHP, usedPotion)) {
            System.out.println("You defeated the boss! Victory!");
        } else {
            System.out.println("You were defeated... Try again.");
        }

        scanner.close();
    }
}
