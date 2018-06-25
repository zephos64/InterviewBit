package Lesson6;

public class JumpGameArray {
    public int canJump(int[] A) {
        for(int loc = 0, stepsToGo = A[loc];
            loc < A.length; loc++) {
            if(loc == A.length-1)
                return 1;
            else if(stepsToGo == 0 && A[loc] == 0)
                return 0;

            if(A[loc] > stepsToGo)
                stepsToGo = A[loc];
        }
        return 1;
    }
}
