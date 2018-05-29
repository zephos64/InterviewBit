package Lesson2;

import java.util.ArrayList;

public class MaxNonnegSubArray {
    //https://www.interviewbit.com/problems/max-non-negative-subarray/
        public ArrayList<Integer> maxset(ArrayList<Integer> A) {
            ArrayList<Integer> result = new ArrayList<Integer>();
            ArrayList<Integer> temp = new ArrayList<Integer>();
            long sumResult = 0, sumTemp = 0;

            for(int i = 0; i < A.size(); i++) {
                if(A.get(i) >= 0) {
                    temp.add(A.get(i));
                    sumTemp += A.get(i);
                } else {
                    if(sumTemp > sumResult) {
                        result = temp;
                        sumResult = sumTemp;
                    } else if(sumTemp == sumResult) {
                        if(temp.size() > result.size()) {
                            result = temp;
                            sumResult = sumTemp;
                        }
                    }
                    temp = new ArrayList<Integer>();
                    sumTemp = 0;
                }
            }
            if(sumTemp > sumResult) {
                result = temp;
                sumResult = sumTemp;
            } else if(sumTemp == sumResult) {
                if(temp.size() > result.size()) {
                    result = temp;
                    sumResult = sumTemp;
                }
            }
            temp = new ArrayList<Integer>();
            sumTemp = 0;

            return result;
        }
}
