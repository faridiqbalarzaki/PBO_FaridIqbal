package JOBSHEET_8.Tugas;

public class Mobil extends Kendaraan {
    public int jumlahPintu;

    public Mobil(String Merk, String warna, int jumlahPintu) {
        super(Merk, warna);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void nyalakanMesin() {
        System.out.println("Status Mesin    : Menyala dengan cara menekan tombol Start/Stop Engine.");

    }

    @Override
    public void gunakanFasilitasKeamanan() {
        System.out.println("Keamanan        : Sabuk pengaman terpasang " + "pada " + this.jumlahPintu + " kursi.");
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jumlah Pintu    : " + this.jumlahPintu);
    }

}
