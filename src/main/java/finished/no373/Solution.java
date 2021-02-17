/*
 * Copyright (c) 2021
 * Author: xiaoweixiang
 */

package finished.no373;

import java.util.*;

class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        Queue<List<Integer>> queue = new PriorityQueue<>(Comparator.comparingInt(o -> (o.get(0) + o.get(1))));
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                queue.add(Arrays.asList(nums1[i], nums2[j]));
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        while (k > 0 || queue.size() == 0) {
            list.add(queue.poll());
            k--;
        }
        return list;
    }
}
