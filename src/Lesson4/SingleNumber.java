package Lesson4;

import java.util.List;

public class SingleNumber {
    public int singleNumber(final List<Integer> A) {
        int result = A.get(0);
        for(int cnt = 1; cnt < A.size(); cnt++) {
            result = result ^ A.get(cnt);
        }
        return result;
    }
}
