package Bibliothek;

public class Book {
    private String author;
    private String title;
    private boolean bookOk;

    // Standardkonstruktor
    public Book() {
        this.author = "";
        this.title = "";
        this.bookOk = true;
    }

    // Parametrisierter Konstruktor
    public Book(String author, String title, boolean bookOk) {
        this.author = author;
        this.title = title;
        this.bookOk = bookOk;
    }

    // Copy-Konstruktor
    public Book(Book other) {
        this.author = other.author;
        this.title = other.title;
        this.bookOk = other.bookOk;
    }

    // Getter-Methoden
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBookOk() {
        return bookOk;
    }

    // Setter-Methode für bookOk
    public void setBookOk(boolean bookOk) {
        this.bookOk = bookOk;
    }

    //toString()-Methode
    @Override
    public String toString() {
        return "Bibliothek.Book [Author=" + author + ", Title=" + title + ", Available=" + bookOk + "]";
    }
}
