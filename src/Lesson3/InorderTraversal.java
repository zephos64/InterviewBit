package Lesson3;

import java.util.ArrayList;
import java.util.Stack;

public class InorderTraversal {
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
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        ArrayList<Integer> inorderArray = new ArrayList<Integer>();
        Stack<TreeNode> treeStack = new Stack<TreeNode>();

        for(TreeNode initNode = A; initNode != null;
            initNode = initNode.left) {
            treeStack.push(initNode);
        }

        while(!treeStack.isEmpty()) {
            TreeNode node = treeStack.pop();
            inorderArray.add(node.val);
            if(node.right != null) {
                treeStack.push(node);
            }

        }

        return inorderArray;
    }
}
