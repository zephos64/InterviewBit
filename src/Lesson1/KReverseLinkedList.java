package Lesson1;

import java.util.Stack;

public class KReverseLinkedList {
    //LinkedList - Pointer move

    private class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }

    public ListNode reverseList(ListNode A, int B) {
        Stack<ListNode> nodeStack = new Stack<ListNode>();
        ListNode pointer = A;
        ListNode revA = null, head = null;

        while(pointer != null) {
            for(int a = 0; a < B && pointer != null; a++) {
                nodeStack.push(pointer);
                pointer = pointer.next;
            }
            while(!nodeStack.isEmpty()) {
                ListNode tempNode = nodeStack.pop();
                if(head == null) {
                    head = tempNode;
                    revA = tempNode;
                } else {
                    revA.next = tempNode;
                    revA = revA.next;
                }
            }
            revA.next = null;
        }

        return head;
    }
}
