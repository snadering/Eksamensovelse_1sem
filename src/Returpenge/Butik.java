package Returpenge;

public class Butik {


    public int koeb(int pris, int betalt){
        int byttepenge = 0;
        if (pris < 0 || betalt < 0) throw new RuntimeException("Hverken prisen eller det betalte beløb kan være mindre end 0");
        if (betalt < pris) throw new RuntimeException("Det betalte beløb er ikke nok til at dække prisen.");
        byttepenge = betalt - pris;

        return byttepenge;
    }
}
