/*
Compute the volume of a triangle
Write a program that reads in the length of sides of an equilateral triangle and computes the area and volume
using the following formulas:
area = (Math.sqrt(3) / 4 * Math.pow(length, 2);
volume = area * length
 */

import java.util.Scanner;
public class Section_2_2 {
    public static void main(String[] args) {
        Scanner skannerobjekt = new Scanner(System.in);

        // Input ...
        System.out.println("Skriv inn lengden på sidene og høyden på den likebeinte trekanten: ");
        // Lengde på sidene (og høyde)
        double length = skannerobjekt.nextDouble();

        // Processing ...
        // Kalkulere areal
        double area = (Math.sqrt(3) / 4) * Math.pow(length, 2);

        // Kalkulere volum
        double volume = area * length;

        // Output ...
        System.out.printf("Arealet av trekanten med sidelengde på %.2f er %.2f\n", length, area);
        System.out.printf("Volumet av trekantprismen er %.2f\n", volume);

    }
}
