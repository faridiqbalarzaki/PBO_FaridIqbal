package JOBSHEET_8.Tugas;

public class TugasAbstractDemo {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Hitam", 4);
        System.out.println("-- Data Mobil 1 --");
        mobil1.cetakInfo();
        mobil1.nyalakanMesin();
        mobil1.gunakanFasilitasKeamanan();

        SepedaMotor sepedaMotor1 = new SepedaMotor("Honda", "Hitam", "Manual");
        System.out.println("\n-- Data Sepeda Motor 1 --");
        sepedaMotor1.cetakInfo();
        sepedaMotor1.nyalakanMesin();
        sepedaMotor1.gunakanFasilitasKeamanan();
    }
}
