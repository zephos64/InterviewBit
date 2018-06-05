package Lesson2.Challenges;

import java.util.ArrayList;

public class Challenge2 {
    public static ArrayList<Integer> allPrimes(int number) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 2; i <= number; i++) {
            if(isPrime(i)) {
                list.add(i);
            }
        }

        return list;
    }

    public static boolean isPrime(int number) {
        for(int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
