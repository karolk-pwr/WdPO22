package psy;

/**
 * Klasa psy.Pies
 */
public class Pies {
    private int wiek;
    private String rasa;
    private String imie;
    /**
     * Domyślny konstruktor
     */
    public Pies () {
        wiek = 1;
        rasa = "kundel";
        imie = "Azor";
    }
    /**
     * Konstruktor pobierający trzy parametry
     * @param init_wiek  wiek psa
     * @param init_rasa  rasa psa
     * @param init_imie  imię psa
     */
    public Pies (int init_wiek, String init_rasa, String init_imie) {
        wiek = init_wiek;
        rasa = init_rasa;
        imie = init_imie;
    }
    /**
     * Zmień imię psa
     * @param nowe_imie  imię psa
     */
    public void setImie(String nowe_imie) {
        imie = nowe_imie;
    }
    /**
     * Zmień rasę psa
     * @param nowa_rasa  rasa psa
     */
    public void setRasa(String nowa_rasa) {
        rasa = nowa_rasa;
    }
    /**
     * Zmień wiek pieska
     * @param nowy_wiek  wiek w latach
     * @throws IllegalArgumentException  jeśli wiek <= 0
     */
    public void setWiek(int nowy_wiek) {
        try {
            if (nowy_wiek <= 0) {
                throw new IllegalArgumentException("Niepoprawny wiek!");
            }
            else {
                wiek = nowy_wiek;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
    /**
     * Informacje o piesku
     */
    public void getInfo() {
        System.out.println("Hau hau, mam na imię " + imie + " jestem psem rasy " + rasa + " i mam " + wiek + " lat, szczek szczek"); // (5)
    }
    /**
     * Metoda do tworzenia psów
     * @param init_wiek  wiek psa
     * @param init_rasa  rasa psa
     * @param init_imie  imię psa
     */
    static public Pies nowyPies(int init_wiek, String init_rasa, String init_imie) {
        Pies nowy_pies = new Pies(init_wiek, init_rasa, init_imie);
        return nowy_pies;
    }
}
