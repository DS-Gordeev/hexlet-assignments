package exercise;

import java.util.*;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {

        Map<String, Integer> wordsCount = new HashMap<>();

        if(sentence.isEmpty()) return wordsCount;

        String[] wordsArray = sentence.split(" ");
        List<String> listArray = new ArrayList<>(Arrays.asList(wordsArray));

        for(String word : listArray) {
            if(!wordsCount.containsKey(word)) {
                wordsCount.put(word, 1);
            }
            else wordsCount.put(word, wordsCount.get(word) + 1);
        }
        return wordsCount;
    }

    public static String toString(Map<String, Integer> wordsCount) {
        StringBuilder resultString = new StringBuilder();

        if(wordsCount.isEmpty()) return "{}";

        resultString.append("{\n");
        for(Map.Entry<String, Integer> word : wordsCount.entrySet()) {
            resultString.append("  ").append(word.getKey()).append(": ").append(word.getValue()).append("\n");
        }
        resultString.append("}");

        return resultString.toString();
    }
}
//END
