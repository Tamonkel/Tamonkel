import java.util.Scanner;
public class Kreisberechnung { //CircleAnwendung

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius ; // Radius
        double durchmesser; // Durchmesser
        double kreisflaeche; //Fläche
        double kreisumfang; // Umfang


        System.out.println("Gebe einen Radius ein: ");
        radius = scanner.nextDouble();
        scanner.close();

        // Berechnungen
        durchmesser = 2 * radius;
        kreisflaeche = radius * radius * Math.PI;
        kreisumfang = 2 * radius * Math.PI;

        // Ausgaben
        System.out.printf("Durchmesser: %.2f\n", durchmesser);
        System.out.printf("Fläche: %.3f\n", kreisflaeche);
        System.out.printf("Umfang: %.3f\n", + kreisumfang);

    }

}
