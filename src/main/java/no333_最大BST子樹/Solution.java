/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no333_最大BST子樹;

class Solution {

    int res = 0;
    long pre = Long.MIN_VALUE;

    public int largestBSTSubtree(TreeNode root) {
        /**
         * 判断一棵树是不是bst，很简单。
         * 然后遍历所有节点
         */
        if (root == null) return 0;
        if (inOrder(root)) {
            res = Math.max(res, getNode(root));
        }
        largestBSTSubtree(root.left);
        largestBSTSubtree(root.right);
        return res;
    }

    private int getNode(TreeNode root) {
        if (root == null) return 0;
        return getNode(root.right) + getNode(root.left) + 1;
    }

    /**
     * 验证一颗二叉搜索树很简单，只需要记住上一个节点的值就行
     *
     * @param node
     * @return
     */
    private boolean inOrder(TreeNode node) {
        if (node == null) return true;
        if (!inOrder(node.left)) return false;
        if (pre >= node.val) {
            return false;
        } else {
            pre = node.val;
        }
        if (!inOrder(node.right)) {
            return false;
        }
        return true;
    }
}