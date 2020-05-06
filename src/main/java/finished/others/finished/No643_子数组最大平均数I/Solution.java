/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No643_子数组最大平均数I;

public class Solution {
    /**
     * 遍历一遍，记录最大值
     *
     * @param nums
     * @param k
     * @return
     */
    public double findMaxAverage(int[] nums, int k) {
        double maxAverage = 0;
        for (int j = 0; j < k; j++) {
            maxAverage += nums[j];
        }
        double last = maxAverage;
        maxAverage = maxAverage / k;
        for (int i = 1; i < nums.length - k + 1; i++) {
            double temp = 0;
            temp = last + nums[i + k - 1] - nums[i - 1];
            last = temp;
            temp = temp / k;
            if (temp > maxAverage) {
                maxAverage = temp;
            }
        }
        return maxAverage;

    }
}
