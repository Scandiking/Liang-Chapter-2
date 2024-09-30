/*
(Financial application: compound value) Suppose you save $100 each month in a saving account with
annual interest rate 3.75%. Thus, the monthly interest rate is 0.0375/12 = 0.003125.
After the first month, the value in the account becomes
100 * (1 + 0.003125) = 100.3125
After the second month, the value in the account becomes
(100 + 100.3125) * (1 + 0.003125) = 200.938
After the third month, the value in the account becomes
(100 + 200.938) * (1 + 0.003125) = 301.878
and so on.
Write a program that prompts the user to enter a monthly saving amount and displays the account value
after the sixth month.
(In exercise 5.30 you will use a loop to simplify the code and display the account value for any month.)

---------------
Enter the monthly saving amount: `100`
After the first month, the account value is 100.3125
After the second month, the account value is 200.9384765625
After the third month, the account value is 301.8789093017578
After the sixth month, the account value is 606.5967866995037
 */

import java.util.Scanner;

public class Section_2_13 {
    public static void main(String[] args) {

        // Input...
        final double annualInterestRate = 0.0375;
        final double monthlyInterestRate = annualInterestRate / 12;

        Scanner scanscan = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double monthlySaving = scanscan.nextDouble();

        // Processing...
        double accountValue = 0;

        // After 1st month
        // Note no loop yet according to the course book, natural to use for loop here
        // Instad we use the aritmetic operators for now
        accountValue += monthlySaving;
        accountValue *= (1 + monthlyInterestRate);

        System.out.printf("After the first month, the account value is %.2f%n", accountValue);

        // After 2nd month
        accountValue += monthlySaving;
        accountValue *= (1 + monthlyInterestRate);
        System.out.printf("After the second month, the account value is %.2f%n", accountValue);

        // After 3rd month
        accountValue += monthlySaving;
        accountValue *= (1 + monthlyInterestRate);
        System.out.printf("After the third month, the account value is %.2f%n", accountValue);

        // After 4th month
        accountValue += monthlySaving;
        accountValue *= (1 + monthlyInterestRate);
        System.out.printf("After the fourth month, the account value is %.2f%n", accountValue);

        // After 5th month
        accountValue += monthlySaving;
        accountValue *= (1 + monthlyInterestRate);
        System.out.printf("After the fifth month, the account value is %.2f%n", accountValue);

        // After 6th month
        accountValue += monthlySaving;
        accountValue *= (1 + monthlyInterestRate);

        // (Final) Output ...
        System.out.printf("After the sixth month which is what was asked about, the account value is %.2f%n", accountValue);
    }
}
