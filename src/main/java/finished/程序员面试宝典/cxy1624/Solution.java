/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.程序员面试宝典.cxy1624;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        int[] nums = {5, 6, 5, 6};
        int target = 11;
        List<List<Integer>> ans = pairSums(nums, target);
        for (List<Integer> an : ans) {
            System.out.println("an = " + an);
        }
    }

    public static List<List<Integer>> pairSums(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<List<Integer>> res = new ArrayList<>();
        for (int n : nums) {
            int m = target - n;
            int a = map.getOrDefault(n, 0);
            int b = map.getOrDefault(m, 0);

            if (a >= 1 && b >= 1) {
                res.add(Arrays.asList(m, n));
                map.put(n, a - 1);
                map.put(m, b - 1);
            }
        }
        return res;
    }
}
