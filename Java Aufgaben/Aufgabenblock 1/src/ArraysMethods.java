import java.util.Locale;
import java.util.Scanner;
public class ArraysMethods {

    public static double[] input(Scanner keyb) {

        // 1. Länge des Arrays erfragen
        System.out.print("Wie lang wird das Array? ");
        int laenge = keyb.nextInt();
        double[] arr = new double[laenge];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Wert " + i + ": ");
            arr[i] = keyb.nextDouble(); // Werte eingeben, so oft wie lang der Array ist (laenge)
        }
        return arr;
    }

    public static double[] quadArray(double[] paramArr) {
        double[] quad = new double[paramArr.length]; // Array quad erstellen
        for (int i = 0; i < paramArr.length; i++) {
            quad[i] = paramArr[i] * paramArr[i]; // Quadrieren der Werte
        }
        return quad;
    }

    public static double [] halfArray(double [] paramArr) {
        int halfLength = (paramArr.length % 2 == 0) ? paramArr.length / 2 : (paramArr.length / 2 + 1);
        double[] half = new double[halfLength];

        for (int i = 0; i < half.length; i++) {
            half[i] = paramArr[i * 2]; // Jeden zweiten Wert kopieren
        }
        return half;
    }

    public static void printArray(double [] paramArr) {

        for (double wert : paramArr) {
            System.out.printf(Locale.US, "%.2f ", wert);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);
        double [] arr, quad, half;

        arr = input(keyboard);
        printArray(arr);
        quad = quadArray(arr);
        printArray(quad);
        half = halfArray(arr);
        printArray(half);
        keyboard.close();
    }
}