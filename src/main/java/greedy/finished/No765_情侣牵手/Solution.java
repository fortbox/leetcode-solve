/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package greedy.finished.No765_情侣牵手;

public class Solution {

    public static void main(String[] args) {
        int[] row = {3, 2, 0, 1};
        int res = minSwapsCouples(row);
        System.out.println("res = " + res);
    }


    public static int minSwapsCouples(int[] row) {
        int res = 0;
        for (int i = 0; i < row.length - 1; ) {
            int a = row[i];
            int k = 0;
            if (a % 2 == 0) {
                k = a + 1;
            } else {
                k = a - 1;
            }
            if (row[i + 1] != k) {
                int m = i + 1;
                for (int j = m; j < row.length; j++) {
                    if (row[j] == k) {
                        m = j;
                        break;
                    }
                }
                int temp = row[i + 1];
                row[i + 1] = row[m];
                row[m] = temp;
                res++;
            }
            i += 2;
        }
        return res;
    }
}
