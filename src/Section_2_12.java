/*
(Physics: finding runway length) Given an airplane's acceleration a and take-off speed v, you can compute the minimum
runway length needed for an airplane to take off using the following formula: length = ((v^2)/(2a))
Write a program that prompts the user to enter v in meters/second (m/s) and the acceleration a in
meters/second squared (m/s^2), then, displays the minimum runway length.
Enter speed and acceleration: `60 3.5`
The minimum runway length for this airplane is 514.286
 */

import java.util.Scanner;

public class Section_2_12 {
    public static void main(String[] args) {
        Scanner scanscan = new Scanner(System.in);

        // Input ...
        System.out.println("Enter speed an acceleration: ");
        double speedV = scanscan.nextDouble();
        double accelerationA = scanscan.nextDouble();

        // Processing ...
        double length = (Math.pow(speedV, 2)) / (2*accelerationA);

        // Output ...
        System.out.printf("Minimun runway length is %.3f meters", length);
    }
}
