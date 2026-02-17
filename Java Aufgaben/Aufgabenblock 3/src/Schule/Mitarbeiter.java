package Schule;

public abstract class Mitarbeiter extends Person {
    protected int gehalt;
    protected Date eintrittsdatum;

    public Mitarbeiter(String name, Date geburtsdatum, int gehalt, Date eintrittsdatum) {
        super(name, geburtsdatum);

        if (gehalt >= 100 && gehalt <= 500) {
            this.gehalt = gehalt;
        } else {
            throw new IllegalArgumentException("Gehalt muss zwischen 100 und 500 liegen.");
        }

        this.eintrittsdatum = eintrittsdatum;

        int alter = eintrittsdatum.getJahr() - geburtsdatum.getJahr();
        if (alter < 20) {
            throw new IllegalArgumentException("Mindestalter beim Eintritt ist 20 Jahre.");
        }
    }

    public int getGehalt() {
        return gehalt;
    }

    public Date getEintrittsdatum() {
        return eintrittsdatum;
    }
}

