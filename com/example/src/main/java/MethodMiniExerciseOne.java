package com.example.src.main.java;

public class MethodMiniExerciseOne {
    public static void printWelcome() {
        System.out.println("Welcome to the Game");
    }

    public static void displayPlayerName(String name) {
        System.out.println("Player joined: " + name);
    }

    public static void showLevel(int level) {
        System.out.println("Level: " + level);
    }

    public static void attack(String attacker, String target) {
        System.out.println(attacker + " attacks " + target);
    }

    public static void castSpell(String wizard, String spellName, int manaCost) {
        System.out.println(wizard + " casts " + spellName + " " + manaCost);
    }

    public static void gameOver(String player) {
        System.out.println("GAME OVER for: " + player);
    }

    public static void displayInventory(String player, int itemCount) {
        System.out.println(player + " has " + itemCount + " items in your inventory");
    }

    public static void enterDungeon(String player, String dungeonName) {
        System.out.println(player + " bravely enters " + dungeonName + " dungeon");
    }

    public static void victoryDance(String player) {
        System.out.println(player + " does a little victory dance");
    }

    public static void main(String[] args) {
        String firstPlayerName = "Paulo";
        int firstPlayerLevel = 99;
        int firstPlayerItems = 10;
        String secondPlayerName = "Olumide";
        int secondPlayerLevel = 101;
        int secondPlayerItems = 20;

        String dungeonName = "The Last Warrior";

        System.out.println("First Player");
        displayPlayerName(firstPlayerName);
        printWelcome();
        showLevel(firstPlayerLevel);
        displayInventory(firstPlayerName, firstPlayerItems);

        System.out.println();

        System.out.println("Second Player");
        displayPlayerName(secondPlayerName);
        printWelcome();
        showLevel(secondPlayerLevel);
        displayInventory(secondPlayerName, secondPlayerItems);

        System.out.println();

        System.out.println("The Final Battle");
        attack(firstPlayerName, secondPlayerName);
        castSpell(firstPlayerName, secondPlayerName, 5);
        attack(secondPlayerName, firstPlayerName);
        castSpell(secondPlayerName, firstPlayerName, 10);
        castSpell(secondPlayerName, firstPlayerName, 5);
        castSpell(secondPlayerName, firstPlayerName, 10);
        gameOver(firstPlayerName);
        enterDungeon(secondPlayerName, dungeonName);
        victoryDance(secondPlayerName);


    }
}
