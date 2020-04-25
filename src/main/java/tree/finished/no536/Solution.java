/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package tree.finished.no536;


class Solution {
    public static void main(String[] args) {
        String s = "-4(2(3222)(1))(6(5))";
        Solution solution = new Solution();

        TreeNode node = solution.str2tree(s);


    }

    public TreeNode str2tree(String s) {
        /**
         * 递归
         */
        if (s == null || "".equals(s)) return null;
        int index = s.indexOf('(');
        if (index == -1) {
            return new TreeNode(Integer.parseInt(s));
        }
        String tmp0 = s.substring(0, index);
        int n = Integer.parseInt(tmp0);
        TreeNode root = new TreeNode(n);
        s = s.substring(index);
        int left = findLeft(s);
        String tmp1 = s.substring(0, left + 1);
        root.left = str2tree(tmp1.substring(1, tmp1.length() - 1));
        if (left == s.length() - 1) return root;
        String tmp2 = s.substring(left + 1);
        root.right = str2tree(tmp2.substring(1, tmp2.length() - 1));
        return root;
    }

    private int findLeft(String s) {
        if (s == null || "".equals(s)) return 0;
        int left = 0;
        int right = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') left++;
            if (chars[i] == ')') right++;
            if (left == right) {
                System.out.println("i = " + i);
                return i;
            }
        }
        return 0;
    }
}
