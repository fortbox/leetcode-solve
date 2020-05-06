/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished;

import java.util.Stack;

class MinStack {

    Stack<Integer> stack;
    int min = Integer.MAX_VALUE;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int x) {
        stack.add(x);
    }

    public void pop() {
        stack.pop();

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        while (!stack.isEmpty()) {
            int pop = stack.pop();
            if (min > pop) {
                min = pop;
            }
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
