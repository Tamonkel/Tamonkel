package Bibliothek;

import java.util.Scanner;

public class LibraryTerminal {
    private Library library;

    public LibraryTerminal(Library library) {
        this.library = library;
    }

    public void service(Scanner scanner) {
        System.out.println("Wie viele Ausleihen oder Abgaben? ");
        int actions = scanner.nextInt();
        scanner.nextLine(); // Puffer leeren

        for (int i = 0; i < actions; i++) {
            System.out.println("Abgeben oder Ausleihen?");
            String choice = scanner.nextLine().trim().toLowerCase();

            if (choice.equals("abgeben")) {
                System.out.println("Ok, Sie geben zurück!");
                System.out.println("Autor eingeben:");
                String author = scanner.nextLine();
                System.out.println("Titel eingeben:");
                String title = scanner.nextLine();
                System.out.println("Ist das Buch in Ordnung? Ja/Nein");
                String zustand = scanner.nextLine().trim().toLowerCase();
                boolean bookOk = zustand.equals("ja");

                boolean success = library.giveBack(author, title, bookOk);
                if (success) {
                    System.out.println("Buch erfolgreich zurückgegeben.");
                } else {
                    System.out.println("Kein Platz in der Bibliothek, Buch konnte nicht zurückgegeben werden.");
                }

            } else if (choice.equals("ausleihen")) {
                System.out.println("Ok, Sie leihen aus!");
                System.out.println("Autor eingeben:");
                String author = scanner.nextLine();
                System.out.println("Titel eingeben:");
                String title = scanner.nextLine();

                boolean success = library.lend(author, title);
                if (success) {
                    System.out.println("Buch ausgeliehen: " + author + ": " + title + " Zustand ok? Ja");
                } else {
                    System.out.println("Buch nicht gefunden oder nicht verfügbar.");
                }
            }

        }
    }
}
