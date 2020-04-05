/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No566_重塑矩阵;

import java.util.HashMap;

class Solution {

    /**
     * 先计算是否合适<br/>
     * 先合并为一个，然后重新分配
     *
     * @param nums
     * @param r
     * @param c
     * @return
     */
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int size = nums.length * nums[0].length;
        int k = r * c;
        if (size != k) return nums;
        int[][] result = new int[r][c];
        int n = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                map.put(n++, nums[i][j]);
            }
        }
        int m = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = map.get(m++);
            }
        }
        return result;
    }
}
