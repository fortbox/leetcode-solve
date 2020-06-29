/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.程序员面试宝典.cxy0303;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class StackOfPlates {
    List<Stack<Integer>> stackList;
    int capacity;

    public StackOfPlates(int cap) {
        stackList = new ArrayList<>();
        capacity = cap;
    }

    public void push(int val) {
        if (capacity == 0) return;
        if (stackList.size() == 0) {
            stackList.add(new Stack<>());
        }
        System.out.println("val = " + val);
        Stack<Integer> stack = stackList.get(stackList.size() - 1);
        if (stack.size() == capacity) {
            stackList.add(new Stack<>());
        }
        stack = stackList.get(stackList.size() - 1);
        stack.add(val);
    }

    public int pop() {
        if (capacity == 0) return -1;
        if (stackList.size() == 0) return -1;
        System.out.println("stackList.size() = " + stackList.size());
        Stack<Integer> stack = stackList.get(stackList.size() - 1);
        int n = stack.pop();
        if (stack.size() == 0) stackList.remove(stackList.size() - 1);
        return n;
    }

    public int popAt(int index) {
        if (capacity == 0) return -1;
        if (index > stackList.size() - 1) return -1;
        Stack<Integer> stack = stackList.get(index);
        Integer pop = stack.pop();
        if (stack.size() == 0) stackList.remove(index);
        return pop;
    }
}

/**
 * Your StackOfPlates object will be instantiated and called as such:
 * StackOfPlates obj = new StackOfPlates(cap);
 * obj.push(val);
 * int param_2 = obj.pop();
 * int param_3 = obj.popAt(index);
 */
