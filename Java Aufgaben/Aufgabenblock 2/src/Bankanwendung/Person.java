package Bankanwendung;

public class Person {
    private String Nachname;
    private String Vorname;
    private String Telefonnummer;
    private Address Hausanschrift;
    private String WWWAdresse;
    private String EmailAdresse;
    private Date Geburtsdatum;

    public Person(String Vorname, String Nachname, Address Hausanschrift, Date Geburtsdatum) {
        this.Vorname = Vorname;
        this.Nachname = Nachname;
        this.Hausanschrift = Hausanschrift;
        this.Geburtsdatum = Geburtsdatum;
    }
}
