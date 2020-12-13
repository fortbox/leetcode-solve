/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.no162;

class Solution {
    public int findPeakElement(int[] nums) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) return i;
        }
        if (nums.length == 1) return 0;
        if (nums.length == 2) return nums[1] > nums[0] ? 1 : 0;
        return nums[0] > nums[1] ? 0 : nums.length - 1;
    }
}
