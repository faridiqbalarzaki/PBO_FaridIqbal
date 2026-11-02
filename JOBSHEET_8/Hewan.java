package JOBSHEET_8;

public abstract class Hewan {
    public double berat;
    public String makanan;
    public String habitata;

    public Hewan(double berat, String makanan, String habitata) {
        this.berat = berat;
        this.makanan = makanan;
        this.habitata = habitata;
    }

    public abstract void bergerak();

    public abstract void bernapas();

    public void cetakInfo() {
        System.out.println("Berat: " + this.berat);
        System.out.println("Makanan: " + this.makanan);
        System.out.println("Habitat: " + this.habitata);
    }
}
