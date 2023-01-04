package MenuValg;

import java.util.ArrayList;

public class Opgave2 {

    public static void main(String[] args) {
        MinBrugerDialog minBrugerDialog = new MinBrugerDialog();
        ArrayList<String> menu = new ArrayList<>();
        menu.add("Agurk");
        menu.add("Tomat");
        menu.add("Salat");

        System.out.println(minBrugerDialog.menuvalg(menu));

    }



}
