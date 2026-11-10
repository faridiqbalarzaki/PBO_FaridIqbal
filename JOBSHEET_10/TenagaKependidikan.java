package JOBSHEET_10;

public class TenagaKependidikan extends Pegawai {
    public String katagori;

    public TenagaKependidikan() {

    }

    public TenagaKependidikan(String nip, String nama, String katagori) {
        super(nip, nama);
        this.katagori = katagori;

    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Katagori: " + this.katagori);
    }
}