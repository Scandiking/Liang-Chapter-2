import java.util.Scanner;

public class ComputeAreaWithConsoleInput_2_2 {
    public static void main(String[] args) {
        // Oppretter objekt å skanne med
        // vha skanneelementet
        Scanner input = new Scanner(System.in);

        // Be brukeren om å skrive inn radius på sirkelen
        System.out.println("Skriv inn sirkelens radius: ");

        // double != 2*radius, men datatype
        double radius = input.nextDouble();

        // Beregn areal
        // pi*r^2
        double area = Math.PI * radius * radius;

        // Vis areal
        System.out.println("Sirkelens areal er " + area);
    }
}
