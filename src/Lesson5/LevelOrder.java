package Lesson5;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;

public class LevelOrder {
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
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
        LinkedList<TreeNode> nodeQueue = new LinkedList<TreeNode>();
        nodeQueue.add(A);

        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        while(!nodeQueue.isEmpty()) {
            LinkedList<TreeNode> tempQueue = new LinkedList<TreeNode>();
            ArrayList<Integer> treeLevel = new ArrayList<Integer>();
            int treeLevelCount = 0;

            while(!nodeQueue.isEmpty()) {
                TreeNode temp = nodeQueue.poll();
                treeLevel.add(temp.val);
                if(temp.left != null)
                    tempQueue.add(temp.left);
                if(temp.right != null)
                    tempQueue.add(temp.right);
            }

            nodeQueue = tempQueue;
            result.add(treeLevel);
        }
        return result;
    }
}
