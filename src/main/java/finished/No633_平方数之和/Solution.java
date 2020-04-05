/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No633_平方数之和;

public class Solution {
    /**
     * 遍历
     *
     * @param c
     * @return
     */
    public boolean judgeSquareSum(int c) {
        int i = 0;
        int j = (int) Math.sqrt(c);
        while (i <= j) {
            int m = (int) Math.pow(i, 2);
            int n = (int) Math.pow(j, 2);

            if (m + n > c) {
                j--;
            } else if (m + n < c) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }
}
