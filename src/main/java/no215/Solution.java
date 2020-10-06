/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no215;

import java.util.Arrays;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        return Arrays.stream(nums).boxed().sorted((o1, o2) -> o2 - o1).skip(k - 1).findFirst().get();
    }
}