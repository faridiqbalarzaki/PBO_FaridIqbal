package JOBSHEET_4.Tugas;

public class Produk {
    private String kodeProduk;
    private String namaProduk;
    private int harga;

    public Produk(String kodeProduk, String namaProduk, int harga) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    public int getHarga() {
        return this.harga;
    }

    public String getInfo() {
        return this.namaProduk + " (" + this.kodeProduk + ") Rp. " + this.harga;
    }
}
