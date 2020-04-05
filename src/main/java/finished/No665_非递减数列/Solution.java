/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No665_非递减数列;

class Solution {
    public boolean checkPossibility(int[] nums) {
    int remeber = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                remeber++;
                if (i > 1 && nums[i - 2] > nums[i]) {
                    nums[i] = nums[i - 1];
                }else {
                    nums[i-1]=nums[i];
                }
            }
            if (remeber > 1) return false;
        }
        return true;
    }
}