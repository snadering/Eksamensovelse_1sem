package Ordleg;

import java.util.ArrayList;

public class Opgave1 {
    public static void main(String[] args) {
        Ordleg ordleg = new Ordleg();

        ArrayList<String> myList = new ArrayList<>();
        myList.add("dddd");
        myList.add("aab");
        myList.add("eeeee");
        myList.add("ccc");
        myList.add("bb");
        myList.add("ffffff");

        System.out.println(ordleg.gentagOrd(myList, 2));

        ArrayList<String> sortedList = new ArrayList<>();
        sortedList = ordleg.sorteretOgTrimmet(myList);

        for (String s : sortedList){
            System.out.println(s);
        }

    }
}
