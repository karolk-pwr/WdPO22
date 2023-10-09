/**
 * Klasa Samochod
 */
public class Samochod {
    private Silnik silnik;
    public Samochod(Silnik s) {
        this.silnik = s;
    }
    public void start() {
        this.silnik.uruchom();
    }
    public void tankuj(int ilosc) {
        this.silnik.tankuj(ilosc);
    }
    public void stop() {
        this.silnik.wyłącz();
    }
}


/*
[specyfikator_dostępu] interface nazwa_interfejsu {
    elementy_interfejsu...
 */