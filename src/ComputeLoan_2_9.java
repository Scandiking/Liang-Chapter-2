import java.util.Scanner;

public class ComputeLoan_2_9 {
    public static void main(String[] args) {

        // Opprett skannerobjekt for å lese brukerinput
        Scanner input =  new Scanner(System.in);

        // Skriv in årlig renterate i prosent, f.eks 7.25
        System.out.println("Skriv inn årlig renterate: ");
        double annualInterestRate = input.nextDouble();

        // Skaff månedlig rente
        double monthlyInterestRate = annualInterestRate / 1200;

        // Skriv inn antall år
        System.out.println("Skriv inn antall hele år: ");
        int numberOfYears = input.nextInt();

        // Skriv inn lånemengde
        System.out.println("Skriv inn lånebeløp: ");
        double loanAmount = input.nextDouble();

        // Beregner betaling (fast rente)
        double monthlyPayment = (loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));

        // Beregner total kostnad for lånet
        double totalPayment = (monthlyPayment * numberOfYears * 12);

        // Viser resultater
        System.out.printf("Månedlig betaling: %.2f kroner\n", (int)(monthlyPayment * 100) / 100.0);
        System.out.printf("Total kostnad: %.2f kroner\n", (int)(totalPayment * 100) / 100.0);
    }
}
