import java.util.Scanner;

public class FahrenheitToCelsius_2_6 {
    public static void main(String[] args) {

        // Oppretter skannerobject for å lese brukerinput
        Scanner input =  new Scanner(System.in);

        // Ber bruker om input
        System.out.print("Skriv inn antall grader i Fahrenheit: ");

        // Lagrer brukerinput i fahrenheit-variabel med double datatype
        double fahrenheit = input.nextDouble();

        // Konvertere fahrenheit til celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);

        // Printer ut resultat til bruker
        System.out.println(fahrenheit + " Fahrenheit" + " er " + celsius + "° i Celsius");
    }
}
