/*
(Financial application: monetary units)
Rewrite Listing 2.10, ComputeChange.java to fix the possible loss of accuracy when converting a double value to an
int value. Enter the input as an integer  whose last two digits represent the cents. For example,
the input 1156 represents 11 dollars and 56 cents.

---------------
Listing 2.10:
Dette programmet tar et double type tall beløp i dollar fra bruker og bryter beløpet ned i mindre enheter slik
vi har kroner og øre på norsk, men i flere ulike fraksjoner i dollar. Vi bruker "til overs"-operator % aka modulo
for dette.
 */



import java.util.Scanner;

public class Section_2_22 {
    public static void main(String[] args) {
        Scanner scanscan = new Scanner(System.in);

        System.out.print("Enter an amount in integer (1156 = $11.56, 72 = $0.72): ");
        int totalAmount = scanscan.nextInt();

        int dollars = totalAmount / 100;
        int cents = totalAmount % 100;

        System.out.println("Your amount " + totalAmount + " consists of");
        System.out.println(" " + dollars + " dollars");
        System.out.println(" " + cents + " cents");

    }
}
