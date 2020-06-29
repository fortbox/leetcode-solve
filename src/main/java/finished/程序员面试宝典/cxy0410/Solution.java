/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.程序员面试宝典.cxy0410;

class Solution {
    public boolean checkSubTree(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null && t2 != null) return false;
        if (t1 != null && t2 == null) return false;
        return checkEqual(t1, t2) || checkSubTree(t1.left, t2) || checkSubTree(t1.right, t2);
    }

    private boolean checkEqual(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null && t2 != null) return false;
        if (t1 != null && t2 == null) return false;
        if (t1.val != t2.val) return false;
        return checkEqual(t1.left, t2.left) && checkEqual(t1.right, t2.right);
    }
}