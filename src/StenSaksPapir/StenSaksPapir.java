package StenSaksPapir;

import java.util.Random;
import java.util.Scanner;

public class StenSaksPapir {

    int brugerPoint = 0;
    int computerPoint = 0;

    void spil(){

        while(true) {
            System.out.println("------------------------");
            String npc = computerValg();
            String bruger = brugerValg();
            if (bruger.equalsIgnoreCase("slut")){
                System.out.println("##############################################");
                System.out.println("Du fik " + brugerPoint + " point.");
                System.out.println("Computeren fik " + computerPoint + " point.");
                System.out.println("##############################################");
                break;
            }
            switch (bruger) {

                case "sten": {
                    if (npc.equalsIgnoreCase("sten")) {
                        System.out.println("UAFGJORT!");
                        System.out.println("I valgte begge 'Sten'.");
                    }
                    if (npc.equalsIgnoreCase("saks")) {
                        System.out.println("DU HAR VUNDET!");
                        System.out.println("Computeren valgte 'Saks'.");
                        brugerPoint++;
                    }
                    if (npc.equalsIgnoreCase("papir")) {
                        System.out.println("DU HAR TABT!");
                        System.out.println("Computeren valgte 'Papir'.");
                        computerPoint++;
                    }
                    break;
                }
                case "saks": {
                    if (npc.equalsIgnoreCase("sten")) {
                        System.out.println("DU HAR TABT!");
                        System.out.println("Computeren valgte 'Sten'.");
                        computerPoint++;
                    }
                    if (npc.equalsIgnoreCase("saks")) {
                        System.out.println("UAFGJORT!");
                        System.out.println("I valgte begge 'Saks'.");
                    }
                    if (npc.equalsIgnoreCase("papir")) {
                        System.out.println("DU HAR VUNDET!");
                        System.out.println("Computeren valgte 'Papir'.");
                        brugerPoint++;
                    }
                    break;
                }
                case "papir": {
                    if (npc.equalsIgnoreCase("sten")) {
                        System.out.println("DU HAR VUNDET!");
                        System.out.println("Computeren valgte 'Sten'.");
                        brugerPoint++;
                    }
                    if (npc.equalsIgnoreCase("saks")) {
                        System.out.println("DU HAR TABT!");
                        System.out.println("Computeren valgte 'Saks'.");
                        computerPoint++;
                    }
                    if (npc.equalsIgnoreCase("papir")) {
                        System.out.println("UAFGJORT!");
                        System.out.println("I valgte begge 'Papir'.");
                    }
                    break;
                }
            }
        }

    }

    String brugerValg(){
        Scanner scn = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Skriv SLUT for at afslutte.");
            System.out.println("Vaelg 'Sten', 'Saks' eller 'Papir'.");
            choice = scn.nextLine().toLowerCase();
        }while(!choice.equalsIgnoreCase("sten") && !choice.equalsIgnoreCase("saks") && !choice.equalsIgnoreCase("papir") && !choice.equalsIgnoreCase("slut"));
        return choice;
    }

    String computerValg(){
        Random rnd = new Random();
        String choice = "";
        int num = rnd.nextInt(3);
        if (num == 0) choice = "sten";
        else if (num == 1) choice = "saks";
        else choice = "papir";
        return choice;
    }

}
