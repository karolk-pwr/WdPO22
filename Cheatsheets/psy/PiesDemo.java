package psy;

public class PiesDemo {
    /**
     * Klasa psy.PiesDemo
     * @param args
     */
    public static void main(String[] args) {
        Pies pies_1 = new Pies(5, "welsh corgi", "Kokos");
        Pies pies_2 = new Pies(2, "samojed", "Okami");
        pies_1.setWiek(6);
        pies_2.setWiek(-1);
        pies_1.getInfo();
        pies_2.getInfo();
    }
}