package Bibliothek;

import java.util.*;

public class TerminalMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();
        list.add(new Book("G. Lockhart", "Garten-Entgnomen", true));
        list.add(new Book("M. McGonagall", "Verwandlung", true));
        list.add(new Book("S. Snape", "Zaubertraenke", true));
        list.add(new Book("F. Weasley", "Pranks for professionals", true));
        list.add(new Book("M. Pomfrey", "Basics:Skeleton-Wax", true));

        Library lib = new Library(list);
        LibraryTerminal terminal = new LibraryTerminal(lib);
        terminal.service(sc);
        sc.close();
    }
}

