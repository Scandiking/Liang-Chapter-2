/*
(Print a table)
Write a program that displays the following table. Calculate the middle point of two points.

___a___|___b___|____mp____
  (0.0)|  (2.1)| (1.0,0.5)
  (1.4)|  (4.2)| (2.5,3.0)
  (2.7)|  (6.2)| (4.0,5.0)
  (3.9)| (10.5)| (6.5,7.0)
 (4,11)| (12.7)| (8.0,9.0)

 */

public class Section_2_18 {
    public static void main(String[] args) {

        // Header for the table
        System.out.println("_____a____|_____b_____|_____mp____");

        // Row 1
        double a1x = 0.0, a1y = 0.0;
        double b1x = 2.1, b1y = 1.0;
        double mp1x = (a1x + b1x) / 2;
        double mp1y = (a1y + b1y) / 2;
        System.out.printf(" (%.1f.%.1f)|  (%.1f.%.1f)|  (%.1f.%.1f)%n", a1x, a1y, b1x, b1y, mp1x, mp1y);

        // Row 2
        double a2x = 1.4, a2y = 4.0;
        double b2x = 4.2, b2y = 2.0;
        double mp2x = (a2x + b2x) / 2;
        double mp2y = (a2y + b2y) / 2;
        System.out.printf(" (%.1f.%.1f)|  (%.1f.%.1f)|  (%.1f.%.1f)%n", a2x, a2y, b2x, b2y, mp2x, mp2y);

        // Row 3
        double a3x = 2.7, a3y = 7.0;
        double b3x = 6.2, b3y = 2.0;
        double mp3x = (a3x + b3x) / 2;
        double mp3y = (a3y + b3y) / 2;
        System.out.printf(" (%.1f.%.1f)|  (%.1f.%.1f)|  (%.1f.%.1f)%n", a3x, a3y, b3x, b3y, mp3x, mp3y);

        // Row 4
        double a4x = 3.9, a4y = 9.0;
        double b4x = 10.5, b4y = 5.0;
        double mp4x = (a4x + b4x) / 2;
        double mp4y = (a4y + b4y) / 2;
        System.out.printf(" (%.1f.%.1f)| (%.1f.%.1f)|  (%.1f.%.1f)%n", a4x, a4y, b4x, b4y, mp4x, mp4y);

        // Row 5
        double a5x = 4.0, a5y = 11.0;
        double b5x = 12.7, b5y = 7.0;
        double mp5x = (a5x + b5x) / 2;
        double mp5y = (a5y + b5y) / 2;
        System.out.printf("(%.1f.%.1f)| (%.1f.%.1f)|  (%.1f.%.1f)%n", a5x, a5y, b5x, b5y, mp5x, mp5y);
    }
}
