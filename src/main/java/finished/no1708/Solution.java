/*
 * Copyright (c) 2021
 * Author: xiaoweixiang
 */

package finished.no1708;

import java.util.Arrays;

class Solution {
    public int[] largestSubarray(int[] nums, int k) {
        int length = nums.length;
        int maxValueIndex = 0;
        for (int i = 0; i < nums.length - k + 1; i++) {
            if (nums[i] > nums[maxValueIndex]) {
                maxValueIndex = i;
            }
        }
        return Arrays.copyOfRange(nums, maxValueIndex, maxValueIndex + k);
    }
}