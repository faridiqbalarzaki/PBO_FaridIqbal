package JOBSHEET_9.Tugas;

public class SwitchableMain {
    public static void main(String[] args) {

        Mobil mobilSaya = new Mobil();
        mobilSaya.Merk = "Toyota";
        mobilSaya.Kecepatan = 0;

        mobilSaya.switchOn();
        mobilSaya.transmisi();
        mobilSaya.switchOff();

        System.out.println("-------------------");

        MesinCuci mesinCuciSaya = new MesinCuci();
        mesinCuciSaya.kapasitasAir = 10;
        mesinCuciSaya.modeCuci = "Quick Wash";

        mesinCuciSaya.switchOn();
        mesinCuciSaya.setTimer();
        mesinCuciSaya.switchOff();
    }
}
