/*
 * Copyright(c) 2020-2020
 * Author: xiaoweixiang
 */

package no347;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((o1, o2) -> o2.getValue() - o1.getValue());
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        queue.addAll(map.entrySet());
        int len = Math.min(k, queue.size());
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = queue.poll().getKey();
        }
        return res;
    }
}
