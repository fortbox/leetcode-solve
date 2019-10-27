package greedy.finished.No402_移掉K位数字;

import java.util.Stack;

class Solution {
    public String removeKdigits(String num, int k) {
        if (k >= num.length()) {
            return "0";
        }
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for (; i < num.length(); i++) {
            int val = num.charAt(i) - '0';
            while (!stack.isEmpty() && k > 0 && stack.peek() > val) {
                stack.pop();
                k--;
            }
            if (val != 0 || !stack.isEmpty()) {
                stack.push(val);
            }
        }
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop().intValue());
        }
        return sb.reverse().toString().isEmpty() ? "0" : sb.toString();
    }
}
