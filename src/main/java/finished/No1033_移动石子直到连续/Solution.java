/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No1033_移动石子直到连续;

import java.util.Arrays;

class Solution {
    public int[] numMovesStones(int a, int b, int c) {
        int[] intarr = {a, b, c};
        Arrays.sort(intarr);
        a = intarr[0];
        b = intarr[1];
        c = intarr[2];
        int m = b - a;
        int n = c - b;
        int[] arr = new int[2];
        if (m == 1) {
            if (n == 1) {
                arr[0] = 0;
                arr[1] = 0;
            } else if (n > 1) {
                arr[0] = 1;
                arr[1] = n - 1;
            }

        } else if (m > 1) {
            if (n == 1) {
                arr[0] = 1;
                arr[1] = m - 1;
            } else if (n > 1) {
                arr[0] = 2;
                arr[1] = m + n - 2;
            }
            if (n == 2 || m == 2) arr[0] = 1;
        } else {
            arr[0] = 0;
            arr[1] = 0;
        }
        return arr;
    }
}
