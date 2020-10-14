/*
 * Copyright(c) 2020-2020
 * Author: xiaoweixiang
 */

package no239;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i + k - 1 < nums.length; i++) {
            if (queue.size() == 0) {
                List<Integer> list = Arrays.stream(Arrays.copyOfRange(nums, i, i + k)).boxed().collect(Collectors.toList());
                queue.addAll(list);
            } else {
                queue.poll();
                queue.add(nums[i + k - 1]);
            }
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> o2 - o1);
            priorityQueue.addAll(queue);
            res.add(priorityQueue.peek());
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}