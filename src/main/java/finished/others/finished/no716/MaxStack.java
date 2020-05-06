/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no716;

import java.util.*;

class MaxStack {
    /**
     * 一个优先队列，来记录最大元素
     * 维护一个栈。popmax完就重新插入栈。
     */

    Stack<Integer> stack;
    Queue<Integer> queue;
    ;

    /**
     * initialize your data structure here.
     */
    public MaxStack() {
        stack = new Stack<>();
        queue = new PriorityQueue<>((o1, o2) -> o2 - o1);
    }

    public void push(int x) {
        stack.add(x);
        queue.add(x);
    }

    public int pop() {
        Integer integer = stack.pop();
        int size = queue.size();
        ArrayList<Integer> list = new ArrayList<>();
        boolean isRemoved = false;
        while (!queue.isEmpty()) {
            Integer n = queue.poll();
            if (n == integer.intValue() && !isRemoved) {
                isRemoved = true;
                continue;
            }
            list.add(n);
        }
        queue.addAll(list);
        return integer;
    }

    public int top() {
        Integer integer = stack.peek();
        return integer;
    }

    public int peekMax() {
        return queue.peek();
    }

    public int popMax() {
        Integer integer = queue.poll();
        ArrayList<Integer> list = new ArrayList<>();
        boolean isRemoved = false;
        while (!stack.isEmpty()) {
            Integer n = stack.pop();
            if (n == integer.intValue() && !isRemoved) {
                isRemoved = true;
                continue;
            }
            list.add(n);
        }
        Collections.reverse(list);
        stack.addAll(list);
        return integer;
    }
}