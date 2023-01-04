package MenuValg;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MinBrugerDialog {
    private static Scanner scanner = new Scanner(System.in);
    public MinBrugerDialog() {
    }


    public int menuvalg(ArrayList<String> arrayList){
        int input = 0;
        for (int i = 0; i < arrayList.size(); i++){
        System.out.println(i+1 + ". " + arrayList.get(i));
        }
        do {
            input = getInput("Indtast dit valg: ");

            /*
            try {
                input = getInput("Indtast dit valg: ");
            } catch (InputMismatchException e){
                input = getInput("Please enter a number: ");
            }

             */

        } while (input < 1 || input > arrayList.size());


        return input;

    }

    public static int getInput(String str){
        System.out.println(str);
        return scanner.nextInt();
    }

}
