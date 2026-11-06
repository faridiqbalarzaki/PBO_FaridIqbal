package JOBSHEET_9;

public class SmartFridge extends Kulkas implements Audible {
    public int volume;
    public String ukuranLayar;

    @Override
    public void naikanVolume() {
        volume = volume + 1;
    }

    @Override
    public void turunkanVolume() {
        volume = volume - 1;
    }
}
