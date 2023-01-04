package SorterOrdIEnFil;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Opgave6 {

    public static void main(String[] args) {
        ArrayList<String> words = læsFil("src/SorterOrdIEnFil/FilMedRandomOrd.csv");

        for (String s : words){
            System.out.println(s);
        }

        sorterFil(words);

        System.out.println("##################################");

        for (String s : words){
            System.out.println(s);
        }
    }


    public static ArrayList<String> læsFil(String path){
        ArrayList<String> myList = new ArrayList<>();
        File file = new File(path);
        Scanner scanner;

        try {
            scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                myList.add(scanner.next());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return myList;
    }

    public static ArrayList<String> sorterFil(ArrayList<String> arrayList){
        Collections.sort(arrayList, Comparator.comparingInt(String::length));


        for (int i = 0; i < arrayList.size()-1; i++){
            if (arrayList.get(i).equalsIgnoreCase(arrayList.get(i+1))){
               arrayList.remove(i);
               i -= 1;
            }
        }
        return arrayList;
    }


}
