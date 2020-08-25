/*
 * Copyright(c) 2020-2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no153;

class Solution {
    public int findMin(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                return nums[i];
            }
        }
        return nums[0];
    }
}