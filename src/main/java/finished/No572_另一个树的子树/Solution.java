/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No572_另一个树的子树;


class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null && t != null) return false;
        if (isEqual(s,t)) return true;
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    private boolean isEqual(TreeNode s,TreeNode t){
        if (s==null&&t==null) return true;
        if (s==null&&t!=null) return false;
        if (s!=null&&t==null) return false;
        return s.val==t.val&&isEqual(s.left,t.left)&&isEqual(s.right,t.right);
    }

    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
