/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No653_两数之和IV_输入BST;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    /**
     * 1，把所有结点找出来到map，然后在map中搜索
     *
     * @param root
     * @param k
     * @return
     */
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        findall(root, list);
        int[] aa = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            aa[i] = list.get(i);
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < aa.length; i++) {
            map.put(i, aa[i]);
        }
        for (int i = 0; i < aa.length; i++) {
            int temp = k - aa[i];
            map.remove(i, aa[i]);
            if (map.containsValue(temp)) {
                return true;
            }
            map.put(i, aa[i]);
        }
        return false;

    }

    private void findall(TreeNode root, List list) {
        if (root == null) {
            return;
        }
        findall(root.left, list);
        list.add(root.val);
        findall(root.right, list);
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
