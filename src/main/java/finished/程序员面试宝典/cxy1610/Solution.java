/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.程序员面试宝典.cxy1610;

import java.util.Arrays;

class Solution {
    public int maxAliveYear(int[] birth, int[] death) {
        int begin = Arrays.stream(birth).min().getAsInt();
        int end = Arrays.stream(death).max().getAsInt();

        int n = end - begin;
        int[] diff = new int[n + 1];
        for (int i = 0; i < birth.length; i++) {
            for (int j = birth[i] - begin; j <= death[i] - begin; j++) {
                diff[j]++;
            }
        }
        int maxdiff = -1;
        int index = -1;
        for (int i = 0; i < diff.length; i++) {
            if (diff[i] > maxdiff) {
                maxdiff = diff[i];
                index = i;
            }
        }
        return index + begin;
    }
}