import zwierzeta.*;

public class Main {
    public static void main(String[] args) {
        Zwierz jakis_zwierz_1 = new Zwierz(10, "Homo Sapiens");
        Pies pies_1 = new Pies(5, "Welsh corgi", "Kokos");
        Kot kot_1 = new Kot(6, "Czarny", "Salem");
        //
        System.out.print("Gatunek psa przed wywołaniem metody set_gatunek(): " + pies_1.get_gatunek());
        pies_1.set_gatunek("Canis familiaris");
        System.out.println(" oraz po: " + pies_1.get_gatunek());
        //
        System.out.print("Gatunek kota przed wywołaniem metody set_gatunek(): " + kot_1.get_gatunek());
        kot_1.set_gatunek("Felis catus");
        System.out.println(" oraz po: " + kot_1.get_gatunek());
        //
        jakis_zwierz_1.getInfo();
        pies_1.getInfo();
        kot_1.getInfo();
    }
}