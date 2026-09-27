package JOBSHEET_4.Tugas;

import java.time.LocalDate;

public class MainDemo {
    public static void main(String[] args) {
        Kasir kasir1 = new Kasir("KSR-001", "Budi Jatmiko");

        Produk produk1 = new Produk("PRD-01", "Dimsum Ayam", 11000);
        Produk produk2 = new Produk("PRD-02", "Dimsum Udang", 11000);
        Produk produk3 = new Produk("PRD-03", "Es Teh Manis", 4000);

        Pesanan pesanan1 = new Pesanan("XTR-9988", LocalDate.now(), kasir1);

        pesanan1.tambahProduk(produk1, 2);
        pesanan1.tambahProduk(produk2, 1);
        pesanan1.tambahProduk(produk3, 1);

        System.out.println(pesanan1.getInfo());

    }
}
