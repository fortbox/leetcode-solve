/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no1403;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum = Arrays.stream(nums).reduce(0, (a, b) -> a + b);
        int last = 0;
        int first = sum;
        List<Integer> list = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            list.add(nums[i]);
            last += nums[i];
            first -= nums[i];
            if (last > first) break;
        }
        return list;
    }
}
