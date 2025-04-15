package com.example.src.main.java;

import java.util.Scanner;

public class SandwichShop {
    int sandwichSize;
    final double REGULAR_SIZE_PRICE = 5.45;
    final double LARGE_SIZE_PRICE = 8.95;
    final double SENIOR_DISCOUNT = 0.80;
    final double KIDS_DISCOUNT = 0.90;
    final double REGULAR_SIZE_LOADED = 1.00;
    final double LARGE_SIZE_LOADED = 1.75;

    //Prompt the user for the size of the sandwich (1 or 2):
    public int selectSandwichSize(int size) {
        return sandwichSize = size;
    }

    //- 1: Regular: base price $5.45
    //- 2: Large: base price $8.95
    //Prompt the user for their age:
    public double getDiscountByAge(int age) {
        //- Student (17 years old or younger) — receive a 10% discount
        //- Seniors (65 years old or older) — receive a 20% discount
        if (age >= 65) return SENIOR_DISCOUNT;
        if (age <= 17) return KIDS_DISCOUNT;
        return 1.0;
    }

    public double getBasePrice(int sandwichSize) {
        if (sandwichSize == 1) return REGULAR_SIZE_PRICE;
        else return LARGE_SIZE_PRICE;
    }

    // loaded (Y/N)
    public boolean isDoubleIngredients(String input) {
        return input.equalsIgnoreCase("Y");
    }

    //- Regular: $1.00
    //- Large: $1.75
    public double loadedPriceBySize(int size, boolean isLoaded) {
        if (isLoaded && size == 1) return REGULAR_SIZE_LOADED;
        if (isLoaded && size == 2) return LARGE_SIZE_LOADED;
        return 0;
    }

    public double calcPrice(int sandwichSize, boolean isLoaded, int age) {
        double basePrice = getBasePrice(sandwichSize);
        double extras = loadedPriceBySize(sandwichSize, isLoaded);
        double discount = getDiscountByAge(age);
        return (basePrice + extras) * discount;
    }

    public double calcSandwichPrice(Scanner scanner) {
        System.out.println("Enter sandwich size:");
        int size = selectSandwichSize(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Do you want the double ingredients? (Y/N)");
        boolean isLoaded = isDoubleIngredients(scanner.nextLine());
        double initialPrice = loadedPriceBySize(size, isLoaded);

        System.out.println("Enter your Age");
        double discount = getDiscountByAge(scanner.nextInt());

        double fullPrice = (getBasePrice(size) + initialPrice) * discount;
        System.out.println("Total: full price: " + fullPrice);

        return fullPrice;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SandwichShop sandwichShop = new SandwichShop();
        System.out.println("Enter sandwich size: (1- Regular Size / 2 - Large Size)");
        int sandwichSize = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Do you want the double ingredients? (Y/N)");
        String isLoaded = scanner.next();

        System.out.println("Enter your Age");
        int age = scanner.nextInt();

        double result = sandwichShop.calcPrice(sandwichSize, true, age);
        scanner.close();

        System.out.println(result);
    }
}

