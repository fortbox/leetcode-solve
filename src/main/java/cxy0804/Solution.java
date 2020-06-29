/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package cxy0804;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3};
        List<List<Integer>> ans = solution.subsets(nums);
        System.out.println("ans.toString() = " + ans.toString());
    }

    public List<List<Integer>> subsets(int[] nums) {
        if (nums.length == 0) {
            List<Integer> list = new ArrayList<>();
            List<List<Integer>> res = new ArrayList<>();
            res.add(list);
            return res;
        }
        List<List<Integer>> list = subsets(Arrays.copyOfRange(nums, 0, nums.length - 1));
        for (List<Integer> integers : list) {
            System.out.println("integers.toString() = " + integers.toString());
        }

        List<List<Integer>> res = new ArrayList<>();
        for (List<Integer> l : list) {
            res.add(new ArrayList<>(l));
        }
        System.out.println("res.1 = " + res.toString());
        List<List<Integer>> list1 = new ArrayList<>();
        for (List<Integer> l : list) {
            list1.add(new ArrayList<>(l));
        }
        for (List<Integer> tmp : list1) {
            tmp.add(nums[nums.length - 1]);
        }
        System.out.println("list1.toString() = " + list1.toString());
        res.addAll(list1);
        System.out.println("res.2 = " + res.toString());
        return new ArrayList<>(res);
    }
}
