/*
 * Copyright(c) 2020-2020
 * Author: xiaoweixiang
 */

package finished.no78;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Solution solution = new Solution();
        List<List<Integer>> ans = solution.subsets(nums);
        for (List<Integer> list : ans) {
            System.out.println("list.toString() = " + list.toString());
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        // dp
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            int size = res.size();
            for (int j = 0; j < size; j++) {
                ArrayList<Integer> tmp = new ArrayList<>(res.get(j));
                tmp.add(nums[i]);
                res.add(tmp);
            }
        }
        return res;
    }
}
