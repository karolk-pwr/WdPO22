package zwierzeta;

/**
 * Klasa Kot dziedzicząca po klasie Ssak (Pies należy do Ssak)
 */
public final class Kot extends Ssak {
    private String kolor;
    private String imie;  // Zwierzęta nieudomowione nie mają imion
    /**
     * Konstruktor klasy Kot pobierający trzy parametry
     */
    public Kot (int init_wiek, String init_kolor, String init_imie) {
        // Nie ma potrzeby zawierania instrukcji super(), ponieważ klasa nadrzędna Ssak posiada konstruktor domyślny
        this.wiek = wiek;
        this.kolor = init_kolor;
        this.imie = init_imie;
    }
    /**
     * Metoda wypisująca informacje o obiekcie
     */
    @Override
    public void getInfo() {
        System.out.println("Miau miau, mam na imię " + this.imie + " jestem kotem koloru "
                + this.kolor + " i mam " + this.wiek + " lat, idę spać"); // (5)
    }
}
