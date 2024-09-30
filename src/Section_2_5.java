/*
(Financial application: calculate tips) Write a program that reads the subtotal and the gratuity rate and then
computes the gratuity and total. For example, if the user enters 10 for subtotal and 12% for gratuity rate, the
program displays $1.2 as gratuity and $11.2 as total.
Here is a sample run:
Enter the subtotal and a gratuity rate: `10 12`
The gratuity is $1.2 and total is $11.2
 */

import java.util.Scanner;
public class Section_2_5 {
    public static void main(String[] args) {
        Scanner skannerobjekt = new Scanner(System.in);

        // Input...
        System.out.println("Enter the subtotal and a gratuity rate: ");
        double subtotal = skannerobjekt.nextDouble();
        double gratuity = skannerobjekt.nextDouble();

        // Processing...
        double total = subtotal + (gratuity*0.1);

        // Output...
        System.out.println("Subtotal: $" + subtotal + " +" + " gratuity: " + gratuity +"%");
        System.out.println("Total:\n" + "$" + total);
    }
}
