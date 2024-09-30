/*
Convert meters into feet.
Write a program that reads a number in meters, converts it to feet, and displays the result.
One meter is 3.2786 feet. Here is a sample run:
- Enter a value for meter: `10`
- 10.0 meters is 32.786 feet
 */

// Importing scanner for reading user input
import java.util.Scanner;

public class Section_2_3 {
    public static void main(String[] args) {

        // Input...
        System.out.println("Skriv inn antall meter du vil gjøre om til feet: ");

        // Opprette skannerobjekt for å lese brukerinput
        Scanner in = new Scanner(System.in);

        // Lagre verdien brukeren inputet i beskrivende variabel
        double meter = in.nextDouble();

        // Processing...
        double feet = meter * 3.2786;

        // Output...
        System.out.print(meter + " meter er " + feet + " feet");
    }
}
