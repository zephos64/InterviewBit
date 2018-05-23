import java.util.ArrayList;

public class numrange {
    public int numRange(ArrayList<Integer> A, int B, int C) {
        int result = 0;
        int prevSum = 0;
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) <= C) {
                prevSum = A.get(i);
                if(prevSum >= B) result++;

                for(int j = i+1; j < A.size() && prevSum <= C; j++) {
                    prevSum += A.get(j);
                    if(prevSum >= B && prevSum <= C) result++;
                }
                prevSum = 0;
            }
        }

        return result;
    }
}