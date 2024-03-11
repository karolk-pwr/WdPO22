package psy;

public class Pies {
    /**
     * Klasa psy.Pies
     */
    private int wiek;
    private String rasa;
    private String imie;
    public Pies () {
        /**
         * Domyślny konstruktor
         */
        wiek = 1;
        rasa = "kundel";
        imie = "Azor";
    }
    public Pies (int init_wiek, String init_rasa, String init_imie) {
        /**
         * Konstruktor pobierający trzy parametry
         */
        wiek = init_wiek;
        rasa = init_rasa;
        imie = init_imie;
    }
    public void setImie(String nowe_imie) {
        /**
         * Zmień imię psa
         * @param nowe_imie  imię psa
         */
        imie = nowe_imie;
    }
    public void setRasa(String nowa_rasa) {
        /**
         * Zmień rasę psa
         * @param nowa_rasa  rasa psa
         */
        rasa = nowa_rasa;
    }
    public void setWiek(int nowy_wiek) {
        /**
         * Zmień wiek pieska
         * @param nowy_wek  wiek w latach
         * @throws IllegalArgumentException  jeśli wiek <= 0
         */
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
    public void getInfo() {
        /**
         * Informacje o piesku
         */
        System.out.println("Hau hau, mam na imię " + imie + " jestem psem rasy " + rasa + " i mam " + wiek + " lat, szczek szczek"); // (5)
    }
    static public Pies nowyPies(int init_wiek, String init_rasa, String init_imie) {
        Pies nowy_pies = new Pies(init_wiek, init_rasa, init_imie);
        return nowy_pies;
    }
}
