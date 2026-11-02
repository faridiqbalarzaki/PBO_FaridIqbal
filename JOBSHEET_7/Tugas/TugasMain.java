package JOBSHEET_7.Tugas;

public class TugasMain {
    public static void main(String[] args) {

        Dosen pakDosen = new Dosen("35710001", "Pak Budi", "Malang", "04112233", "Sistem Informasi Bisnis");
        pakDosen.tampilkanInfo();
        pakDosen.mengajar();

        System.out.println();

        Mahasiswa mhsPolinema = new Mahasiswa("35710002", "Farid Iqbal Arzaki", "Malang", "254107060163", 3.85f);
        mhsPolinema.tampilkanInfo();
        mhsPolinema.belajar();
    }
}
