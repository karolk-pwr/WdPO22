import psy.Pies;
public class Main {
    public static void main(String[] args) {
        Pies pies_3 = new Pies();
        pies_3.getInfo();
        Pies pies_4 = Pies.nowyPies(5, "pies", "Perrito");
        pies_4.getInfo();
    }
    ;
}