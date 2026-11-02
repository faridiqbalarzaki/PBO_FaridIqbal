package JOBSHEET_8.Tugas;

public abstract class Kendaraan {
    public String Merk;
    public String warna;

    public Kendaraan(String Merk, String warna) {
        this.Merk = Merk;
        this.warna = warna;
    }

    public abstract void nyalakanMesin();

    public abstract void gunakanFasilitasKeamanan();

    public void cetakInfo() {
        System.out.println("Merk Kendaraan  : " + this.Merk);
        System.out.println("Warna           : " + this.warna);
    }
}
