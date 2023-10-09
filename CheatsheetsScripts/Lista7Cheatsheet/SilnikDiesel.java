public class SilnikDiesel implements Silnik {
    // pola, konstruktur, gettery i settery
    int olej_napedowy;
    SilnikDiesel() {
        olej_napedowy = 0;
    }
    @Override
    public void uruchom() {
        // implementacja
        System.out.println("Uruchamiam silnik diesela");
    }
    @Override
    public void wyłącz() {
        // implementacja
        System.out.println("Wyłączam silnik diesela");
    }
    @Override
    public void tankuj(int ilosc) {
        // implementacja
        System.out.println("Tankuję " + ilosc + " litrów oleju napędowego.");
        this.olej_napedowy = ilosc;
    }
}

