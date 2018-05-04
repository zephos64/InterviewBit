public class permutations {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        permute(A, result, 0);
        return result;
    }

    public void permute(ArrayList<Integer> A,
                        ArrayList<ArrayList<Integer>> result, int begin) {
        if(begin >= A.size()-1) {
            if(!result.contains(A)) {
                result.add(A);
            }
        } else {
            for(int i = begin; i < A.size(); i++) {
                ArrayList<Integer> row = swap(A, begin, i);
                permute(row, result, begin+1);
            }
        }
    }

    private ArrayList<Integer> swap(ArrayList<Integer> A, int first, int second) {
        ArrayList<Integer> temp = (ArrayList<Integer>)A.clone();
        int tempNum = temp.get(first);
        temp.set(first, temp.get(second));
        temp.set(second, tempNum);
        return temp;
    }
}