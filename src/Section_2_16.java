/*
(Geometry: area of a hexagon)
Write a program that prompts the user to enter the side of a hexagon and displays its area.
The formula for computing the area of a hexagon is
area = ((3(sqrt(3))/(2))*s^2
Here is a sample run:
Enter the length of the side: 5.5
The area of the hexagon is 78.5918;
 */

import java.util.Scanner;

public class Section_2_16 {
    public static void main(String[] args) {
        Scanner scanscan = new Scanner(System.in);

        // Input...
        System.out.println("Skriv inn lengden på en side på heksagonen: ");
        double lengthOfSide = scanscan.nextDouble();

        // Processing...
        // The area uses the formula for computing the area of a hexagon
        // lengthOfSide^2 (or lengtOfSide * lengthOfSide) calculates the area based on the length of the side. This won't do for anything but squares or rectangles.
        // The constant ((3.Math.sqrt(3))/(2)) is derived from a more complex derivation
        double area = ((3*Math.sqrt(3))/(2))*(lengthOfSide * lengthOfSide);

        // Output...
        System.out.println("Arealet til heksagonen er " + area);


    }
}
