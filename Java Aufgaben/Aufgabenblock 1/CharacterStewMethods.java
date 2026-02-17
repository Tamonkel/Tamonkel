import java.util.Scanner;

public class CharacterStewMethods {

    // Eingabe des Test-Strings myStr
    public static String inputChars(Scanner s) {
        System.out.println("Bitte geben Sie einen String mit 4-6 Zeichen ein:");
        System.out.println("Die Zeichen müssen unterschiedlich sein!");
        System.out.print("Eingabe myStr: ");
        String myStr = s.nextLine();
        if (myStr.length() < 4 || myStr.length() > 6) {
            System.out.println("Der String muss zwischen 4 und 6 Zeichen lang sein.");
            return null; // Ungültige Eingabe
        }
        return myStr; // Gültigen String zurückgeben
    }

    // Eingabe des Satzes sentence
    public static String inputSentence(Scanner s) {
        System.out.println("Bitte geben Sie einen Satz sentence in einer Zeile ein:");
        return s.nextLine().trim(); // Eingabe trimmen
    }

    // Berechnung und Rückgabe des Histogramm-Arrays
    public static int[] createHisto(String myChars, String sentence) {
        int[] histo = new int[myChars.length()];
        for (int i = 0; i < myChars.length(); i++) {
            char c = myChars.charAt(i);
            for (int j = 0; j < sentence.length(); j++) {
                if (sentence.charAt(j) == c) {
                    histo[i]++;
                }
            }
        }
        return histo; // Histogramm-Array zurückgeben
    }

    // Textausgabe des Histogramms
    public static void printHistoWords(String myChars, int[] histo) {
        for (int i = 0; i < myChars.length(); i++) {
            char c = myChars.charAt(i);
            System.out.println(c + " kommt im Satz " + histo[i] + "x vor!");
        }
    }

    // **-Ausgabe des Histogramms
    public static void printHistoGraph(String myChars, int[] histo) {
        for (int i = 0; i < myChars.length(); i++) {
            char c = myChars.charAt(i);
            System.out.print(c + ": ");
            for (int j = 0; j < histo[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Hauptmethode
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Eingabe des Test-Strings myStr
        String myChars = inputChars(keyboard);
        if (myChars == null) { return; } // Beenden, falls ungültige Eingabe

        // Eingabe des Satzes sentence
        String sentence = inputSentence(keyboard);
        if (sentence == null) { return; } // Beenden, falls null

        // Berechnung des Histogramms
        int[] histo = createHisto(myChars, sentence);
        // Ausgabe des Histogramms
        printHistoWords(myChars, histo);
        printHistoGraph(myChars, histo);
        // Scanner schließen
        keyboard.close();
    }
}

