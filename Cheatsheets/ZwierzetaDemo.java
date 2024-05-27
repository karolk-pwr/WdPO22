import zwierzeta.*;

public class ZwierzetaDemo {
    public static void main(String[] args) {
        Zwierz jakis_zwierz = new Zwierz(10, "homo sapiens");
        Pies pies = new Pies(5, "welsh corgi", "Kokos");
        Kot kot = new Kot(6, "munchkin", "Salem");
        //
        System.out.print("Gatunek psa przed wywołaniem metody set_gatunek(): " + pies.get_gatunek());
        pies.set_gatunek("Canis familiaris");
        System.out.println(" oraz po: " + pies.get_gatunek());
        //
        System.out.print("Gatunek kota przed wywołaniem metody set_gatunek(): " + kot.get_gatunek());
        kot.set_gatunek("Felis catus");
        System.out.println(" oraz po: " + kot.get_gatunek());
        //
        jakis_zwierz.getInfo();
        pies.getInfo();
        kot.getInfo();
    }
}