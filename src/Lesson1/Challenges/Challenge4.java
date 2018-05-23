package Lesson1.Challenges;

import java.util.HashMap;
import java.util.Map;

public class Challenge4 {

    public static void main(String[] args) {
        HashMap<String, Integer> stringMap = stringToHashMap("To be or not to be, that is the question");
        for (Map.Entry<String, Integer> entry : stringMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key + ">" + value);
        }
    }

    public static HashMap<String, Integer> stringToHashMap(String sentence) {
        String[] splitSent = sentence.split(" ");
        HashMap<String, Integer> result = new HashMap<>();
        for (int a = 0; a < splitSent.length; a++) {
            String word = splitSent[a].replaceAll("[^a-zA-Z ]", "").toLowerCase();
            if (result.containsKey(word)) {
                int curCount = result.get(word);
                result.put(word, curCount + 1);
            } else {
                result.put(word, 1);
            }
        }
        return result;
    }
}