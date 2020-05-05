/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.no1150;

import java.util.Arrays;

class Solution {
    public boolean isMajorityElement(int[] nums, int target) {
        return Arrays.stream(nums).filter(i -> i == target).count() > nums.length / 2;
    }
}
