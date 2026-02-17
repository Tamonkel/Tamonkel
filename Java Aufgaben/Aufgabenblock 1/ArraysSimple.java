import java.util.Scanner;
import java.util.Locale;

public class ArraysSimple {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);

        // 1. Länge des Arrays erfragen
        System.out.print("Wie lang wird das Array? ");
        int laenge = keyboard.nextInt();

        // 2. Array erstellen und befüllen
        double[] arr = new double[laenge]; // array arr erstellen
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Wert " + i + ": ");
            arr[i] = keyboard.nextDouble(); // Werte eingeben, so oft wie lang der Array ist (laenge)
        }

        // Ausgabe des Arrays arr
        for (double myDoubleVar : arr) {
            System.out.printf(Locale.US, "%.2f ", myDoubleVar);
        }
        System.out.println(); // neue linie

        // 3. Zweites Array quad mit quadrierten Werten
        double[] quad = new double[arr.length]; // Array quad erstellen
        for (int i = 0; i < arr.length; i++) {
            quad[i] = arr[i] * arr[i]; // Quadrieren der Werte
        }

        // Ausgabe des Arrays quad
        for (double wert : quad) {
            System.out.printf(Locale.US, "%.2f ", wert);
        }
        System.out.println();

        // 4. Drittes Array half mit jedem zweiten Wert
        int halfLength = (arr.length % 2 == 0) ? arr.length / 2 : (arr.length / 2 + 1);
        double[] half = new double[halfLength];
        for (int i = 0; i < half.length; i++) {
            half[i] = arr[i * 2]; // Jeden zweiten Wert kopieren
        }

        // Ausgabe des Arrays half
        for (double wert : half) {
            System.out.printf(Locale.US, "%.2f ", wert);
        }
        System.out.println();
    }
}
