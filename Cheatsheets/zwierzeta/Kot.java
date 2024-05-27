package zwierzeta;

/**
 * Klasa Kot dziedzicząca po klasie Ssak (Pies należy do Ssak)
 */
public final class Kot extends Ssak {
    private String rasa;
    private String imie;  // Zwierzęta nieudomowione nie mają imion
    /**
     * Konstruktor klasy Kot pobierający trzy parametry
     */
    public Kot (int wiek, String rasa, String imie) {
        // Nie ma potrzeby zawierania instrukcji super(), ponieważ klasa nadrzędna Ssak posiada konstruktor domyślny
        this.wiek = wiek;
        this.rasa = rasa;
        this.imie = imie;
    }
    /**
     * Metoda wypisująca informacje o obiekcie
     */
    @Override
    public void getInfo() {
        System.out.println("Miau miau, mam na imię " + this.imie + " jestem kotem rasy "
                + this.rasa + " i mam " + this.wiek + " lat, idę spać"); // (5)
    }
}
