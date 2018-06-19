package Lesson5;

public class ConvertSortedList {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public TreeNode sortedListToBST(ListNode a) {
        if (a == null)
            return null;

        ListNode slowRunner = a, fastRunner = a;
        while (fastRunner != null && fastRunner.next != null) {
            slowRunner = slowRunner.next;
            fastRunner = fastRunner.next.next;
        }

        TreeNode result = new TreeNode(slowRunner.val);
        if (slowRunner != fastRunner) {
            result.right = sortedListToBST(slowRunner.next);
            ListNode run = a;
            while (run.next != slowRunner)
                run = run.next;
            run.next = null;
            result.left = sortedListToBST(a);
        }

        return result;
    }
}
