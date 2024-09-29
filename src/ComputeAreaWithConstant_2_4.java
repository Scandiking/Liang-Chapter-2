import java.util.Scanner;

public class ComputeAreaWithConstant_2_4 {
    public static void main(String[] args) {

        // I et program hvor man beregner areal og omkrets på sirkler er det enkelte tall som vil gå igjen,
        // for eksempel vil man bruke PI ofte. I stedet for å deklarere pi gjentatte ganger eller skrive 3.14(...)
        // hver gang kan vi deklarere en konstant, en "variabel" som ikke forandrer seg, men er... vel... konstant.
        // Det er konvensjon at konstanser skrives i UPPERCASE.
        // Deklarerer og initialiserer konstant:
        final double PI = 3.14159265358979323846;

        // Oppretter skannerobjekt for å lese brukerinput
        Scanner input = new Scanner(System.in);

        // Ber bruker om å skrive inn input
        System.out.println("Skriv inn tall på radius: ");

        // Lagrer verdien brukeren skriver inn i variablen radius
        // IKKE en konstant fordi hva brukeren skriver inn vil variere.
        double radius = input.nextDouble();

        // Gir beskjed om at brukerinput er registrert og hva som er registrert
        System.out.println("Du anga at sirkelens radius er " + radius);

        // Beregner sirkelens areal basert på konstanten PI og variabelen radius
        double area = PI * radius * radius;

        // Gir brukeren beskjed om hva som er sirkelens areal og viser utregningen for dette
        System.out.println(PI + " * " + radius + " * " + radius + " = " + area);
    }
}
