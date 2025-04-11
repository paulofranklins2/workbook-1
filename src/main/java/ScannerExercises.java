package src.main.java;

import java.util.Scanner;

public class ScannerExercises {
    public static void main(String[] args) {
        double firstNumber;
        double secondNumber;
        double result;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        firstNumber = sc.nextDouble();
        System.out.print("Enter the Second Number: ");
        secondNumber = sc.nextDouble();
        sc.nextLine();

        System.out.println("Possible calculations:");
        System.out.println("(A) Add");
        System.out.println("(S) Subtract");
        System.out.println("(M) Multiply");
        System.out.println("(D) Divide");

        System.out.print("Please select an option: ");
        sc.next();

        result = (firstNumber * secondNumber);
        System.out.printf("%.2f The result is: ", result);

        sc.close();
    }
}
