package finished.No538_把二叉搜索树转换为累加树;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    /**
     * 一个list记录所有的值，然后赋值给数组，然后遍历root，遍历数组相加
     *
     * @param root
     * @return
     */
    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();
        this.getAllNode(root, list);
        int[] nums = new int[list.size()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
        Arrays.parallelSort(nums);
        addNode(root, nums);
        return root;
    }

    private void addNode(TreeNode root, int[] nums) {
        if (root == null) {
            return;
        }
        // System.out.println("@@@root.val = " + root.val);
        int temp = root.val;
        for (int i = nums.length - 1; i >= 0; i--) {
            // System.out.println("----nums[i] = " + nums[i]);
            if (nums[i] > temp) {
                root.val += nums[i];
                // System.out.println("----root.val = " + root.val);
            } else {
                break;
            }
        }
        addNode(root.left, nums);
        addNode(root.right, nums);
    }

    private void getAllNode(TreeNode root, List list) {
        if (root != null) {
            list.add(root.val);
            // System.out.println("root.val = " + root.val);
        }
        if (root == null) return;
        getAllNode(root.left, list);
        getAllNode(root.right, list);
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

