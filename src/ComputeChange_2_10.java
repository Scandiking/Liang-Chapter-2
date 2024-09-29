/*
Dette programmet tar et double type tall beløp i dollar fra bruker og bryter beløpet ned i mindre enheter slik
vi har kroner og øre på norsk, men i flere ulike fraksjoner i dollar. Vi bruker "til overs"-operator % aka modulo
for dette.
 */


import java.util.Scanner;


public class ComputeChange_2_10 {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);

        System.out.print("Enter an amount in double, for example 11,56: "); // Siden locale er NO, input komma i stedet
        // for punktum som desimalskilletegn. Dette avhenger av maskinen din.

        // Lagre beløpet i double datatype variabel amount
        double amount = skanner.nextDouble();

        int remainingAmount = (int) (amount * 100);

        // Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Find the numbers of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        // Siste rest så ingen heltallsdividering nødvendig
        int numberOfPennies = remainingAmount;

        // Gir tilbakemelding til bruker
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(numberOfOneDollars + " dollars");
        System.out.println(numberOfQuarters + " quarters");
        System.out.println(numberOfDimes + " dimes");
        System.out.println(numberOfNickels + " nickels");
        System.out.println(numberOfPennies + " pennies");
    }

}
