package JOBSHEET_7.Tugas;

public class Orang {
    public String nik;
    public String nama;
    public String alamat;

    public Orang() {
        System.out.println("Data Orang baru dibuat...");
    }

    public Orang(String nik, String nama, String alamat) {
        this.nik = nik;
        this.nama = nama;
        this.alamat = alamat;
    }

    public void tampilkanInfo() {
        System.out.println("NIK    : " + nik);
        System.out.println("Nama   : " + nama);
        System.out.println("Alamat : " + alamat);
    }
}