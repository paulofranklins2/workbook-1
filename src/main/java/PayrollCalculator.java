package src.main.java;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        String employeeLastName;
        String employeeFirstName;
        double totalWorkedHours;
        double extraWorkedHours;
        double payPerHour;
        double grossPay;
        double regularPay;
        double overtimePay;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the last name: ");
        employeeLastName = scanner.next();

        System.out.println("Enter the first name: ");
        employeeFirstName = scanner.next();

        System.out.println("Enter total worked hours: ");
        totalWorkedHours = scanner.nextDouble();

        System.out.println("Enter hourly pay rate: ");
        payPerHour = scanner.nextDouble();

        if (totalWorkedHours > 40) {
            extraWorkedHours = totalWorkedHours - 40;
            double overtimeRate = payPerHour * 1.5;

            regularPay = 40 * payPerHour;
            overtimePay = extraWorkedHours * overtimeRate;

            grossPay = regularPay + overtimePay;
        } else {
            grossPay = totalWorkedHours * payPerHour;
        }

        System.out.printf("Hello %s %s, your gross pay is: $%.2f%n", employeeFirstName, employeeLastName, grossPay);

        scanner.close();
    }
}
