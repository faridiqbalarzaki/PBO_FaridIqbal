package JOBSHEET_9.Tugas;

public class Mobil implements Switchable {
    public String Merk;
    public int Kecepatan;

    @Override
    public void switchOn() {
        System.out.println("Mesin mobil " + Merk + " dinyalakan.");
    }

    @Override
    public void switchOff() {
        System.out.println("Mesin mobil " + Merk + " dimatikan.");
    }

    public void transmisi() {
        System.out.println("Gigi transmisi mobil diubah.");
    }

}
