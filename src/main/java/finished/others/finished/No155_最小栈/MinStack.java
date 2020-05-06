/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No155_最小栈;

import java.util.ArrayList;
import java.util.List;

public class MinStack {
    /**
     * initialize your data structure here.
     */
    List<Integer> list = new ArrayList<>();

    public MinStack() {
    }

    public void push(int x) {
        list.add(x);
        System.out.println("push:" + list.toString());
    }

    public void pop() {
        System.out.println("pop():" + list.toString());
        list.remove(list.size() - 1);
    }

    public int top() {
        System.out.println("top():" + list.toString());
        return list.get(list.size() - 1).intValue();

    }

    public int getMin() {
        List<Integer> listnew = new ArrayList<>(list);
        listnew.sort(null);
        System.out.println("getMin():" + listnew.toString());
        System.out.println("getMin():" + list.toString());
        return listnew.get(0);

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
