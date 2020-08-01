/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no1457;

import tool.TreeNode;

import java.util.*;

class Solution {
    private final List<String> pathList = new ArrayList<String>();

    public int pseudoPalindromicPaths(TreeNode root) {
        /**
         * 1，获取所有路径
         * 2，判断回文
         */
        int ans = 0;
        dfs(root, "");
        for (String s : pathList) {
            String[] array = s.split("|");
            System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
            HashMap<String, Integer> map = new HashMap<>();
            for (String s1 : array) {
                map.put(s1, map.getOrDefault(s1, 0) + 1);
            }
            int count = 0;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (!entry.getKey().equals("|")) if (entry.getValue() % 2 == 1) count++;
            }
            if (count <= 1) ans++;
        }
        return ans;
    }

    private void dfs(TreeNode root, String s) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            System.out.println("s = " + s);
            pathList.add(s + "|" + root.val);
            return;
        }
        if (root.left != null) dfs(root.left, s + "|" + root.val);
        if (root.right != null) dfs(root.right, s + "|" + root.val);
    }
}
