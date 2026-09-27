package JOBSHEET_4.Tugas;

import java.util.ArrayList;
import java.time.LocalDate;

public class Pesanan {
    private String noPesanan;
    private LocalDate tanggal;
    private Kasir kasir;
    private ArrayList<DetailPesanan> daftarDetail;

    public Pesanan(String noPesanan, LocalDate tanggal, Kasir kasir) {
        this.noPesanan = noPesanan;
        this.tanggal = tanggal;
        this.kasir = kasir;
        this.daftarDetail = new ArrayList<>();
    }

    public void tambahProduk(Produk produk, int kuantitas) {
        DetailPesanan detail = new DetailPesanan(produk, kuantitas);
        this.daftarDetail.add(detail);
    }

    public int hitungTotal() {
        int total = 0;
        for (DetailPesanan detail : this.daftarDetail) {
            total += detail.hitungSubTotal();
        }
        return total;
    }

    public String getInfo() {
        String info = "No Pesanan : " + this.noPesanan + "\n";

        info += "Tanggal : " + this.tanggal + "\n";

        info += this.kasir.getInfo() + "\n";
        info += "=============================================\n";
        info += "Daftar Pembelian:\n";

        for (DetailPesanan detail : this.daftarDetail) {
            info += detail.getInfo() + "\n";
        }

        info += "=============================================\n";
        info += "Total      : Rp" + hitungTotal() + "\n";
        return info;

    }
}
