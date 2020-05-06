/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package tree.finished.no663;


import java.util.ArrayList;

class Solution {
    public boolean checkEqualTree(TreeNode root) {
        /**
         * 1，求树的所有节点的和
         * 2，遍历每个节点，找出他的左节点子树的和，右节点子树的和。
         * 3，判断。
         */
        int total = sumAllNode(root);
        ArrayList<Integer> list = new ArrayList<>();
        preOrder(root, list);
        for (Integer integer : list) {
            if (integer * 2 == total) return true;
        }
        return false;
    }

    private void preOrder(TreeNode root, ArrayList<Integer> list) {
        if (root == null) return;
        if (root.left != null) {
            list.add(sumAllNode(root.left));
        }
        if (root.right != null) {
            list.add(sumAllNode(root.right));
        }
        preOrder(root.left, list);
        preOrder(root.right, list);
    }

    private int sumAllNode(TreeNode root) {
        if (root == null) return 0;
        return root.val + sumAllNode(root.left) + sumAllNode(root.right);
    }
}
