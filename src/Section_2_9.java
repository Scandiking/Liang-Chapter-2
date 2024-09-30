/*
(Physics: motion) Newton's equation of motion for distance covered given initial velocity, constant acceleration, and
total time is described by the expression s = ut + (1/2) * at ^2
Write a program that prompts the user to enter the initial velocity `u` in meters/second, time span `t` in seconds and
acceleration `a` in meter/second^2, and returns the distance covered.
Here is a sample run:
Enter u, t, and a: 3.5 4 6.5
The distance covered is 14.0
 */

import java.util.Scanner;

public class Section_2_9 {
    public static void main(String[] args) {

        // Input
        // Instansierer skannerobjekt
        Scanner scanscan = new Scanner(System.in);
        // Prompter bruker
        System.out.println("Enter the velocity, timespan and acceleration: ");
        // Lagrer brukers input i variabler (bedre å taste inn et tall om gangen, men boka gjør det sånn)
        double velocity = scanscan.nextDouble();
        double timespan = scanscan.nextInt();
        double acceleration = scanscan.nextDouble();

        // Processing
        // Distance covered:
        double s = velocity * timespan + (1.0/2.0) * acceleration * Math.pow(timespan,2);

        // Output
        System.out.println("The distance covered is " + s + " meters");


    }
}
