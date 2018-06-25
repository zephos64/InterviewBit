package Lesson6;

public class LongestIncSubSq {
    public int lis(final int[] A) {
        int[] memo = new int[A.length];

        int longestSubsq = 0;

        for(int end = 0; end < A.length; end++) {
            int subSq = 0;
            for(int start = end-1; start >= 0; start--) {
                if(memo[start] > (subSq-1))
                    subSq = memo[start]+1;
            }
            memo[end] = subSq;
            if(longestSubsq < subSq)
                longestSubsq = subSq;
        }

        //for(int a = 0; a < memo.length; a++) {
        //    System.out.println(a + " " + memo[a]);
        //}

        return longestSubsq;
    }
}
