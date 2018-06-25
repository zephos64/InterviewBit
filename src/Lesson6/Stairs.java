package Lesson6;

public class Stairs {
    int[] memo;
    public int climbStairs(int A) {
        memo = new int[A+1];

        return fibo(A);
    }

    private int fibo(int n) {
        if (n <= 1) return n;
        // If we have processed this function before, return the result from the last time.
        if (memo[n] != 0) return memo[n];
        // Otherwise calculate the result and remember it.
        memo[n] = fibo(n - 1) + fibo(n - 2);
        return memo[n];
    }
}
