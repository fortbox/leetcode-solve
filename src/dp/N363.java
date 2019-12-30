/*
 * Copyright (c) 2019
 * @Author:xiaoweixiang
 */

package dp;

import java.util.TreeSet;

public class N363 {
    public static int maxSumSubmatrix(int[][] matrix, int target) {
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
        //一行一行的找
        for (int i = 0; i < m; i++) {
            //找从第i行开始一直到第0行这i+1行的可能组成的矩形长度
            int[] array = new int[n];//这个矩阵为了保存每一列上第j行到第i行的和
            for (int j = i; j >= 0; j--) {
                TreeSet<Integer> set = new TreeSet<Integer>();
                //用来保存当前高度下，长度为从0开始到k位置的矩形的结果。理解set的含义是解决此题的关键。
                set.add(0);
                int sum = 0;
                for (int k = 0; k < n; k++) {
                    if (key) {
                        array[k] += matrix[k][j];
                    } else {
                        array[k] += matrix[j][k];
                    }
                    sum += array[k];
                    /* 因为要满足  （sum-set中的元素）<=target,
                     * 而且sum-set中的元素的值要尽可能的大，
                     * 所以也就是再求小于等于sum-target中满足条件的元素的最小的一个
                     * 正好TreeSet中提供了这个方法ceil()，可以很方便的找出这个元素
                     */
                    Integer integer = set.ceiling(sum - target);
                    if (integer != null) {
                        result = Math.max(result, sum - integer);
                    }
                    set.add(sum);
                }
            }
        }
        return result;
    }
}
