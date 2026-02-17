package Bibliothek;

import java.util.ArrayList;

public class Library {
    private static final int STANDARD_KAPAZITÄT = 100;
    private int maximaleKapazität;
    private int aktuelleAnzahl;
    private ArrayList<Book> books;

    // Konstruktor, der Liste übernimmt
    public Library(ArrayList<Book> libList) {
        if (libList == null) {
            throw new IllegalArgumentException("Liste darf nicht null sein.");
        }
        this.books = new ArrayList<>(libList);
        this.maximaleKapazität = STANDARD_KAPAZITÄT;
        this.aktuelleAnzahl = books.size();
    }

    // Konstruktor mit Kapazität
    public Library(int kapazität) {
        if (kapazität <= 0) {
            throw new IllegalArgumentException("Kapazität muss größer als 0 sein.");
        }
        this.maximaleKapazität = kapazität;
        this.books = new ArrayList<>();
        this.aktuelleAnzahl = 0;
    }

    // Buch ausleihen (Autor + Titel)
    public boolean lend(String author, String title) {
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            if (b.getAuthor().equalsIgnoreCase(author) && b.getTitle().equalsIgnoreCase(title)) {
                books.remove(i);
                aktuelleAnzahl--;
                return true;
            }
        }
        return false;
    }

    // Buch zurückgeben (mit Autor, Titel, Zustand)
    public boolean giveBack(String author, String title, boolean bookOk) {
        if (aktuelleAnzahl >= maximaleKapazität) {
            return false; // kein Platz
        }
        Book returnedBook = new Book(author, title, bookOk);
        books.add(returnedBook);
        aktuelleAnzahl++;
        return true;
    }

    public int getCurrentCount() {
        return aktuelleAnzahl;
    }

    public int getMaxKapazität() {
        return maximaleKapazität;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Bibliothek:\n");
        for (Book b : books) {
            sb.append(b.toString()).append("\n");
        }
        return sb.toString();
    }
}
