package JOBSHEET_9;

public class Tv extends AlatElektronik implements Audible {
    public String jenisLayar;
    public int volume;

    @Override
    public void naikanVolume() {
        volume = volume + 1;
    }

    @Override
    public void turunkanVolume() {
        volume = volume - 1;
    }

    public void getInfo() {
        System.out.println("TV Merk: " + merk + ", Layar: " + jenisLayar + ", Volume: " + volume);
    }
}
