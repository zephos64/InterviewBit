package Lesson3;

import java.util.Stack;

public class KthSmallest {
    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) {
       val = x;
       left=null;
       right=null;
      }
  }
    public int kthsmallest(TreeNode A, int B) {
        int resultVal = 0, smallestCnt = 0;
        Stack<TreeNode> treeStack = new Stack<TreeNode>();
        TreeNode treeIter = A;

        while(treeIter != null) {
            treeStack.push(treeIter);
            treeIter = treeIter.left;
        }

        while(smallestCnt != B) {
            TreeNode node = treeStack.pop();

            TreeNode nodeIter = node.right;
            while(nodeIter != null) {
                treeStack.push(nodeIter);
                nodeIter = nodeIter.left;
            }
            nodeIter = node;
            smallestCnt++;
            resultVal = node.val;
        }


        return resultVal;
    }
}
