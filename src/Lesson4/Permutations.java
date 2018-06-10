package Lesson4;

import java.util.ArrayList;

public class Permutations {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        return premuteWithPrefix(new ArrayList<Integer>(), A);
    }

    private ArrayList<ArrayList<Integer>> premuteWithPrefix(ArrayList<Integer> prefix,
                                                            ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        if(A == null || A.size() == 0) {
            result.add(prefix);
            return result;
        }

        for(int prefixCnt = 0; prefixCnt < A.size(); prefixCnt++) {
            ArrayList<Integer> newNum = new ArrayList<Integer>();
            newNum.addAll(prefix);
            newNum.add(A.get(prefixCnt));

            ArrayList<Integer> newA = new ArrayList<Integer>();
            newA.addAll(A);
            newA.remove(A.get(prefixCnt));

            result.addAll(premuteWithPrefix(newNum, newA));
        }

        return result;
    }
}
