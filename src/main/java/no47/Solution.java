package no47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 1, 2};
        List<List<Integer>> ans = solution.permuteUnique(nums);
        System.out.println("ans = " + ans);
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;
        Arrays.sort(nums);
        int len = nums.length;
        ArrayList<Integer> path = new ArrayList<>();
        boolean[] isUsed = new boolean[len];
        dfs(nums, 0, path, len, isUsed, result);
        return result;
    }

    private void dfs(int[] nums, int index, ArrayList<Integer> path, int len, boolean[] isUsed, List<List<Integer>> result) {
        if (index >= len) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < len; i++) {
            if (isUsed[i]) continue;
            if (i > 0 && nums[i] == nums[i - 1] && !isUsed[i - 1]) continue;
            isUsed[i] = true;
            path.add(nums[i]);
            dfs(nums, index + 1, path, len, isUsed, result);
            path.remove(path.size() - 1);
            isUsed[i] = false;
        }
    }
}

