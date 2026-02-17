package Schule;

public class Person {
    private String name;
    private Date geburtsdatum;

    public Person(String name, Date geburtsdatum) {
        this.name = name;
        this.geburtsdatum = geburtsdatum;
    }

    public String getName() {
        return name;
    }

    public Date getGeburtsdatum() {
        return geburtsdatum;
    }
}



