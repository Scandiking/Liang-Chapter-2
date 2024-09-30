/*
(Find the number of years) Write a program that prompts the user to enter the minutes (e.g. 1 billion), and displays the
maximum number of years and remaining days for the minutes. For simplicity, assume that a year has 365 days.
Here is a sample run:
Enter the number of minutes: `1000000000`
1000000000 minutes is approximately 1902 years and 214 days.
 */

import java.util.Scanner;

public class Section_2_7 {
    public static void main(String[] args) {
        Scanner skannerobjekt = new Scanner(System.in);

        // Input...
        System.out.println("Skriv inn antall minutter: ");
        long minutes = skannerobjekt.nextLong(); // long pga "billion" (milliard)

        int minutesInDay = 60 * 24;                     // Antall minutter i en dag
        int daysInYear = 365;                           // Antall dager i et år



        // Processing...
        long totalDays = minutes / minutesInDay;        // Konverter minutter til dager
        long years = totalDays / daysInYear;            // Beregn antall hele år
        long remainingDays = totalDays % daysInYear;    // Beregn antall gjenværende dager etter at hele år er trukket
                                                        // fra

        // Output...
        System.out.println(minutes + " minutter er omtrent " + years + " år og " + remainingDays + " dager.");

    }
}
