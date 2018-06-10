package Lesson4;

import java.util.ArrayList;
import java.util.Collections;

public class Subset {
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> result  = new ArrayList<ArrayList<Integer>>();
        result.add(new ArrayList<Integer>());
        result.addAll(subsetsWithPrev(new ArrayList<Integer>(), A));

        return result;
    }

    private ArrayList<ArrayList<Integer>> subsetsWithPrev(ArrayList<Integer> prev,
                                                          ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        if(A == null || A.size() == 0) {
            return result;
        }
        Collections.sort(A);

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.addAll(prev);
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.addAll(prev);
        list2.add(A.get(0));

        // list2 also contains list1
        result.add(list2);

        result.addAll(subsetsWithPrev(list2,
                new ArrayList<Integer>(A.subList(1, A.size()))));
        result.addAll(subsetsWithPrev(list1,
                new ArrayList<Integer>(A.subList(1, A.size()))));

        return result;
    }
}
