/*
(Current time) Listing 2.7 (see https://github.com/Scandiking/Liang-Chapter-2/blob/master/src/ShowCurrentTime_2_7.java)
ShowCurrentTime.java, gives a program that displays the current time in GMT. Revise the program so it prompts the
user to enter the time zone offset to GMT and displays the time in the specified time zone.
Here is a sample run:
Enter the time zone offset to GMT: `-5`
The current time is 4:50:34
 */

// Jeg har endret på print output statement for å få med leading zeros.

import java.util.Scanner;

public class Section_2_8 {
    public static void main(String[] args) {
        // Input...
        // Instansierer skannerobjekt
        Scanner input =  new Scanner(System.in);
        // Prompter bruker om input
        System.out.println("Enter the time zone offset to GMT: ");
        // Lagrer verdien brukeren inputet i int variabel
        int offset = input.nextInt();

        // Processing...
        // Bruker UNIX epoch time for å regne ut
        long totalMilliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMilliSeconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;

        // Offset fra GMT for å endre
        long nowHours = (currentHours + offset);

        // Output...
        // Obs: denne gir feil om offset > nåværende klokkeslett
        System.out.printf("Nåværende tid er %02d:%02d:%02d.", nowHours, currentMinutes, currentSeconds);
        System.out.println();

        // Offset fra GMT for å endre, og sørge for at hours forlbir i 0-23
        long nowHours2 = (currentHours + offset) % 24;

        // Om negative verdier for hours
        if (nowHours2 < 0) {
            nowHours2 += 24; // Legg til 24 for å få positiv timeverdi
        }

        System.out.printf("Nåværende tid er %02d:%02d:%02d.", nowHours, currentMinutes, currentSeconds);

    }
}
