/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.程序员面试宝典.cxy0305;

import java.util.Stack;

class SortedStack {
    Stack<Integer> stack;

    public SortedStack() {
        this.stack = new Stack<>();
    }

    public void push(int val) {
        if (this.stack.size() == 0) {
            this.stack.push(val);
        } else {
            Stack<Integer> tmp = new Stack<>();
            while (!this.stack.isEmpty() && this.stack.peek() < val) {
                tmp.push(this.stack.pop());
            }
            this.stack.push(val);
            while (tmp.size() > 0) {
                this.stack.push(tmp.pop());
            }
        }
    }

    public void pop() {
        if (!this.stack.isEmpty()) {
            this.stack.pop();
        }
    }

    public int peek() {
        if (!this.stack.isEmpty()) {
            return this.stack.peek();
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }
}

/**
 * Your SortedStack object will be instantiated and called as such:
 * SortedStack obj = new SortedStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.isEmpty();
 */