package finished.dp.finished.no523;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{0, 0};
        int k = 0;
        boolean ans = solution.checkSubarraySum(nums, k);
        System.out.println("ans = " + ans);
    }

    public boolean checkSubarraySum(int[] nums, int k) {
        int[] dp = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                dp[i + 1] = nums[0];
            } else {
                dp[i + 1] = nums[i] + dp[i];
            }
        }
        System.out.println("Arrays.toString(dp) = " + Arrays.toString(dp));
        for (int i = 0; i <= nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int dif = dp[j + 1] - dp[i];
                if (dif == 0 || (k != 0 && dif % k == 0)) {
                    return true;
                }
            }
        }
        return false;
    }
}