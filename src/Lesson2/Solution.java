public class Solution {
    public ArrayList<ArrayList<Integer>> prettyPrint(int A) {
        int matrixIndex = -1;
        for(int i = 0; i < A; i++) {
            matrixIndex +=2;
        }
        int xRight = matrixIndex-1, yBot = matrixIndex-1;
        int xLeft = 0, yTop = 0;
        int a[][] = new int[matrixIndex][matrixIndex];
        while (xLeft < xRight && yTop < yBot) {
            // top wall
            for(int i = xLeft; i <= xRight; i++) {
                a[yTop][i] = A;
            }
            yTop++;

            // right wall
            for(int i = yTop; i <= yBot; i++) {
                a[i][xRight] = A;
            }
            xRight--;

            // bottom wall
            for(int i = xRight; i >= xLeft; i--) {
                a[yBot][i] = A;
            }
            yBot--;

            // left wall
            for(int i = yBot; i >= yTop; i--) {
                a[i][xLeft] = A;
            }
            xLeft++;

            A--;
        }
        a[xRight][yBot] = A;

        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for(int y = 0; y < matrixIndex; y++) {
            ArrayList<Integer> row = new ArrayList<Integer>();
            for(int x = 0; x < matrixIndex; x++) {
                row.add(a[y][x]);
            }
            result.add(row);
        }
        return result;
    }
}
