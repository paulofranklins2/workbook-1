package com.example.src.main.java;

import java.util.Scanner;

public class FridayMiniExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Say Hello
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.printf("Hello, %s! Welcome to the game. \n", name);

        // 2. Age in Dog Years
        System.out.printf("%s, enter your age: ", name);
        int age = scanner.nextInt();
        int dogAge = age * 7;
        System.out.printf("%s, you're %d, in dog's age \n", name, dogAge);
        scanner.nextLine(); // consume leftover newline

        // 3. Dice Roll
        int diceRoll = (int) (Math.random() * 6) + 1;
        System.out.printf("Random Number: %d \n", diceRoll);

        // 4. Hero Stats
        System.out.print("Enter your character name: ");
        String characterName = scanner.nextLine();

        System.out.print("Enter its strength: ");
        int strength = scanner.nextInt();

        System.out.print("Enter its agility: ");
        int agility = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.printf("Hero: %s, Strength: %d, agility: %d\n", characterName, strength, agility);

        // 5. Level Up!
        System.out.print("What's your current level? ");
        int level = scanner.nextInt();
        int levelUp = ++level;
        System.out.printf("You leveled up! You are now level %d\n", levelUp);
        scanner.nextLine(); // consume newline

        // 6. Coin Calculator
        int totalPoints;
        final int GOLD_VALUE = 10;
        final int SILVER_VALUE = 1;
        System.out.print("How many gold coins have you found? ");
        int goldCoins = scanner.nextInt();
        System.out.print("How many silver coins have you found? ");
        int silverCoins = scanner.nextInt();
        scanner.nextLine(); // consume newline

        totalPoints = goldCoins * GOLD_VALUE + silverCoins * SILVER_VALUE;
        System.out.printf("Total points: %d\n", totalPoints);

        // 7. Odd or Even Dice
        if (diceRoll % 2 == 0) {
            System.out.printf("%d is even\n", diceRoll);
        } else {
            System.out.printf("%d is odd\n", diceRoll);
        }

        // 8. Critical Hit Chance
        System.out.print("Luck stat (0-100): ");
        int luckStats = scanner.nextInt();
        if (luckStats > 50) {
            System.out.println("Critical hit");
        } else {
            System.out.println("Normal hit");
        }
        scanner.nextLine(); // consume newline

        // 9. Character Class Check
        System.out.print("Input: warrior or mage: ");
        String classChecking = scanner.nextLine();
        if (classChecking.equalsIgnoreCase("warrior")) {
            System.out.println("sword, shield, axe");
        } else {
            System.out.println("staff, magic sword, blunt staff");
        }

        // 10. Magic Number Guess
        int hardcoreNumber = 19827341;
        System.out.print("Hardcode a secret number. Take a guess: ");
        int guess = scanner.nextInt();
        if (guess == hardcoreNumber) {
            System.out.println("You got the hardcore number!");
        } else {
            System.out.println("You missed it.");
        }

        // 11. Speed Trap
        System.out.print("Player speed: ");
        double playerSpeed = scanner.nextDouble();
        if (playerSpeed > 100) {
            System.out.println("Too fast! Slow down");
        } else {
            System.out.println("Safe speed.");
        }
        scanner.nextLine(); // consume newline

        // 12. Rock Paper Scissors
        int randomChoice = (int) (Math.random() * 3) + 1;
        int playerOutput = 0;
        System.out.println("CHEAT: " + randomChoice);

        // ROCK 1 > SCISSORS 3
        // PAPER 2 > ROCK 1
        // SCISSORS 3 > PAPER 2
        System.out.println("(R)Rock - (P)Paper - (S)Scissors");
        String playerInput = scanner.nextLine();

        playerOutput = switch (playerInput.toLowerCase()) {
            case "r" -> 1;
            case "p" -> 2;
            case "s" -> 3;
            default -> 0;
        };

        boolean noWinners = randomChoice == playerOutput;
        boolean computerWins = (randomChoice == 1 && playerOutput == 3) ||
                (randomChoice == 2 && playerOutput == 1) ||
                (randomChoice == 3 && playerOutput == 2);

        if (noWinners) {
            System.out.println("No winners");
        } else if (computerWins) {
            System.out.println("You Lost");
        } else {
            System.out.println("You won");
        }

        // 13. Potion Shop
        int newBalance;
        System.out.print("How many potions do you want to buy? $15 each: ");
        int amountBuying = scanner.nextInt();
        if ((amountBuying * 15) > goldCoins) {
            System.out.println("Not enough gold coins");
        } else {
            newBalance = goldCoins - (amountBuying * 15);
            System.out.println("Nice! You got " + amountBuying + " potions. Your new balance is " + newBalance);
        }

        // 14. Damage Calculator
        System.out.print("Attack power: ");
        double attackPower = scanner.nextDouble();
        System.out.print("Enemy defense: ");
        double enemyDefense = scanner.nextDouble();

        boolean canDamageEnemy = attackPower > enemyDefense;
        if (canDamageEnemy) {
            double dmgEffect = attackPower - enemyDefense;
            System.out.println("You dealt: " + dmgEffect + " damage");
        } else {
            System.out.println("Not enough damage");
        }

        // 15. XP to Next Level
        System.out.print("Current EXP: ");
        double exp = scanner.nextDouble();
        System.out.print("EXP for next level: ");
        double expForNextLevel = scanner.nextDouble();
        double expNeeded = expForNextLevel - exp;
        System.out.println("EXP needed to level up: " + expNeeded);

        // 16. Dungeon Door Code
        int randomDoor = (int) (Math.random() * 100) + 1;
        final int RANGE = 5;
        System.out.println("Cheat: " + randomDoor);

        System.out.print("Guess Dungeon Door Code: ");
        int guessDungeonDoorCode = scanner.nextInt();

        boolean isRange = Math.abs(guessDungeonDoorCode - randomDoor) <= RANGE;

        if (isRange) {
            System.out.println("Door is open");
        } else {
            System.out.println("Door is closed");
        }

        scanner.close();
    }
}
