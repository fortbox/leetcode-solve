/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no324;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 1, 2, 2, 1};
        Solution solution = new Solution();
        solution.wiggleSort(nums);
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
    }

    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int[] t = nums.clone();
        for (int i = 0; i < nums.length / 2; i++) {
            nums[2 * i] = t[(len - 1) / 2 - i];
            nums[2 * i + 1] = t[len - 1 - i];
        }
        if (len % 2 == 1) nums[len - 1] = t[0];
    }
}