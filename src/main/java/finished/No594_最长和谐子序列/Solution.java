/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No594_最长和谐子序列;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        int result = findLHS(nums);
        System.out.println("result = " + result);
    }


    public static int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);

            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int m = entry.getKey();
            int n = entry.getValue();
            int nn = 0;
            if (map.get(m + 1) != null) {
                nn = map.get(m + 1);
            }
            if (nn != 0) {
                if (n + nn > sum) {
                    sum = n + nn;
                }
            }
        }
        return sum;
    }
}
