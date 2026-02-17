import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class LottoApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random(); // zufall

        // Bereiche Der LottoZahlen defenieren
        System.out.println("bei welcher zahl soll Lottoziehung starten?: ");
        int ZAHL_VON = scanner.nextInt();
        System.out.println("bei welcher zahl soll Lottoziehung enden?:");
        int ZAHL_BIS = scanner.nextInt();

        // Bereiche Der Superzahl defenieren
        System.out.println("bei welcher Superzahl soll Lottoziehung starten?:");
        int SUPER_VON = scanner.nextInt();
        System.out.println("bei welcher Superzahl soll Lottoziehung enden?:");
        int SUPER_BIS = scanner.nextInt();


        int[] zahlen = new int[6]; // Array mit 6 Elementen
        int[] superzahl = new int[1]; // Array mit 1 Element


        for (int i = 0; i < 6; i++) { //wenn i = 6 aufhören
            zahlen[i] = r.nextInt(ZAHL_VON) + ZAHL_BIS; // Zufallszahl zwischen 1 und 49 (6 mal)
        }

        superzahl[0] = r.nextInt(SUPER_VON) + SUPER_BIS; // zufalzahl 0-9

        //Array Sortieren
        //Arrays.sort(zahlen, ZAHL_VON, ZAHL_BIS); // anpassen !

        // zahlen audgeben
        System.out.println("Die Lottozahlen lauten: " + Arrays.toString(zahlen) + ", Superzahl: " + Arrays.toString(superzahl));

    }

}

