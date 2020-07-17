/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.剑指offer.jz59;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class MaxQueue {
    Queue<Integer> q0;
    Queue<Integer> q1;

    /**
     * add 和pop的时候要注意更新最大值
     */
    public MaxQueue() {
        q0 = new LinkedList<>();
        q1 = new PriorityQueue<>((o1, o2) -> o2 - o1);
    }

    public int max_value() {
        if (q1.size() > 0) return q1.peek();
        return -1;
    }

    public void push_back(int value) {
        q0.add(value);
        q1.add(value);
    }

    public int pop_front() {
        if (q0.size() == 0) return -1;
        int ans = q0.poll();
        q1.remove(ans);
        return ans;
    }
}
