package finished.No933_最近的请求次数;

import java.util.PriorityQueue;
import java.util.Queue;

class RecentCounter {
    Queue<Integer> queue;

    public RecentCounter() {
        queue = new PriorityQueue();
    }

    public int ping(int t) {
        while (queue.size() > 0 && queue.peek() < t - 3000) queue.poll();
        queue.offer(t);
        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
