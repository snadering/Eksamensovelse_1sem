package WordTrimmer;

import java.util.ArrayList;

public class WordTrimmer {

    public ArrayList<String> trimWord(ArrayList<String> arrayList, int k, int m){
        if(k <= 0) throw new RuntimeException("'k' has to be a positive number.");
        if (arrayList.size() == 0) throw new RuntimeException("Arraylist is empty.");

        ArrayList<String> result = new ArrayList<>();
        for (String s : arrayList) {
            for (int i = 0; i < k; i++) {
                result.add(s.substring(0,m));
            }
        }

        return result;
    }

}
