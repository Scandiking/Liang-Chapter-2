/*
(Geometry: area of a triangle)
Write a program that prompts the user to enter three points, (x1, y1), (x2, y2), and (x3, y3), of a triangle that
displays its area. The formula for computing the area of a triangle is
s = (side1 + side2 + side3)/2

area = sqrt(s*(s-side1)*(s-side2)*(s-side3))

Here is a sample run:
Enter the coordinates of three points separated by spaces like x1 y1 x2 y2 x3 y3: `1.5 -3.4 4.6 5 9.5 -3.4`
The area of the triangle is 33.6
 */

import java.util.Scanner;

public class Section_2_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Skriv inn tre punkter
        System.out.println("Skriv inn x-koordinat for første punkt: ");
        double point1x = sc.nextDouble();
        System.out.println("Skriv inn y-koordinat for første punkt: ");
        double point1y = sc.nextDouble();

        System.out.println("Skriv inn x-koordinat for andre punkt: ");
        double point2x = sc.nextDouble();
        System.out.println("Skriv inn y-koordinat for andre punkt: ");
        double point2y = sc.nextDouble();

        System.out.println("Skriv inn x-koordinat for tredje punkt: ");
        double point3x = sc.nextDouble();
        System.out.println("Skriv inn y-koordinat for tredje punkt: ");
        double point3y = sc.nextDouble();

        // Calculation
        double side1 = Math.sqrt(Math.pow(point2x - point1x, 2) + Math.pow(point2y - point1y, 2));
        double side2 = Math.sqrt(Math.pow(point3x - point2x, 2) + Math.pow(point3y - point2y, 2));
        double side3 = Math.sqrt(Math.pow(point1x - point3x, 2) + Math.pow(point1y - point3y, 2));

        double s = (side1 + side2 + side3) / 2;

        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));

        // Output
        System.out.println("Punktene som danner trekanten har et areal på "+ area + " kvadratenheter");
    }
}
