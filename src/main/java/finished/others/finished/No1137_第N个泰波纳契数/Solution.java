/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No1137_第N个泰波纳契数;

class Solution {
    public int tribonacci(int n) {
        switch (n) {
            case 0:
                return 0;
            case 1:
            case 2:
                return 1;
            default:
                break;
        }
        int loopTimes = n - 3 + 1;
        int[] arr = {0, 1, 1};
        int m = 0;
        while (loopTimes > 0) {
            int n_0 = arr[0];
            int n_1 = arr[1];
            int n_2 = arr[2];
            m = n_0 + n_1 + n_2;
            arr[0] = n_1;
            arr[1] = n_2;
            arr[2] = m;
            loopTimes--;
        }
        return m;
    }
}
