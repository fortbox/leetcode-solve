/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        char[] array = s.toCharArray();
        for (char c : array) {
            if (c=='('){
                stack.add(c);
            }else if (c==')'){
                if (stack.isEmpty()) return false;
                if (stack.pop()!='(') return false;
            } else if (c=='['){
                stack.add(c);
            }else if (c==']'){
                if (stack.isEmpty()) return false;
                if (stack.pop()!='[') return false;
            } else if (c=='{'){
                stack.add(c);
            }else if (c=='}'){
                if (stack.isEmpty()) return false;
                if (stack.pop()!='{') return false;
            }
        }
        return stack.isEmpty();
    }
}
