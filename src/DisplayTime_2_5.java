import java.util.Scanner;

/*
Dette programmet konverterer et gitt heltall antall sekunder til minutter. For eksempel skriver brukeren inn '7800'.
Programmet beregner dette antallet sekunder til antall minutter og antall sekunder.
 */
public class DisplayTime_2_5 {
    public static void main(String[] args) {
        // Oppretter skannerobjekt for å lese brukerinput
        Scanner skannerobjekt = new Scanner(System.in);

        // Be brukeren om sekunder
        System.out.println("Skriv inn et heltall for sekunder: ");

        // Verdien brukeren skriver inn lagres i variabelen sekunder
        int sekunder = skannerobjekt.nextInt();

        // Beregner minutter til å være sekunder / 60 (for å finne et minutt per 60. sekund)
        int minutter = sekunder / 60;       // Finn minutter i sekunder

        // Om antall sekunder ikke går opp i hele minutter lagres dette i
        int gjenverendeSekunder = sekunder % 60;

        System.out.println(sekunder + " sekunder er " + minutter + " minutter og " + gjenverendeSekunder + " sekunder");
    }
}
