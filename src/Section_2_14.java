/*
(Health application: computing BMI) Body Mass Index (BMI) is a measure of health on weight. It can be calculated by
taking your weight in kilograms annd dividing, by the square of your height in meters. Write a program that prompts the
user to enter a weight in pounds and height in inches and displays the BMI. Note one pound is
`0.45359237` kilograms and once inch is `0.0254` meters.

Here is a sample run:
Enter weight in pounds: `95.5`
Enter height in inches: `50`
BMI is 26.5873
 */

import java.util.Scanner;

public class Section_2_14 {
    public static void main(String[] args) {
        Scanner scanscan = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        double weightInPound = scanscan.nextDouble();

        System.out.println("Enter height in inches: ");
        double heightInInches = scanscan.nextDouble();

        double weightInKilograms = weightInPound * 0.45359237;
        double heightInCentimeters = heightInInches * 2.54;
        double heightInMeters = heightInCentimeters / 100;

        System.out.println("Kilogram: " + weightInKilograms);
        System.out.println("Centimeters: " + heightInCentimeters);

        // Processing BMI
        double BMI = weightInKilograms / (heightInMeters*heightInMeters);

        System.out.println("Weight in kilograms: " +
                weightInKilograms +
                " divided by height in meters " +
                heightInMeters +
                " multiplied by" +
                " height in meters " +
                heightInMeters +
                " = " +
                BMI +
                " BMI"
                );
    }
}
