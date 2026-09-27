package JOBSHEET_4.Tugas;

public class Kasir {
    private String idKasir;
    private String nama;

    public Kasir(String idKasir, String nama) {
        this.idKasir = idKasir;
        this.nama = nama;
    }

    public String getInfo() {
        return "Kasir: " + this.idKasir + ", " + this.nama;
    }

}
