/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1188;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

class BoundedBlockingQueue {
    Semaphore in;
    Semaphore out;
    Queue<Integer> queue;

    public BoundedBlockingQueue(int capacity) {
        in = new Semaphore(capacity);
        out = new Semaphore(0);
        queue = new LinkedList<>();
    }

    public void enqueue(int element) throws InterruptedException {
        in.acquire();
        queue.add(element);
        out.release();
    }

    public int dequeue() throws InterruptedException {
        out.acquire();
        int tmp = queue.poll();
        in.release();
        return tmp;
    }

    public int size() {
        return queue.size();
    }
}
