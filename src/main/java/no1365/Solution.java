/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1365;

import java.util.Arrays;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            res[i] = (int) Arrays.stream(nums).filter(j -> j < num).count();
        }
        return res;
    }
}