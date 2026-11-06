package JOBSHEET_9.Tugas;

public class MesinCuci implements Switchable {
    public int kapasitasAir;
    public String modeCuci;

    @Override
    public void switchOn() {
        System.out.println("Mesin cuci dinyalakan dengan mode: " + modeCuci);
    }

    @Override
    public void switchOff() {
        System.out.println("Mesin cuci dimatikan.");
    }

    public void setTimer() {
        System.out.println("Timer mesin cuci telah diatur. ");
    }

}
