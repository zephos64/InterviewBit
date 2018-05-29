package Lesson2;

import java.util.ArrayList;

public class AddOneNumber {
    //https://www.interviewbit.com/problems/add-one-to-number/
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int carry = 1;

        // Create new array that is 1 digit longer than input
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < A.size()+1; i++) {
            result.add(0);
        }
        // Go through and add 1 to last digit
        for(int i = A.size()-1; i >= 0; i--) {
            if((carry + A.get(i)) >= 10) {
                // Goes over single digit, add carry
                result.set(i+1, 0);
                carry = 1;
            } else {
                result.set(i+1, A.get(i)+carry);
                carry = 0;
            }
        }
        if(carry == 1) {
            result.add(0, carry);
            carry = 0;
        }

        // Remove leading zeroes
        while(result.size() > 0 && result.get(0) == 0) {
            result.remove(0);
        }

        return result;
    }
}
