package Lesson5;

import java.util.ArrayList;

public class SmallestSeq {
    public ArrayList<Integer> solve(int A, int B, int C, int D) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int[] initSet = new int[]{A, B, C};
        int[] finalIndexSet = new int[]{0,0,0};

        while(result.size() < D) {

            // M is smallest number in initSet
            int M = initSet[0];
            for(int i = 1; i < initSet.length;i++) {
                if(initSet[i] < M) {
                    M = initSet[i];
                }
            }

            // if result array does not contain M
            if(!result.contains(M)) {
                result.add(M);
            }
            if(M == initSet[0]) {
                initSet[0] = result.get(finalIndexSet[0]) * A;
                finalIndexSet[0]++;
            } else if(M == initSet[1]) {
                initSet[1] = result.get(finalIndexSet[1]) * B;
                finalIndexSet[1]++;
            } else {
                initSet[2] = result.get(finalIndexSet[2]) * C;
                finalIndexSet[2]++;
            }
        }
        return result;
    }
}
