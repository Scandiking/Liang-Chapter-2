/*
(Geometry: distance of two points) Write a program that prompts the user to enter two points (x1, y1) and (x1, y2) and
displays their distance. The formula for computing the distance is sqrt(power(x2 - x1, 2) + power(y2 - y1, 2));
Note that you can use Math.pow(a, 0.5) to compute sqrt(a).
Here is a sample run:
Enter x1 and y1: 1.5 -3.4
Enter x2 and y2: 4 5
The distance between the two points is 8.764(...).
 */

import java.util.Scanner;

public class Section_2_15 {
    public static void main(String[] args) {

        // Input...
        Scanner scanscan = new Scanner(System.in);

        // Ta imot punkt 1
        System.out.println("Enter point x1 and y1: ");
        double x1 = scanscan.nextDouble();
        double y1 = scanscan.nextDouble();

        // Ta imot punkt 2
        System.out.println("Enter point x2 and y2: ");
        double x2 = scanscan.nextDouble();
        double y2 = scanscan.nextDouble();

        // Calculations...
        // Beregne avstanden mellom de to punktene
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Output...
        System.out.println("The distance is " + distance);


    }
}
