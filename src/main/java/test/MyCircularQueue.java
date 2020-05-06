/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished;

class MyCircularQueue {
    int[] queue;
    int head = 0;
    int tail = 0;
    int num = 0;

    /**
     * Initialize your data structure here. Set the size of the queue to be k.
     */
    public MyCircularQueue(int k) {
        queue = new int[k];
    }

    /**
     * Insert an element into the circular queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        if (num == queue.length) {
            return false;
        }

        queue[tail] = value;
        tail--;
        if (tail < 0) tail = queue.length - 1;
        num++;
        return true;
    }

    /**
     * Delete an element from the circular queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if (num == 0) return false;
        head--;
        num--;
        if (head < 0) head = queue.length - 1;
        return true;

    }

    /**
     * Get the front item from the queue.
     */
    public int Front() {
        if (num > 0) return queue[head];
        return -1;
    }

    /**
     * Get the last item from the queue.
     */
    public int Rear() {
        if (num == 0) return -1;
        if (tail == queue.length - 1) {
            return queue[0];
        }
        return queue[tail + 1];
    }

    /**
     * Checks whether the circular queue is empty or not.
     */
    public boolean isEmpty() {
        return num == 0;
    }

    /**
     * Checks whether the circular queue is full or not.
     */
    public boolean isFull() {
        return num == queue.length;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
