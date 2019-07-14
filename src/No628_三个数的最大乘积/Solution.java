package No628_三个数的最大乘积;

import java.util.Arrays;

public class Solution {
    /**
     * 先排序，然后取最大的三个数
     *
     * @param nums
     * @return
     */
    public int maximumProduct(int[] nums) {
        Arrays.parallelSort(nums);
        return Math.max(nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3],
                nums[nums.length - 1] * nums[0] * nums[1]);
    }
}
