package Bankanwendung;

public class AccountApp {
    public static void main(String[] args) {
        // Adresse anlegen
        Address adresse = new Address("DE", "10115", "Berlin", "Musterstraße", "12A");

        // Geburtsdatum anlegen
        Date geburtsdatum = new Date(15, 6, 1990);

        // Person anlegen
        Person person = new Person("Max", "Mustermann", adresse, geburtsdatum);

        // Kontoeröffnungsdatum
        Date eröffnungsdatum = Date.today();

        // Konto anlegen
        Account konto = new Account(person, eröffnungsdatum, 1000.0, 500.0);

        // Ausgabe zur Bestätigung
        System.out.println("Account erfolgreich erstellt.");
    }
}
