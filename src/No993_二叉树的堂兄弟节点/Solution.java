package No993_二叉树的堂兄弟节点;

class Solution {
    int xDeep, yDeep, deep = 0, flag = 0;   //用 flag 记录是否为同一父节点

    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root, x, y);
        if (xDeep == yDeep && flag == 0) return true;
        else return false;
    }

    private void dfs(TreeNode node, int x, int y) {
        if (node == null) return;
        if (node.left != null && node.right != null) {
            if (node.left.val == x && node.right.val == y) flag = 1;
            else if (node.left.val == y && node.right.val == x) flag = 1;//写else时忘记写if了
        }
        // 只考虑了左边等于x的情况忽略了左边还可以等于y的情况
        deep++;
        if (node.val == x) xDeep = deep;
        if (node.val == y) yDeep = deep;
        dfs(node.left, x, y);
        dfs(node.right, x, y);
        deep--; //遍历完当前节点所在子树后让当前深度 - 1；
        //递归过程中对每个节点都要累加的注意是否需要 - 1
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
