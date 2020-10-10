/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no239;

import java.util.LinkedList;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        LinkedList<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) deque.pollLast();
            deque.addLast(i);
            if (deque.peekFirst() <= i - k) deque.pollFirst();
            if (i + 1 >= k) res[i + 1 - k] = nums[deque.peekFirst()];
        }
        return res;
    }
}