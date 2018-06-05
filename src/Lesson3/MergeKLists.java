package Lesson3;

import java.util.ArrayList;

public class MergeKLists {
    class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
  }

    public ListNode mergeKLists(ArrayList<ListNode> a) {
        ListNode resultHead, result, smallestNode = null;
        int smallestVal, smallestNodePos = 0;

        // Find smallest starter
        smallestVal = Integer.MAX_VALUE;
        for(int findSmallestNum = 0; findSmallestNum < a.size(); findSmallestNum++) {
            if(a.get(findSmallestNum).val <= smallestVal) {
                smallestNodePos = findSmallestNum;
                smallestNode = a.get(smallestNodePos);
                smallestVal = smallestNode.val;
            }
        }

        // Set the head
        resultHead = smallestNode;
        result = smallestNode;
        smallestVal = result.val;
        a.set(smallestNodePos, a.get(smallestNodePos).next);

        // Iterate through all lists
        boolean canIter = true;
        while(canIter) {
            canIter = false;
            smallestNode = null;
            //Find next smallest
            smallestVal = Integer.MAX_VALUE;
            for(int findSmallestNum = 0; findSmallestNum < a.size(); findSmallestNum++) {
                if(a.get(findSmallestNum) != null
                        && a.get(findSmallestNum).val <= smallestVal) {
                    smallestNodePos = findSmallestNum;
                    smallestNode = a.get(smallestNodePos);
                    smallestVal = smallestNode.val;
                    canIter = true;
                }
            }

            result.next = smallestNode;
            result = result.next;
            smallestVal = result.val;
            if(a.get(smallestNodePos) != null)
                a.set(smallestNodePos, a.get(smallestNodePos).next);
        }

        return resultHead;
    }
}
