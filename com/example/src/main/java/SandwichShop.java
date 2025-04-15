package com.example.src.main.java;

import java.util.Scanner;

public class SandwichShop {
    int sandwichSize;
    final double REGULAR_SIZE_PRICE = 5.45;
    final double LARGE_SIZE_PRICE = 8.95;
    final double SENIOR_DISCOUNT = 0.80;
    final double KIDS_DISCOUNT = 0.90;

    //Prompt the user for the size of the sandwich (1 or 2):
    public int getSandwichSize(int size) {
        return sandwichSize = size;
    }

    //- 1: Regular: base price $5.45
    //- 2: Large: base price $8.95
    //Prompt the user for their age:
    public double getDiscountByAge(int age) {
        //- Student (17 years old or younger) — receive a 10% discount
        //- Seniors (65 years old or older) — receive a 20% discount
        if (age >= 64) {
            return SENIOR_DISCOUNT;
        }
        if (age <= 17) {
            return KIDS_DISCOUNT;
        } else {
            return 1;
        }
    }

    public double sandwichPriceBySize(int sandwichSize) {
        if (sandwichSize == 1) {
            return REGULAR_SIZE_PRICE;
        } else {
            return LARGE_SIZE_PRICE;
        }
    }

    public double calcSandwichPrice(Scanner scanner) {
        System.out.println("Enter sandwich size:");
        int size = getSandwichSize(scanner.nextInt());
        System.out.println("Enter your Age");
        double discount = getDiscountByAge(scanner.nextInt());

        double fullPrice = sandwichPriceBySize(size) * discount;
        System.out.println("Total: full price: " + fullPrice);
        return fullPrice;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SandwichShop sandwichShop = new SandwichShop();
        sandwichShop.calcSandwichPrice(scanner);
    }
}

