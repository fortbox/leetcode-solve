/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No747_至少是其他数字两倍的最大数;

class Solution {
    public int dominantIndex(int[] nums) {
        //1, find the largest number
        int maxNumberIndex = this.findMaxNumber(nums);
        //2, determine whether the conditions are met
        boolean f = this.judge(nums, maxNumberIndex);
        return f ? maxNumberIndex : -1;
    }

    private int findMaxNumber(int[] nums) {
        int max = nums[0];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        return index;
    }

    private boolean judge(int[] nums, int index) {
        for (int i = 0; i < index; i++) {
            if (nums[i] * 2 > nums[index]) return false;
        }
        for (int i = index + 1; i < nums.length; i++) {
            if (nums[i] * 2 > nums[index]) return false;
        }
        return true;
    }
}
