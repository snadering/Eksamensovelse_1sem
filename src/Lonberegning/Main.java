package Lonberegning;

public class Main {
    public static void main(String[] args) {
        ProvisionsMedarbejder medarbejderP = new ProvisionsMedarbejder(20000, 10000, 25);
        System.out.println(medarbejderP.beregnLon());
    }
}
