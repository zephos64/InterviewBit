package Lesson2.Challenges;

public class Challenge1 {
    public static void main (String[] args) {
        System.out.println("3 : " + removeDups(
                new int[]{1, 2, 3}));
        System.out.println("6 : " + removeDups(
                new int[]{2,3,5,5,7,11,11,11,11,13}));
        System.out.println("1 : " + removeDups(
                new int[]{1, 1, 1}));
        System.out.println("2 : " + removeDups(
                new int[]{5, 5, 7}));
    }

    public static int removeDups(int[] array) {

        if(array == null || array.length  ==0 )
            return 0;

        if(array.length ==1)
            return 1;
        int i=0,j=1;
        while(j<array.length){
            if(array[i]==array[j]){
                j++;
            } else {
                i++;
                array[i] = array[j];
                j++;
            }
        }
        return i+1;
    }
}
