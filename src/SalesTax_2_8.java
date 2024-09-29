import java.util.Scanner;

public class SalesTax_2_8 {
    public static void main(String[] args) {

        // Oppretter skannerobjekt for å lese brukerinput
        Scanner skannerobjekt = new Scanner(System.in);

        // Ber bruker om input
        System.out.println("Skriv inn kjøpsbeløp: ");

        // Lagrer input i double datatype variabel purchaseAmount
        double purchaseAmount = skannerobjekt.nextDouble();

        // Lagrer verdi av kjøpskostnad * 0.25 i variabel tax av datatype double
        double tax = purchaseAmount * 0.25;
        System.out.println("Kjøpsbeløp er $" + purchaseAmount);
        System.out.println("Skatt er $" + (int)(tax * 100)/100.0);
        System.out.println("Totalkostnad er $" + (purchaseAmount+tax));
    }
}
