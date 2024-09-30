/*
(Sum the digits in an integer) Write a program that reads an integer between 0 and 1000 and
adds all the digits in the integer. For example, if an integer is 932, the sum of all its digits is 14.
Hint: use the % operator to extract digits, and use the / operator to remove the extracted digit.
For instance, 932 % 10 = 2 and 932 / 10 = 93.

Here is a sample run:
Enter a number between 0 and 1000: `999`
The sum of the digits is 27
 */

// Importere scannerklasse
import java.util.Scanner;

public class Section_2_6 {
    public static void main(String[] args) {

        // Instansiere skannerobjekt
        Scanner skannerobjekt = new Scanner(System.in);

        // Input...
        // Prompte bruker om input
        System.out.println("Skriv inn et tall mellom 0 og 1000: ");
        int number = skannerobjekt.nextInt();

        // Processing...
        // Få tak i siste siffer av number
        // Om number = 999 så er digit1 = 999 % 10 (som er 9)
        int digit1 = number % 10;

        // Fjerne siste siffer i number
        // remainingnumber blir derfor 999 / 10 som gir 99 (int)
        int remainingNumber = number / 10;

        // Få tak i neste siffer, digit 2
        int digit2 = remainingNumber % 10; // om remainingNumber 99 blir digit2 = 99 % 10 (som er 9)

        remainingNumber = remainingNumber / 10;

        // Få tak i resterende tall
        int digit3 = remainingNumber % 10;

        // Summere
        int sum = digit1 + digit2 + digit3;

        // Output...
        System.out.println("Summen av de tre sifferne i tallet er: " + sum);
    }
}
