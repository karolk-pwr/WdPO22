public class SilnikBenzynowy implements Silnik{
    // pola, konstruktur, gettery i settery
    int paliwo;
    SilnikBenzynowy() {
        paliwo = 0;
    }
    @Override
    public void uruchom() {
        // implementacja
        System.out.println("Uruchamiam silnik benzynowy");
    }
    @Override
    public void wyłącz() {
        // implementacja
        System.out.println("Wyłączam silnik benzynowy");
    }
    @Override
    public void tankuj(int ilosc) {
        // implementacja
        System.out.println("Tankuję " + ilosc + " litrów paliwa.");
        this.paliwo = ilosc;
    }
}
