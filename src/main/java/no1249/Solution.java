/*
 * Copyright(c) 2020-2020
 * Author: xiaoweixiang
 */

package no1249;

import java.util.Stack;

class Solution {
    public String minRemoveToMakeValid(String s) {
        int length = s.length();
        boolean[] canDelete = new boolean[length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                canDelete[i] = true;
                stack.push(i);
            } else if (s.charAt(i) == ')' && !stack.isEmpty()) {
                int index = stack.pop();
                canDelete[index] = false;
            } else if (s.charAt(i) == ')' && stack.isEmpty()) {
                canDelete[i] = true;
            }
        }
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (!canDelete[i]) buffer.append(s.charAt(i));
        }
        return buffer.toString();
    }
}