/*
 * Copyright(c) 2020-2020
 * Author: xiaoweixiang
 */

package finished.no1566;

import java.util.Arrays;

class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        if (k == 1) return true;
        for (int i = 0; i + m - 1 < arr.length; i++) {
            int[] range = Arrays.copyOfRange(arr, i, i + m);
            int tmp = 1;
            for (int j = i + m; j + m - 1 < arr.length; j += m) {
                int[] range1 = Arrays.copyOfRange(arr, j, j + m);
                if (Arrays.equals(range, range1)) {
                    tmp += 1;
                    if (tmp == k) return true;
                } else break;
            }
        }
        return false;
    }
}
