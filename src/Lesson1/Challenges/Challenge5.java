package Lesson1.Challenges;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Challenge5 {
    public static void main(String[] args) {
        HashMap<Integer, HashSet<String>> stringMap = stringToHashMap("To be or not to be, that is the question");
        for (Map.Entry<Integer, HashSet<String>> entry : stringMap.entrySet()) {
            Integer key = entry.getKey();
            HashSet<String> value = entry.getValue();

            System.out.print(key + " > ");
            for(String word : value) {
                System.out.print(word + " ");
            }
            System.out.println();
        }
    }

    public static HashMap<Integer, HashSet<String>> stringToHashMap(String sentence) {
        String[] splitSent = sentence.split(" ");
        HashMap<Integer, HashSet<String>> result = new HashMap<>();
        HashMap<String, Integer> wordsToInt = new HashMap<String, Integer>();

        for (int a = 0; a < splitSent.length; a++) {
            String word = splitSent[a].replaceAll("[^a-zA-Z ]", "").toLowerCase();
            if (wordsToInt.containsKey(word)) {
                int curCount = wordsToInt.get(word);
                wordsToInt.put(word, curCount + 1);
            } else {
                wordsToInt.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : wordsToInt.entrySet()) {
            String word = entry.getKey();
            Integer count = entry.getValue();

            if (result.containsKey(count)) {
                HashSet<String> listWords = result.get(count);
                listWords.add(word);
                result.put(count, listWords);
            } else {
                HashSet<String> listWords = new HashSet<>();
                listWords.add(word);
                result.put(count, listWords);
            }
        }

        return result;
    }
}
