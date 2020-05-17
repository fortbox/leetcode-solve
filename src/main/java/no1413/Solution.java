package no1413;

/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */
class Solution {
    public int minStartValue(int[] nums) {
        int ans = 1;
        int pre = 1;
        for (int i = 0; i < nums.length; i++) {
            if (pre + nums[i] < 1) {
                ans += (1 - pre - nums[i]);
                pre = 1;
            } else {
                pre += nums[i];
            }
        }
        return ans;
    }
}
