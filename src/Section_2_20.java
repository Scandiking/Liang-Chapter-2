/*
(Financial application: calculate future investment value) Write a program that reads in investment amount, annual interest rate, and number of years and displays the future investment vlaue using the following formula: futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^numberOfYears*12
For example, if you enter amount 1000, annual interest rate 3.25%, and number of years 1, the future investment value is 1032.98.
Here is a sample run:
Enter investment amount: 1000.56
Enter annual interest rate in percentage: 4.25
Enter number of years: 1
Future value is $1043.92
 */

import java.util.Scanner;

public class Section_2_20 {
    public static void main(String[] args) {
        Scanner scanscan = new Scanner(System.in);

        // Input ...
        // Enter balance
        System.out.println("Enter balance: ");
        double balance = scanscan.nextDouble();

        // Enter interest rate
        System.out.println("Enter annual interest rate: ");
        double annualInterestRate = scanscan.nextDouble();

        // Calculations
        double interest = balance * (annualInterestRate / 1200);

        // Output ...
        System.out.println("The interest is: " + interest);

    }
}
