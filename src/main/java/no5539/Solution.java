/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no5539;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 1, 2, 2, 2, 3};
        int[] ans = solution.frequencySort(nums);
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
    }

    public int[] frequencySort(int[] nums) {
        // 用treemap
        TreeMap<Integer, List<Integer>> map = new TreeMap<>(Integer::compareTo);
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            if (hashMap.containsKey(num)) {
                int times = hashMap.get(num);
                hashMap.put(num, times + 1);
                List<Integer> list = map.get(times);
                System.out.println("list.toString() = " + list);
                list.remove(Integer.valueOf(num));
                if (list.size() == 0) map.remove(times);
                List<Integer> list1 = map.getOrDefault(times + 1, new ArrayList<>());
                list1.add(num);
                map.put(times + 1, list1);
            } else {
                hashMap.put(num, 1);
                List<Integer> list1 = map.getOrDefault(1, new ArrayList<>());
                list1.add(num);
                map.put(1, list1);
            }
        }
        int index = 0;
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            int key = entry.getKey();
            List<Integer> list = entry.getValue();
            list.sort(Comparator.reverseOrder());
            for (int n : list) {
                for (int i = 0; i < key; i++) {
                    nums[index++] = n;
                }
            }
        }
        return nums;
    }
}