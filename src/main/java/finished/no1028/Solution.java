/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.no1028;

import tool.TreeNode;

import java.util.Stack;

class Solution {
    public TreeNode recoverFromPreorder(String S) {
        // 字符串匹配，递归
        Stack<TreeNode> path = new Stack<>();
        int pos = 0;
        while (pos < S.length()) {
            int level = 0;
            while (S.charAt(pos) == '-') {
                level++;
                pos++;
            }
            int value = 0;
            while (pos < S.length() && Character.isDigit(S.charAt(pos))) {
                value = value * 10 + (S.charAt(pos) - '0');
                pos++;
            }
            TreeNode node = new TreeNode(value);
            if (level == path.size()) {
                if (!path.isEmpty()) {
                    path.peek().left = node;
                }
            } else {
                while (level != path.size()) {
                    path.pop();
                }
                path.peek().right = node;
            }
            path.push(node);
        }
        while (path.size() > 1) path.pop();
        return path.peek();
    }
}