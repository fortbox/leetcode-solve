/*
 * Copyright(c) 2020-2020
 * Author: xiaoweixiang
 */

package no295;

import java.util.PriorityQueue;
import java.util.Queue;

class MedianFinder {
    Queue<Integer> maxQueue;
    Queue<Integer> minQueue;

    /**
     * initialize your data structure here.
     */
    public MedianFinder() {
        maxQueue = new PriorityQueue<>((o1, o2) -> o2 - o1);
        minQueue = new PriorityQueue<>();

    }

    public void addNum(int num) {
        maxQueue.add(num);
        minQueue.add(maxQueue.poll());
        System.out.println("maxQueue.size() = " + maxQueue.size());
        System.out.println("minQueue.size() = " + minQueue.size());
        if (minQueue.size() > maxQueue.size()) {
            maxQueue.add(minQueue.poll());
        }
    }

    public double findMedian() {
        System.out.println("maxQueue.size() = " + maxQueue.size());
        System.out.println("minQueue.size() = " + minQueue.size());
        if (maxQueue.size() == minQueue.size()) return (maxQueue.peek() + minQueue.peek()) / 2;
        return maxQueue.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */