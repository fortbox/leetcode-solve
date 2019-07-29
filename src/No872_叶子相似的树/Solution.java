package No872_叶子相似的树;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if ((root1 != null && root2 != null) || (root1 == null && root2 == null)) {
            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();
            findLeaf(root1, list1);
            findLeaf(root2, list2);
            if (list1.size() != list2.size()) {
                return false;
            }
            for (int i = 0; i < list1.size(); i++) {
                if (list1.get(i) != list2.get(i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private void findLeaf(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        findLeaf(root.left, list);
        findLeaf(root.right, list);
        if (root.left == null && root.right == null) {
            list.add(root.val);
        }
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
