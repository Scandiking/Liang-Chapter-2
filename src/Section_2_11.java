/*
(Population projection) Rewrite Programming Exercise 1.11 to prompt the user to enter the number of years and
display the population after the number of years. Use the hint in programming exercise 1.11 for this program.
Here is a sample run of the program:
Enter the number of years: `5`
The population in 5 years is 325932969

Programming Exercise 1.11:
(Population projection) The U.S Census Bureau projects population based on the following assumptions:
- One birth every 7 seconds
- One death every 13 seconds
- One new immigrant every 45 seconds

Write a program to display the population for each of the next five years. Assume that the current population is
312,032,486 and one year has 365 days.
 */

// Importere skannerklasse for å lese brukerinput
import java.util.Scanner;

public class Section_2_11 {
    public static void main(String[] args) {
        // Input...
        // Opprette instans av skannerobjekt
        Scanner scanscan = new Scanner(System.in);

        // Fastsette verdier for beregning
        long currentPopulation = 312032486;
        int secondsInAYear = 365 * 24 * 60 * 60;        // Total seconds in a year
        int birthsPerYear = secondsInAYear / 7;         // Number of births in a year
        int deathsPerYear = secondsInAYear / 13;        // Number of deaths in a year
        int immigrantsPerYear = secondsInAYear / 45;    // Number of immigrants in a year

        // Netto endring
        long netChangePerYear = birthsPerYear - deathsPerYear + immigrantsPerYear;

        // Hvor mange år skal endringen regnes på?
        System.out.println("Enter the number of years: ");
        int years = scanscan.nextInt();

        // Processing ...
        // Antatt befolkning
        long projectedPopulation = currentPopulation + (netChangePerYear * years);

        // Output ...
        System.out.println("The population of " + years + " years is " + projectedPopulation);
    }
}
