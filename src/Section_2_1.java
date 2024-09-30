/*
Convert mile to kilometer.
Write a program that reads a mile in a double value from the console, converts it to kilometers,
and displays the result. The formule for the conversion is as follows:
1 mile = 1.6 kilometer
 */

// Import scanner class to read user input
import java.util.Scanner;

public class Section_2_1 {
    public static void main(String[] args) {
        // Instantiate a scanner object
        Scanner skannerobjekt = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Hvor mange miles vil du regne om til kilometer? Skriv inn antall miles: ");
        // Take the input from the user and put it in a variable
        double countOfMiles = skannerobjekt.nextDouble();

        // Do the calculation
        double countOfMilesInKilometers = countOfMiles * 1.6;

        // Print result
        System.out.println(countOfMiles + " miles er " + countOfMilesInKilometers + " kilometer");
    }
}
