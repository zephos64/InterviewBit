package Lesson1;

import java.util.HashSet;

public class LongestSubString {
    //Hashing - Hashing two pointer
    public int lengthOfLongestSubstring(String A) {
        int longestCount = 0, slowRunner = 0;
        HashSet<Character> mapChars = new HashSet<Character>();
        char[] aArray = A.toCharArray();

        for(int i = 0; i < aArray.length; i++) {
            char aChar = aArray[i];
            if(mapChars.contains(aChar)) {
                while(slowRunner < i) {
                    if(aArray[slowRunner] == aChar) {
                        slowRunner++;
                        break;
                    } else {
                        mapChars.remove(aArray[slowRunner]);
                        slowRunner++;
                    }
                }
            } else {
                mapChars.add(aChar);
                longestCount = Math.max(longestCount, mapChars.size());
            }
        }

        return longestCount;
    }
}
