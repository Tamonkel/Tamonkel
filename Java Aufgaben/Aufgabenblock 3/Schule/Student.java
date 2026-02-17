package Schule;

public class Student extends Person {
    private int matrikelnummer;
    private int semester;

    public Student(String name, Date geburtsdatum, int matrikelnummer, int semester) {
        super(name, geburtsdatum);
        this.matrikelnummer = matrikelnummer;
        this.semester = semester;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public int getSemester() {
        return semester;
    }
}


