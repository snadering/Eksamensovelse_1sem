package WordTrimmer;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();
        WordTrimmer wordTrimmer = new WordTrimmer();
        myList.add("Hello");
        myList.add("World");
        System.out.println(wordTrimmer.trimWord(myList, 5, 2));

    }
}
