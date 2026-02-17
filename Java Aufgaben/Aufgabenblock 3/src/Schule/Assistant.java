package Schule;

public class Assistant extends Mitarbeiter {
    private int personalnummer;

    public Assistant(String name, Date geburtsdatum, int gehalt, int personalnummer, Date eintrittsdatum) {
        super(name, geburtsdatum, gehalt, eintrittsdatum);

        if (personalnummer >= 0) {
            this.personalnummer = personalnummer;
        } else {
            throw new IllegalArgumentException("Personalnummer muss >= 0 sein.");
        }
    }

    public int getPersonalnummer() {
        return personalnummer;
    }
}
