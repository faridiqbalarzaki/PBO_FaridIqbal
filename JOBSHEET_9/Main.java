package JOBSHEET_9;

public class Main {
    public static void main(String[] args) {
        Kulkas kulkasSaya = new Kulkas();
        kulkasSaya.merk = "LG";
        kulkasSaya.jumlahPintu = 2;
        kulkasSaya.getInfo();

        Tv tvSaya = new Tv();
        tvSaya.merk = "Samsung";
        tvSaya.jenisLayar = "OLED";
        tvSaya.volume = 10;
        tvSaya.getInfo();
    }
}
