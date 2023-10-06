package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {

    public static boolean scrabble(String letters, String word) {

        if(letters.trim().isEmpty() || word.trim().isEmpty()) return false;

        List<String> lettersList = new ArrayList<>(Arrays.asList(letters.toLowerCase().split("")));
        List<String> wordList = new ArrayList<>(Arrays.asList(word.toLowerCase().split("")));

        for(String element : wordList) {

            if(lettersList.contains(element)) {
                lettersList.remove(element);
            }
            else return false;
        }
        return true;
    }
}
//END
