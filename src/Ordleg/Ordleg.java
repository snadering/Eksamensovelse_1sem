package Ordleg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ordleg {

    public Ordleg() {
    }

    public ArrayList<String> gentagOrd(ArrayList<String> arrayList, int k){

        if(k <= 0) throw new RuntimeException("'k' has to be a positive number.");
        if (arrayList.size() == 0) throw new RuntimeException("Arraylist is empty.");

        ArrayList<String> result = new ArrayList<>();
        for(String s : arrayList){
            for (int i = 0; i < k; i++) {
                result.add(s);
            }
        }
        return result;
    }


    //sorterer alfabetisk ikke efter længe..
   public ArrayList<String> sorteretOgTrimmet(ArrayList<String> arrayList){
        if(arrayList == null) throw new RuntimeException("Array is empty");

       Collections.sort(arrayList);

       return arrayList;



   }


}

