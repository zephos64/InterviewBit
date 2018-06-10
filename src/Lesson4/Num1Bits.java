package Lesson4;

public class Num1Bits {
    public int numSetBits(long a) {
        int numOnes = 0;

        String binA = Long.toBinaryString(a);
        for(int cnt = 0; cnt < binA.length(); cnt++) {
            if(binA.charAt(cnt) == '1')
                numOnes++;
        }

        return numOnes;
    }
}
