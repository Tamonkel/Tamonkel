package Bankanwendung;

public class Account {
    private static int nächsteKontonummer = 1000;

    private int Kontonummer;
    private Person Kontoinhaber;
    private Date DatumDerEröffnung;
    private double AktuellerKontostand;
    private double MaximalerÜberziehungsbetrag;

    public Account(Person Kontoinhaber, Date DatumDerEröffnung, double AktuellerKontostand, double MaximalerÜberziehungsbetrag) {
        this.Kontoinhaber = Kontoinhaber;
        this.DatumDerEröffnung = DatumDerEröffnung;
        this.AktuellerKontostand = AktuellerKontostand;
        this.MaximalerÜberziehungsbetrag = MaximalerÜberziehungsbetrag;
        this.Kontonummer = nächsteKontonummer++;
    }
}

