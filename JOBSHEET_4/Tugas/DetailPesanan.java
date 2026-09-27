package JOBSHEET_4.Tugas;

public class DetailPesanan {
    private Produk produk;
    private int kuantitas;

    public DetailPesanan(Produk produk, int kuantitas) {
        this.produk = produk;
        this.kuantitas = kuantitas;
    }

    public int hitungSubTotal() {
        return this.produk.getHarga() * this.kuantitas;
    }

    public String getInfo() {
        return this.produk.getInfo() + " x " + this.kuantitas + " = Rp " + this.hitungSubTotal();
    }
}
