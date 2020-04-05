/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No703_数据流中的第k大元素;

import java.util.PriorityQueue;

class KthLargest {

    PriorityQueue<Integer> pq;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>(k);
        for (int i : nums) {//对传进来的int数组遍历
            add(i);
        }
    }

    public int add(int val) {
        if (pq.size() < k)//如果队列中的数量少于K，直接添加入优先队列，优先队列会自动维持小顶堆
            pq.offer(val);
        else {
            if (pq.peek() < val) {//否则队列中的数量大于或者等于K，优先队列中的最小数字小于新的数据，优先队列中的顶堆要被移除，并且添加入新的数据进优先队列
                pq.poll();
                pq.offer(val);
            }
        }
        return pq.peek();//返回当前第K大的数
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */