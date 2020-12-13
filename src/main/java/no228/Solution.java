/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no228;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        String temp = "";
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                temp += nums[0];
                continue;
            }
            if (nums[i] > nums[i - 1] + 1) {
                if (nums[i - 1] > Integer.valueOf(temp)) temp += "->" + nums[i - 1];
                res.add(temp);
                temp = "" + nums[i];
                if (i == nums.length - 1)
                    res.add(String.valueOf(nums[i]));
            } else if (nums[i] == nums[i - 1] + 1) {
                if (i == nums.length - 1) {
                    temp += "->" + nums[i];
                    res.add(temp);
                }
            }
        }
        return res;
    }
}