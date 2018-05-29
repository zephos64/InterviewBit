package Lesson2;

public class PalindromeString {
    //https://www.interviewbit.com/problems/palindrome-string/
    public int isPalindrome(String A) {
        if(A.matches(".*\\d+.*")) {
            return 0;
        }
        String simplifiedA = A.replaceAll("[^a-zA-Z]", "");
        for(int i = 0, j = simplifiedA.length()-1; i < j; i++, j--) {
            char iChar = simplifiedA.charAt(i);
            char jChar = simplifiedA.charAt(j);
            if(Character.toUpperCase(iChar) !=
                    Character.toUpperCase(jChar)) {
                return 0;
            }
        }
        return 1;
    }
}
