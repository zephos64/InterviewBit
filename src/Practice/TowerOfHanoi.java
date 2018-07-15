package Practice;

public class TowerOfHanoi {
    public static void main(String[] args) {
        System.out.println("Starting Tower of Hanoi");
        Result res = new Result();
        towerOfHanoiSimple(3, res, 'a', 'b', 'c');
        System.out.println(res.result);
    }

    private static class Result {
        int result;
        public Result() {
            result = 0;
        }
    }

    private static void towerOfHanoiSimple(int height, Result res, char fromPeg,
                                           char auxPeg, char toPeg) {
        if(height == 0)
            return;

        towerOfHanoiSimple(height-1, res,
                fromPeg, toPeg, auxPeg);
        System.out.println("Disk " + height + " " + fromPeg
          + " > " + toPeg);
        towerOfHanoiSimple(height-1, res,
                auxPeg, fromPeg, toPeg);
        res.result = res.result+1;
    }
}
