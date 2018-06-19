package Lesson5;

import java.util.ArrayList;
import java.util.List;

public class SumOfFibonacci {
    public int fibsum(int A) {
        List<Integer> fib = new ArrayList<Integer>();
        fib.add(1);
        fib.add(1);
        while (fib.get(fib.size() - 1) < A) {
            fib.add(fib.get(fib.size() - 1)
                    + fib.get(fib.size() - 2));
        }

        int result = 0;
        int index = fib.size() - 1;
        while(A > 0) {
            if (A >= fib.get(index)) {
                result += A / fib.get(index);
                A %= fib.get(index);
            }
            index--;
        }

        return result;
    }
}
