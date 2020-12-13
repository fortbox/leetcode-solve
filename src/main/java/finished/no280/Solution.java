/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.no280;

import java.util.Arrays;

class Solution {
    public void wiggleSort(int[] nums) {
        // 先排序，然后变换
        Arrays.sort(nums);
        for (int i = 1; i + 1 < nums.length; i += 2) {
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }
    }
}