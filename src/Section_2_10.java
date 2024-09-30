/*
(Science: calculating energy) Write a program that calculates the energy needed to heat water from an initial
temperature to a final temperature. Your program should prompt the user to enter the amount of water in
kilograms and the initial and final temperatures of the water. The formula to compute the energy is
Q = M * (finalTemperature - initialTemperature) * 4184 where `M` is the weight of water in kilograms, initial and final
temperatures are in degrees Celsius, and energy `Q` is measured in joules.
Here is a sample run:
Enter the amount of water in kilograms: `55.5`
Enter the initial temperature: `3.5`
Enter the final temperature: `10.5`
The energy needed is 1625484.0
 */

import java.util.Scanner;
public class Section_2_10 {
    public static void main(String[] args) {

        // Input ...
        Scanner scanscan = new Scanner(System.in);

        System.out.println("Enter the amount of water in kilograms: ");
        double amountOfWaterInKilogramsM = scanscan.nextDouble();

        System.out.println("Enter the initial temperature: ");
        double initialTemperature = scanscan.nextDouble();

        System.out.println("Enter the final temperature: ");
        double finalTemperature = scanscan.nextDouble();

        // Processing ...
        double energyQ = amountOfWaterInKilogramsM * (finalTemperature - initialTemperature) * 4184;

        // Output ...
        System.out.println("The energy needed to heat the water from " + initialTemperature + "° to " + finalTemperature + "° is " + energyQ + " joules.");
    }
}
