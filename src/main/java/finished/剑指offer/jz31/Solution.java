/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.剑指offer.jz31;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new ArrayDeque<>();
        int j = 0;
        for (int n : pushed) {
            stack.push(n);
            while (j < popped.length && !stack.isEmpty()
                    && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }
        return j == popped.length;
    }
}
