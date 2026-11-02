package JOBSHEET_7.Tugas;

public class Dosen extends Orang {
    public String nidn;
    public String prodi;

    public Dosen() {
        super();
        System.out.println(nama);
    }

    public Dosen(String nik, String nama, String alamat, String nidn, String prodi) {

        super(nik, nama, alamat);
        this.nidn = nidn;
        this.prodi = prodi;
        this.nama = nama;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("--- DATA DOSEN ---");
        super.tampilkanInfo();
        System.out.println("NIDN   : " + nidn);
        System.out.println("Prodi  : " + prodi);
    }

    public void mengajar() {
        System.out.println(nama + " mengajar di " + prodi);
    }
}
