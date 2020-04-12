/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package tree.finished.no255_验证前序遍历序列二叉搜索树;

import java.util.Stack;

class Solution {
    public boolean verifyPreorder(int[] preorder) {
        /**
         * 看了很多的解题，全是一个思路
         * 用一个栈来验证。
         */
        Stack<Integer> s = new Stack<>();
        int root_val = Integer.MIN_VALUE;
        for (int i = 0; i < preorder.length; i++) {
            int val = preorder[i];
            if (val < root_val) return false;
            while (!s.isEmpty() && val > s.peek()) {
                root_val = s.pop();
            }
            s.add(val);
        }
        return true;
    }
}
