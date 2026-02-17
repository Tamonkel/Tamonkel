public class KlasseStadium {
    private String name;
    private String adresse;
    private int maxZuschauer;
    private int aktuelleZuschauer;

    // Konstruktor
    public KlasseStadium(String name, String adresse, int maxZuschauer, int aktuelleZuschauer) {
        this.name = name;
        this.adresse = adresse;
        this.maxZuschauer = maxZuschauer;
        this.aktuelleZuschauer = aktuelleZuschauer;
    }

    // Getter-Methoden
    public String getName() {
        return name;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getMaxZuschauer() {
        return maxZuschauer;
    }

    public int getAktuelleZuschauer() {
        return aktuelleZuschauer;
    }

    // Setter-Methoden mit Validierung
    public void setMaxZuschauer(int maxZuschauer) {
        if (maxZuschauer >= 0) {
            this.maxZuschauer = maxZuschauer;
        } else {
            System.out.println("Fehler: Maximale Zuschauerzahl muss größer oder gleich 0 sein.");
        }
    }

    public void setAktuelleZuschauer(int aktuelleZuschauer) {
        if (aktuelleZuschauer >= 0 && aktuelleZuschauer <= maxZuschauer) {
            this.aktuelleZuschauer = aktuelleZuschauer;
        } else {
            System.out.println("Fehler: Zuschauerzahl muss zwischen 0 und maxZuschauer liegen.");
        }
    }

    // Methode zur Ausgabe der Stadioninformationen
    public void print() {
        System.out.println("Stadionname: " + name);
        System.out.println("Adresse: " + adresse);
        System.out.println("Maximale Zuschauerzahl: " + maxZuschauer);
        System.out.println("Aktuelle Zuschauerzahl: " + aktuelleZuschauer);
    }

    // Hauptmethode zum Testen der Klasse
    public static void main(String[] args) {
        KlasseStadium stadion = new KlasseStadium("Teststadium", "Dortmund, Deutschland", 88888, 50000);
        stadion.print();
    }
}
