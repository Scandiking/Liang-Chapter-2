import java.util.Scanner;

public class ComputeAverage_2_3 {
    public static void main(String[] args) {
        // Oppretter skannerobjekt
        Scanner input = new Scanner(System.in);

        // Be brukeren om å skrive inn tre tall vedkommende vil finne gjennomsnittet på:
        System.out.println("Skriv inn tre tall: ");
        double tall1 = input.nextDouble();
        double tall2 = input.nextDouble();
        double tall3 = input.nextDouble();

        // Beregn gjennomsnittet av disse tallene
        double gjennomsnitt = (tall1 + tall2 + tall3) / 3;

        // Vis resultater
        System.out.println("Gjennomsnittet av tallene " + tall1 + ", " + tall2 + " og " + tall3 + " er: " + gjennomsnitt);
    }
}
