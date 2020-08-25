/*
 * Copyright(c) 2020-2020
 * Author: xiaoweixiang
 */

package no209;

import java.util.Arrays;

class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if (sum == s) return nums.length;
        if (sum < s) return 0;
        int res = nums.length;
        int start = 0;
        int end = 1;
        int tmp = nums[0];
        while (start < nums.length && end <= nums.length) {
            if (tmp < s && end < nums.length) {
                tmp += nums[end];
                end++;
            } else if (tmp >= s) {
                int len = end - start;
                if (len < res) res = len;
                tmp -= nums[start];
                start++;
            }
        }
        return res;
    }
}