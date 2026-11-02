package JOBSHEET_8.Tugas;

public class SepedaMotor extends Kendaraan {
    public String jenisTransmisi;

    public SepedaMotor(String Merk, String warna, String jenisTransmisi) {
        super(Merk, warna);
        this.jenisTransmisi = jenisTransmisi;
    }

    @Override
    public void nyalakanMesin() {
        System.out.println("Status Mesin    : Menyala menggunakan Kick Starter (engkol) atau tombol di stang.");
    }

    @Override
    public void gunakanFasilitasKeamanan() {
        System.out.println("Keamanan        : Helm SNI terpasang sampai bunyi klik " + "untuk pengendara motor "
                + this.jenisTransmisi + ".");
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Transmisi       : " + this.jenisTransmisi);
    }
}
