package Lesson1.Challenges;

import java.util.HashSet;

public class Challenge6 {
    public static void main(String[] args) {
        String test = "abcb";
        System.out.println(test + "\t\tsize:3 fnctSize:" + lengthOfLongestSubstring(test));

        test = "abcabcbb";
        System.out.println(test + "\tsize:3 fnctSize:" + lengthOfLongestSubstring(test));

        test = "abcaxyz";
        System.out.println(test + "\t\tsize:6 fnctSize:" + lengthOfLongestSubstring(test));

        test = "abcaaaa";
        System.out.println(test + "\t\tsize:3 fnctSize:" + lengthOfLongestSubstring(test));

        test = "aaaaaaaa";
        System.out.println(test + "\tsize:1 fnctSize:" + lengthOfLongestSubstring(test));
    }

    public static int lengthOfLongestSubstring(String word) {
        int l = 0, r = 0;
        int maxLen = 0;
        HashSet<Character> charMap = new HashSet<Character>();
        while(r < word.length()) {
            Character a = word.charAt(r);
            if(charMap.contains(a)) {
                l++;
                charMap.remove(a);
            } else {
                r++;
                charMap.add(a);
                maxLen = Math.max(maxLen, r - l);
            }
        }

        return maxLen;
    }
}
