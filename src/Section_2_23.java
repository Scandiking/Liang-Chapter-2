/*
(Cost of driving)
Write a program that prompts the user to enter the distance to drive,
the fuel efficiency of the car in miles per gallon,
and the price per gallon then displays the cost of the trip.
Here is the sample run:
Enter the driving distance: `900.5`
Enter the miles per gallon: `25.5`
Enter price per gallon: `3.55`
The cost of driving is $125.36
 */

import java.util.Scanner;
public class Section_2_23 {
    public static void main(String[] args) {
        Scanner scanscan = new Scanner(System.in);

        // Input
        System.out.println("Enter the driving distance: ");
        double drivingDistance = scanscan.nextDouble();

        System.out.println("Enter miles per gallon: ");
        double milesPerGallon = scanscan.nextDouble();

        System.out.println("Enter price per gallon: ");
        double pricePerGallon = scanscan.nextDouble();

        // Calculations
        double costOfDriving = (drivingDistance / milesPerGallon) * pricePerGallon;


        // Output
        System.out.printf("The cost of driving is: %.2f", costOfDriving);
    }
}
