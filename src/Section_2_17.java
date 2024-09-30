/*
(Science: wind-chill temperature) How cold is it outside= The temperature alone is not enough to provide the answer.
Other factors including wind speed, relative humidity, and sunshine play import roles in determining coldness outside.
In 2001, the National Weather Service implemented the new wind-chill temperatures to measure the coldness using
temperature and wind speed.

The formula is:
t^wc = 35.74 + 0.621t^t^a - 35.75^v^0.16 + 0.4275^t^a^v^0.16
where t_a is the outside temp measured in degrees Fahrenheit, v is the speed measured in miles per hour and t_wc is the
wind-chill temperature. The formula cannot be used for wind speeds below 2mph or temperatures below -58F or above 41F.
Write a program that prompts the user to enter a temperature between -58F and 41F and a wind speed greater than or
equal to 2 then displays the wind-chill temperature. use Math.pow(a, b) to compute v^0.16.

Here is a sample run:
Enter the temperature in Fahrenheit between -58F and 41F: `5.3`
Enter the wind speed (>=2) in miles per hour: `6`
The wind chill index is -5.56707

---------------
WolframAlpha natural language:
Subscript[t,wc]= 35.74 + 0.6215*Subscript[t,a]-35.75*v^0.16+0.4275*Subscript[t,a^v^0.16]

WolframAlpha copied "math input":
Subscript[t,wc]= 35.74 + 0.6215*Subscript[t,a]-35.75*Power[v,0.16]+0.4275*Subscript[t,Power[a,Power[v,0.16]]]
---------------
 */

import java.util.Scanner;

public class Section_2_17 {
    public static void main(String[] args) {
        Scanner scanscan = new Scanner(System.in);

        // Input...
        // Temperature:
        System.out.println("Enter the temperature in Fahrenheit between -58F and 41F: ");
        double fahrenheitTemp = scanscan.nextDouble();

        // Wind speed
        System.out.println("Enter the wind speed  (>=2) in miles per hour: ");
        double windMilesPerHour = scanscan.nextDouble();

        // Processing...
        double temperatureWindChill =
                35.74 +
                0.6215 * fahrenheitTemp -
                35.75 * Math.pow(windMilesPerHour, 0.16) +
                0.4275 * fahrenheitTemp * Math.pow(windMilesPerHour, 0.16);

        // Output...
        System.out.println("The wind chill index is " + temperatureWindChill);
    }
}
