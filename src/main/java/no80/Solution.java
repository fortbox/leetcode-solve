/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no80;


import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        Solution solution = new Solution();
        int res = solution.removeDuplicates(nums);
        System.out.println("res = " + res);
    }

    public int removeDuplicates(int[] nums) {
        int left = 0, right = 0;
        int len = nums.length;
        int count = 0;
        while (left < len - count && right < len - count) {
            if (left == right) {
                right++;
                continue;
            }
            if (nums[left] != nums[right]) {
                left++;
            } else if (nums[left] == nums[right]) {
                if (right - left == 1) {
                    right++;
                } else {
                    // 数组左移一位，同时len-1；
                    for (int i = right + 1; i < len - count; i++) {
                        nums[i - 1] = nums[i];
                    }
                    System.out.println("nums = " + Arrays.toString(nums));
                    count++;
                }
            }
        }
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
        return len - count;
    }
}