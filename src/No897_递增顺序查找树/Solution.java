package No897_递增顺序查找树;


import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<Integer> list = new ArrayList<Integer>();
    public TreeNode increasingBST(TreeNode root) {
        dfs(root);
        TreeNode head = new TreeNode(0);
        head.val = list.get(0);
        TreeNode last = head;
        for (int i = 1; i < list.size(); i++) {
            TreeNode node = new TreeNode(0);
            node.val = list.get(i);
            last.right = node;
            last = node;
        }
        return head;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        list.add(root.val);
        dfs(root.right);
    }


    //    Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
