package Lonberegning;

public class TimelonnetMedarbejder implements Betaling{

    private double antalTimer;
    private double timeLon;

    public TimelonnetMedarbejder(double antalTimer, double timeLon) {
        this.antalTimer = antalTimer;
        this.timeLon = timeLon;
    }

    @Override
    public double beregnLon() {
        return antalTimer * timeLon;
    }
}
