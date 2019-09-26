package finished.No1021_删除最外层的括号;

import java.util.ArrayList;
import java.util.Stack;

class Solution {
    public String removeOuterParentheses(String S) {
        Stack<Character> stack = new Stack<>();
        ArrayList<String> list = new ArrayList<>();
        int from = 0;
        int to = 0;
        for (int i = 0; i < S.length(); i++) {

            char c = S.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else {
                stack.pop();
            }
            if (stack.empty()) {
                from = to;
                to = i + 1;
                list.add(S.substring(from, to));
            }
        }
        StringBuilder builder = new StringBuilder();
        for (String s : list) {
            builder.append(s.substring(1, s.length() - 1));
        }
        return builder.toString();
    }
}
