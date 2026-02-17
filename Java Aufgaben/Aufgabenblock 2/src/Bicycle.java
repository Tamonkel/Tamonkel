public class Bicycle {
    int anzahlBremsen;
    int geschwindigkeit;
    String hersteller;
    String fahrradTyp;

    // Default-Konstruktor
    public Bicycle() {
        System.out.println("Default");
        anzahlBremsen = 1;
        geschwindigkeit = 10;
        hersteller = "Thomas";
        fahrradTyp = "BMX";
    }

    // Standard-Konstruktor (Voll qualifizierter Konstruktor)
    public Bicycle(int anzahlBremsen, int geschwindigkeit, String hersteller, String fahrradTyp) {
        System.out.println("Standard Konstruktor");
        this.anzahlBremsen = anzahlBremsen;
        this.geschwindigkeit = geschwindigkeit;
        this.hersteller = hersteller;
        this.fahrradTyp = fahrradTyp;
    }

    // Kopierkonstruktor
    public Bicycle(Bicycle other) {
        System.out.println("Kopierkonstruktor");
        this.anzahlBremsen = other.getAnzahlBremsen();
        this.geschwindigkeit = other.getGeschwindigkeit();
        this.hersteller = other.getHersteller();
        this.fahrradTyp = other.getFahrradTyp();
    }

    public int getAnzahlBremsen() {
        return anzahlBremsen;
    }

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public String getHersteller() {
        return hersteller;
    }

    public String getFahrradTyp() {
        return fahrradTyp;
    }

    //Eigenschaften des Fahrrads ausgeben
    public void print() {
        System.out.println("Anzahl Bremsen: " + anzahlBremsen);
        System.out.println("Geschwindigkeit: " + geschwindigkeit);
        System.out.println("Hersteller: " + hersteller);
        System.out.println("Fahrradtyp: " + fahrradTyp);
    }


    @Override
    public String toString() {
        return "Bicycle{" + "anzahlBremsen=" + anzahlBremsen +", geschwindigkeit=" + geschwindigkeit + ", hersteller='" + hersteller + '\'' +", fahrradTyp='" + fahrradTyp + '\'' +'}';
    }

    public static void main(String[] args) {
        // Default Konstruktor
        Bicycle b1 = new Bicycle();
        b1.print();

        // Standard Konstruktor
        Bicycle b2 = new Bicycle(2, 20, "Thomas", "BMX");
        b2.print();
        System.out.println(b2);

        // Kopierkonstruktor
        Bicycle b3 = new Bicycle(b2);
        System.out.println("Kopierkonstruktor:");
        b3.print();
    }
}
