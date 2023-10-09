package zwierzeta;

/**
 * Klasa nadrzędna Zwierz
 */
public class Zwierz {
    protected int wiek;
    protected String gatunek;
    /**
     * Konstruktor
     */
    public Zwierz(int wiek, String gatunek) {
        this.wiek = wiek;
        this.gatunek = gatunek;
    }
    /**
     * Ustal zmienną gatunek
     */
    public void set_gatunek(String gatunek) {
        this.gatunek = gatunek;
    }
    /**
     * Pobierz zmienną gatunek
     */
    public String get_gatunek() {
        return this.gatunek;
    }
    /**
     * Metoda wypisująca informacje
     */
    public void getInfo() {
        System.out.println("Cześć, należę do gatunku " + this.gatunek+ " i mam " + this.wiek + " lat");
    }
}