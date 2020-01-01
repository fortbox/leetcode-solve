/*
 * Copyright (c) 2020
 * @Author:xiaoweixiang
 */

package dp.finished.No363_矩形区域不超过K的最大数值和;

import java.util.Arrays;
import java.util.TreeSet;

public class Solution {
    public int maxSumSubmatrix(int[][] matrix, int target) {
        int row = matrix.length;
        if (row == 0) {
            return 0;
        }
        int col = matrix[0].length;
        if (col == 0) {
            return 0;
        }
        int result = Integer.MIN_VALUE;
        boolean key = col > row ? false : true;
        int m = Math.min(row, col);
        int n = Math.max(row, col);
        TreeSet<Integer> treeSet = new TreeSet<>();
        //一行一行的找
        for (int i = 0; i < m; i++) {
            //找从第i行开始一直到第0行这i+1行的可能组成的矩形长度
            int[] array = new int[n];//这个矩阵为了保存每一列上第j行到第i行的和
            for (int j = i; j >= 0; j--) {
                for (int k = 0; k < n; k++) {
                    if (key) {
                        array[k] += matrix[k][j];
                    } else {
                        array[k] += matrix[j][k];
                    }
                }
                int k = findMaxSubTarget(array, target);
                treeSet.add(k);
            }
        }
        return treeSet.last();
    }

    /**
     * 找到array中的小于等于target的最大连续子序列的和
     *
     * @param array
     * @param target
     * @return
     */
    private int findMaxSubTarget(int[] array, int target) {
        int n = array.length;
        // dp[i]表示以i为结尾的小于等于target的最大值.如果没有则为Integer.MIN_VALUE
        int[] dp = new int[n];
        for (int i = 0; i < dp.length; i++) {
            int k = 0;
            dp[i] = Integer.MIN_VALUE;
            for (int j = i; j >= 0; j--) {
                k += array[j];
                if (k <= target) {
                    dp[i] = Math.max(dp[i], k);
                }
            }
        }
        Arrays.parallelSort(dp);
        return dp[n - 1];
    }
}
