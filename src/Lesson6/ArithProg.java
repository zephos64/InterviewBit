package Lesson6;

public class ArithProg {
    public int solve(final int[] A) {
        if(A.length <= 2)
            return A.length;

        int diff = 0, longestSubSq = 0,
                maxSubSqLength = 0, prevIndex = 0;
        for(int i = 0; i < A.length; i++) {
            diff = 0;
            longestSubSq = 1;
            for(int j = i+1; j < A.length; j++) {
                diff = A[j] - A[i];
                prevIndex = j;
                longestSubSq = 2;
                longestSubSq = longestSubSq + solveSub(A, diff, prevIndex, j+1);
                if(maxSubSqLength < longestSubSq)
                    maxSubSqLength = longestSubSq;
            }
        }

        return maxSubSqLength;
    }

    private int solveSub(final int[] A, int diff, int prevIndex, int curIndex) {
        if(curIndex > A.length - 1)
            return 0;
        if(diff == A[curIndex] - A[prevIndex]) {
            return 1+solveSub(A, diff, curIndex, curIndex+1);
        }
        return solveSub(A, diff, prevIndex, curIndex+1);
    }
}
