/*
Convert square meter into ping. Write a program that converts square meter into ping.
The program prompts the user to enter a number in square meter, converts it to ping,
and displays the result. One square meter is 0.3025 ping.
Here is a sample run.
Enter a number in square meters: `50`
`50.0 square meters is 15.125 pings`
 */

// Importere skannerklasse for å lese brukerinput
import java.util.Scanner;

public class Section_2_4 {
    public static void main(String[] args) {
        // Instansiere skannerobjekt
        Scanner sc = new Scanner(System.in);

        // Prompte bruker om input
        System.out.println("Skriv inn antall kvadratmeter du vil konvertere til ping: ");

        // Lagre input i beskrivende variabel av double datatype
        double squareMeters = sc.nextDouble();

        // Processing...
        // Beregne ping
        double ping = squareMeters * 0.3025;

        // Output
        // Gi beskjed til brukeren
        System.out.println(squareMeters + " kvadratmeter er " + ping + " ping");
    }
}
