package JOBSHEET_8;

public class Lebah extends Hewan {
    public String kasta;

    public Lebah(String kasta, double berat, String makanan, String habitata) {
        super(berat, makanan, habitata);
        this.kasta = kasta;
    }

    @Override
    public void bergerak() {
        System.out.println("\nBERGERAK :");
        System.out.println("Mengepakkan sayap ke depan");
        System.out.println("Memutar sayap hampir 90 derajat");
        System.out.println("mengepakan sayap ke belakang\n");
    }

    @Override
    public void bernapas() {
        System.out.println("BERNAPAS :");
        System.out.println("Otot perut mengendur, udara masuk melalui lubang di segmen tubuh");
        System.out.println("Trakea mengirimoksigen");
        System.out.println("Otot perut berkontraksi, udara dikeluarkan\n");
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Kasta: " + this.kasta);
    }

}
