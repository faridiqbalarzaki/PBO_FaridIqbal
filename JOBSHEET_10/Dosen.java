package JOBSHEET_10;

public class Dosen extends Pegawai {
    public String nidn;

    public Dosen() {

    }

    public Dosen(String nip, String nama, String nidn) {
        super(nip, nama);
        this.nidn = nidn;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Nidn: " + this.nidn);
    }

    public void mengajar() {
        System.out.println("Membuat rencana pembelajaran");
        System.out.println("Menyusun materi");
        System.out.println("Melakukan PBM");
        System.out.println("Melakukan evaluasi");
    }
}
