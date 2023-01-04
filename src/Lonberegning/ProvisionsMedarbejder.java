package Lonberegning;

public class ProvisionsMedarbejder implements Betaling{

    private double grundlon;
    private double salg;
    private double provision;

    public ProvisionsMedarbejder(double grundlon, double salg, double provision) {
        this.grundlon = grundlon;
        this.salg = salg;
        this.provision = provision;
    }

    @Override
    public double beregnLon() {
       return grundlon + (salg * (provision / 100));
    }
}
