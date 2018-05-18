package Lesson1;

public class RemoveDups {
    //LinkedList - List 2 Pointer bucket

    private class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
    }

    public ListNode deleteDuplicates(ListNode A) {
        ListNode pointer = A;

        while(pointer != null) {
            //remove duplicates found
            ListNode runner = pointer.next;
            while(runner != null && runner.val == pointer.val) {
                runner = runner.next;
            }

            pointer.next = runner;
            pointer = pointer.next;
        }

        return A;
    }
}