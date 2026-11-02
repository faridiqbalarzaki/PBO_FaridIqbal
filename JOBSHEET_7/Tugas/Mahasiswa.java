package JOBSHEET_7.Tugas;

public class Mahasiswa extends Orang {
    public String nim;
    public float ipk;

    public Mahasiswa() {
        super();
    }

    public Mahasiswa(String nik, String nama, String alamat, String nim, float ipk) {

        super(nik, nama, alamat);
        this.nim = nim;
        this.ipk = ipk;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("--- DATA MAHASISWA ---");
        super.tampilkanInfo();
        System.out.println("NIM    : " + nim);
        System.out.println("IPK    : " + ipk);
    }

    public void belajar() {
        System.out.println(nama + " lagi ngoding buat pertahanin IPK " + ipk);
    }
}
