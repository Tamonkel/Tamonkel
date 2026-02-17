package Schule;

public class Professor extends Mitarbeiter {
    private String lehrgebiet;
    private String fakultät;

    public Professor(String name, Date geburtsdatum, int gehalt, String lehrgebiet, String fakultät, Date eintrittsdatum) {
        super(name, geburtsdatum, gehalt, eintrittsdatum);
        this.lehrgebiet = lehrgebiet;
        this.fakultät = fakultät;
    }

    public String getLehrgebiet() {
        return lehrgebiet;
    }

    public String getFakultät() {
        return fakultät;
    }
}
