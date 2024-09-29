/*
Dette programmet beregner arealet til en sirkel ved bruk av variabelen radius.
Verdien av beregningen lagres i variabelen area.
Area-variablen inkorporeres i tilbakemeldingen for bruker bakt inn i tekststreng.
 */

public class ComputeArea_2_1 {
    public static void main(String[] args) {

        // Deklarere radiusvariabel som double datatype
        double radius;

        // Deklarere arealvariabelen som double datatype
        double area;

        // Tilordne verdien til radiusvariabel som 20
        radius = 20;

        // Beregne arealet
        area = radius * radius * 3.14159;

        // Gi beskjed til bruker
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
