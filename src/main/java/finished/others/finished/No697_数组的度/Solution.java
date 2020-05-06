/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No697_数组的度;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1};
        Solution solution = new Solution();
        int max = solution.findShortestSubArray(nums);
        System.out.println("max = " + max);
    }


    public int findShortestSubArray(int[] nums) {
        //1,先找到度
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }

        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            System.out.println("key = " + key);
            System.out.println("value = " + value);
            if (list.size() == 0) list.add(key);
            if (map.get(list.get(0)) < value) {
                list.clear();
                list.add(key);
            } else if (map.get(list.get(0)) == value) {
                list.add(key);
            }
        }
        //2，然后对度，找最短的数组长度
        int max = Integer.MAX_VALUE;
        for (Integer integer : list) {
            System.out.println("integer = " + integer);
            int m = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == integer) {
                    m = i;
                    break;
                }
            }
            int n = 0;
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] == integer) {
                    n = i;
                    break;
                }
            }
            if (max > (n - m + 1)) max = n - m + 1;
        }
        return max;
    }
}