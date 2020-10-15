/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1614;

import java.util.Stack;

class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        char[] array = s.toCharArray();
        int maxDep = 0;
        for (char c : array) {
            if (c == '(') {
                stack.add(c);
            } else if (c == ')') {
                maxDep = Math.max(maxDep, stack.size());
                stack.pop();
            }
        }
        return maxDep;
    }
}
