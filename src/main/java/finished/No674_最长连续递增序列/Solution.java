/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No674_最长连续递增序列;

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length==0) return 0;
        int max = 0;
        int temp = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                temp++;
            } else {
                if (max < temp) {
                    max = temp;
                }
                temp = 1;
            }
        }
        return Math.max(temp,max);
    }
}