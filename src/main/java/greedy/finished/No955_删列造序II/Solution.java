/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package greedy.finished.No955_删列造序II;

import java.util.Arrays;

public class Solution {
    public int minDeletionSize(String[] A) {
        int m = A[0].length();
        int n = A.length;
        String[] cur = new String[n];
        int res = 0;
        for (int i = 0; i < m; i++) {
            String[] cur2 = Arrays.copyOf(cur, n);
            for (int j = 0; j < n; j++) {
                char c = A[j].charAt(i);
                cur2[j] += String.valueOf(c);
            }
            if (isSorted(cur2)) {
                cur = cur2;
            } else {
                res++;
            }
        }
        return res;
    }

    private boolean isSorted(String[] ss) {
        for (int i = 1; i < ss.length; i++) {
            if (ss[i].compareTo(ss[i - 1]) < 0) {
                return false;
            }
        }
        return true;
    }
}
