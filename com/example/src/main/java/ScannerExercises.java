package com.example.src.main.java;

import java.util.Scanner;

public class ScannerExercises {

    static void screen() {
        System.out.println("Possible calculations:");
        System.out.println("(A) Add");
        System.out.println("(S) Subtract");
        System.out.println("(M) Multiply");
        System.out.println("(D) Divide");
        System.out.print("Please select an option: ");
    }

    static boolean isValidInput(String input) {
        return input.equalsIgnoreCase("A") || input.equalsIgnoreCase("S") || input.equalsIgnoreCase("M") || input.equalsIgnoreCase("D");
    }

    public static String repeatScreen(Scanner sc) {
        String operator;
        do {
            screen();
            operator = sc.next();
        } while (!isValidInput(operator));
        return operator;
    }

    static double calc(String operator, double firstNumber, double secondNumber) {
        double result = 0.0;
        return switch (operator.toUpperCase()) {
            case "A" -> firstNumber + secondNumber;
            case "S" -> firstNumber - secondNumber;
            case "M" -> firstNumber * secondNumber;
            case "D" -> firstNumber / secondNumber;
            default -> result;
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        double firstNumber = sc.nextDouble();

        System.out.print("Enter the Second Number: ");
        double secondNumber = sc.nextDouble();
        sc.nextLine(); // consume newline

        String operator = repeatScreen(sc);
        double result = calc(operator, firstNumber, secondNumber);

        System.out.printf("The result is: %.2f\n", result);

        sc.close();
    }
}
