package JOBSHEET_8;

public class Ular extends Hewan {
    public boolean isBerbisa;

    public Ular(double berat, String makanan, String habitata) {
        super(berat, makanan, habitata);
        this.isBerbisa = isBerbisa;
    }

    @Override
    public void bergerak() {
        System.out.println("BERGERAK :");
        System.out.println("Mengerutkan otot dari segala sisi hingga membentuk lengkungan");
        System.out.println("Menemukan titik penahan seperti batu atau pohon");
        System.out.println("Menggunakan sisik untuk mendorong tubuh ke depan\n");

    }

    @Override
    public void bernapas() {
        System.out.println("\nBERNAPAS :");
        System.out.println("Otot tulang rusuk kontraksi,  udara masuk lewat hidung");
        System.out.println("Trakea mengirimkan udara ke paru-paru");
        System.out.println("Otot tulang rusuk relaksasi, udara dikeluarkan lewat hidung\n");
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Berbisa     :" + (this.isBerbisa ? "Ya" : "Tidak"));
    }
}
