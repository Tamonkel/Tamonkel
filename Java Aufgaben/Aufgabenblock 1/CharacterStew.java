import java.util.Scanner;
public class CharacterStew {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String abfragen
        System.out.println("Bitte geben Sie einen String mit 4-6 Zeichen ein");
        System.out.println("Die zeichen muessen unterschiedlich sein");
        System.out.print("Eingabe myStr: ");
        String myStr = scanner.nextLine();

        // Prüfen der länge des Strings
        if (myStr.length() < 4 || myStr.length() > 6) {
            System.out.println("Der String muss zwischen 4 und 6 Zeichen lang sein.");
            return;
        }

        // Satz abfragen
        System.out.println("Bitte geben Sie einen Satz sentence in einer Zeile ein:");
        String sentence = scanner.nextLine();


        // Histogramm berechnen
        int[] haeufigkeit = new int[myStr.length()]; // Array erstellen

        // Durchlaufe jedes Zeichen des Strings myStr
        for (int i = 0; i < myStr.length(); i++) {
            char c = myStr.charAt(i);
            // Durchlaufe jedes Zeichen des Satzes sentence
            for (int j = 0; j < sentence.length(); j++) {
                if (sentence.charAt(j) == c) {
                    haeufigkeit[i]++;
                }
            }
        }

        // Histogramm ausgeben
        for (int i = 0; i < myStr.length(); i++) {
            char c = myStr.charAt(i);
            System.out.println(c + " kommt im Satz " + haeufigkeit[i] + "x vor!");
        }

        for (int i = 0; i < myStr.length(); i++) {
            char c = myStr.charAt(i);
            System.out.print(c + ": ");
            for (int j = 0; j < haeufigkeit[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

