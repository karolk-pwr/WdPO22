package Lista7Cheatsheet;

public class SamochodDemo {
    public static void main(String[] args) {
        Samochod toyotaYaris = new Samochod(new SilnikBenzynowy());
        Samochod toyotaAvensis = new Samochod(new SilnikDiesel());

        System.out.println("####################");
        toyotaYaris.start();
        toyotaYaris.tankuj(5);
        toyotaYaris.stop();
        System.out.println("####################");
        toyotaAvensis.start();
        toyotaAvensis.tankuj(5);
        toyotaAvensis.stop();
        System.out.println("####################");
    }
}