package Lesson1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
    // HashMap - HashSearch
    public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        HashMap<Integer, Integer> sumMap = new HashMap<Integer, Integer>();

        for(int i = 0; i < A.size(); i++) {
            if(sumMap.containsKey(A.get(i))) {
                ArrayList<Integer> temp = createOrderArray(i, sumMap.get(A.get(i)));
                if(result.isEmpty() ||
                        (temp.get(1) < result.get(1)) ||
                        (temp.get(1) == result.get(1) && temp.get(0) < result.get(0))) {
                    result = temp;
                }
            } else {
                if(!sumMap.containsKey(B-A.get(i))) {
                    sumMap.put(B - A.get(i), i);
                }
            }
        }

        return result;
    }

    private ArrayList<Integer> createOrderArray(int num1, int num2) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(num1 < num2) {
            result.add(num1+1);
            result.add(num2+1);
        } else {
            result.add(num2+1);
            result.add(num1+1);
        }
        return result;
    }
}
