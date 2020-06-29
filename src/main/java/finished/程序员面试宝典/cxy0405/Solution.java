/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.程序员面试宝典.cxy0405;

class Solution {
    boolean flag = true;
    Integer lastValue = null;

    public boolean isValidBST(TreeNode root) {
        inOrder(root);
        return flag;
    }

    private void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        if (lastValue == null) {
            lastValue = root.val;
        } else {
            if (root.val <= lastValue) {
                flag = false;
                return;
            } else {
                lastValue = root.val;
            }
        }
        inOrder(root.right);
    }
}