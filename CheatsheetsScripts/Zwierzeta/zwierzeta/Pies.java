package zwierzeta;

/**
 * Klasa Pies dziedzicząca po klasie Ssak (Pies należy do Ssak)
 */
public final class Pies extends Ssak {
    private String rasa;
    private String imie;  // Zwierzęta nieudomowione nie mają imion
    /**
     * Konstruktor klasy Pies pobierający trzy parametry
     */
    public Pies (int wiek, String rasa, String imie) {
        // Nie ma potrzeby zawierania instrukcji super(), ponieważ klasa nadrzędna Ssak posiada konstruktor domyślny
        super();
        this.wiek = wiek;
        this.rasa = rasa;
        this.imie = imie;
    }
    /**
     * Metoda wypisująca informacje o obiekcie
     */
    @Override
    public void getInfo() {
        System.out.println("Hau hau, mam na imię " + this.imie + " jestem psem rasy "
                            + this.rasa + " i mam " + this.wiek + " lat, szczek szczek"); // (5)
    }
}
