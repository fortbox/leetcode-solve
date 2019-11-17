package greedy.finished.No921_使括号有效的最少添加;

import java.util.Stack;

public class Solution {
    public int minAddToMakeValid(String S) {
        char[] array = S.toCharArray();
        Stack<Character> stack = new Stack<>();
        int res = 0;
        for (char c : array) {
            if (c == ')') {
                if (stack.isEmpty()) {
                    res++;
                } else {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }
        res += stack.size();
        return res;
    }
}
