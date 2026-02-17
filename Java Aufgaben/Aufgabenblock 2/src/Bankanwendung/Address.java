package Bankanwendung;

public class Address {
    private String Laenderkennzeichen;
    private String Postleitzahl;
    private String Ort;
    private String Straße;
    private String Hausnummer;

    public Address(String Laenderkennzeichen, String Postleitzahl, String Ort, String Straße, String Hausnummer) {
        this.Laenderkennzeichen = Laenderkennzeichen;
        this.Postleitzahl = Postleitzahl;
        this.Ort = Ort;
        this.Straße = Straße;
        this.Hausnummer = Hausnummer;
    }
}