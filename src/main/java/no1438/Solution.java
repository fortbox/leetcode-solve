/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1438;

import java.util.TreeMap;

class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int ans = 0;
        int left = 0;
        int right = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (right = 0; right < nums.length; right++) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            while (map.lastEntry().getKey() - map.firstEntry().getKey() > limit) {
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) map.remove(nums[left]);
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}