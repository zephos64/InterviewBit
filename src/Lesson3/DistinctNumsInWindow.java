package Lesson3;

import java.util.ArrayList;
import java.util.HashMap;

public class DistinctNumsInWindow {
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        ArrayList<Integer> distinctCounts = new ArrayList<Integer>();
        HashMap<Integer, Integer> uniqueNums = new HashMap<Integer, Integer>();

        // Put initial numbers into hashset (1 less than size)
        for(int endPos = 0; endPos < B-1 && endPos < A.size(); endPos++) {
            int newKey = A.get(endPos);
            if(uniqueNums.containsKey(newKey)) {
                int count = uniqueNums.get(newKey)+1;
                uniqueNums.put(newKey, count);
            } else {
                uniqueNums.put(newKey, 1);
            }
        }

        for(int endPos = B-1, startPos=0; endPos < A.size();
            endPos++, startPos++) {
//System.out.println(endPos + " : " + A.get(endPos) + ", " +A.size());

            // Add number to unique array
            int endKey = A.get(endPos);
            if(uniqueNums.containsKey(endKey)) {
                int count = uniqueNums.get(endKey)+1;
                uniqueNums.put(endKey, count);
            } else {
                uniqueNums.put(endKey, 1);
            }

            // Find distinct count in array
            int amountUniques = 0;
//System.out.print("Dis keys: ");
            for(Integer key : uniqueNums.keySet()) {
//System.out.print(key + " ");
                amountUniques++;
            }
//System.out.println();

            // put into result, remove oldest
            distinctCounts.add(amountUniques);
            int startKey = A.get(startPos);
//System.out.println("~" +startPos + " : " + startKey + " cnt: " + uniqueNums.get(startKey));
//System.out.println("~~" +endPos + " : " +  endKey);

            if(uniqueNums.get(startKey) == 1) {
//System.out.println("~removed " + startKey);
                uniqueNums.remove(startKey);
            } else {
                int count = uniqueNums.get(startKey)-1;
                uniqueNums.put(startKey, count);
            }
        }

        return distinctCounts;
    }
}
