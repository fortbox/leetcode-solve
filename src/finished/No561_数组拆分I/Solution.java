package finished.No561_数组拆分I;

import java.util.Arrays;

class Solution {

    /**
     * 先排序，然后取奇数相加
     *
     * @param nums
     * @return
     */
    public int arrayPairSum(int[] nums) {
        int minsum = 0;
        Arrays.parallelSort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            minsum += nums[i];
        }
        return minsum;
    }
}