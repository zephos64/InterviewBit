package Lesson2;

public class ReverseString {
    // https://www.interviewbit.com/problems/reverse-the-string/
    public String reverseWords(String a) {
        String[] stringList = a.split(" ");
        String result = "";
        for(int i = stringList.length - 1; i >= 0; i--) {
            result += stringList[i];
            if(i != 0) {
                result += " ";
            }
        }
        return result;
    }
}
