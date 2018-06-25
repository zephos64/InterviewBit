import java.util.ArrayList;

public class test {
    static ArrayList<Double> memo;
    public static void main(String[] args) {
        memo = new ArrayList<Double>();
        powerOfTwo(4);
        powerOfTwo(4);
    }

    private static double powerOfTwo(double n) {
        if(n == 2.0) {
            //Short circuit last case
            return 1.0;
        }
        // We likely already computed value needed, search for it
        if(memo.size() > 0 && memo.get(memo.size()-1) >= n) {
            double result = 0;
            while(memo.get((int)result) < n) {
                result++;
            }
            return result;
        }

        double result = memo.size();
        while(Math.pow(2,result) < n) {
            result++;
            memo.add(Math.pow(2,result));
        }
        return result;
    }
}
