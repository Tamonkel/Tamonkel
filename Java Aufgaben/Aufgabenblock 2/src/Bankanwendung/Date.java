package Bankanwendung;

public class Date {
    private int Tag;
    private int Monat;
    private int Jahr;

    public Date() {
        this.Tag = 1;
        this.Monat = 1;
        this.Jahr = 1900;
    }

    public Date(int Tag, int Monat, int Jahr) {
        if (istGueltig(Tag, Monat, Jahr)) {
            this.Tag = Tag;
            this.Monat = Monat;
            this.Jahr = Jahr;
        } else {
            this.Tag = 1;
            this.Monat = 1;
            this.Jahr = 1900;
        }
    }

    private boolean istGueltig(int Tag, int Monat, int Jahr) {
        int[] tageProMonat = {31,28,31,30,31,30,31,31,30,31,30,31};
        return Monat >= 1 && Monat <= 12 && Tag >= 1 && Tag <= tageProMonat[Monat - 1];
    }

    public static Date today() {
        return new Date(13, 5, 2025);
    }
}

