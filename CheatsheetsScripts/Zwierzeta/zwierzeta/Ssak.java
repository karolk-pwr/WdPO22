package zwierzeta;

/**
 * Klasa Ssak dziedzicząca po klasie Zwierz (Ssak to jest Zwierz)
 */
public class Ssak extends Zwierz {
    protected boolean lata;
    protected boolean plywa;
    /**
     * Konstruktor klasy Ssak
     */
    public Ssak() {
        super(10, "Homo Sapiens");
        this.lata = false;
        this.plywa = false;
    }
}
