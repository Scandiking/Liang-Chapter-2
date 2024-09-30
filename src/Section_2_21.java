/*
(Financial application: calculate future investment value) Write a program that reads in investment amount, annual interest rate, and number of years and displays the future investment amount, annual interest rate, and number of years and displays the future investment value using the following formula:
futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^numberOfYears*12
For example, if you enter amount 1000, annual interest rate 3.25%, and number of years 1, the future investment value is 1032.98.
Here is a sample run:
Enter investment amount: `1000`
Enter annual interest rate in percentage: `4.25`
Enter number of years: `1`
Future value is $1043.92

Note depending on your machine's locale you might want to replace '.' for ',' due to Norwegian standards.
 */

import java.util.Scanner;

public class Section_2_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter investment amount: ");
        double investmentAmount = sc.nextDouble();

        System.out.println("Enter annual interest rate in percentage ");
        double annualInterestRate = sc.nextDouble();

        System.out.println("Enter number of years: ");
        int numberOfYears = sc.nextInt();

        double monthlyInterestRate = (annualInterestRate / 12 / 100);

        // Calculations
        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), numberOfYears * 12);

        // Output
        System.out.println(futureInvestmentValue);
    }
}
