/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package greedy.finished.No45_跳跃游戏II;

class Solution {
    /**
     * 往前跳，然后对比获取最远的值。
     *
     * @param nums
     * @return
     */
    public int jump(int[] nums) {
        int len = nums.length, farest = 0, nextStart = 0, steps = 0;
        for (int i = 0; i < len - 1; i++) {
            farest = Math.max(farest, i + nums[i]);
            if (i == nextStart) {
                nextStart = farest;
                steps++;
            }
        }
        return steps;
    }
}
