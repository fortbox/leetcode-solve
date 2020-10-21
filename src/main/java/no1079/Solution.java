/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1079;

import java.util.HashSet;
import java.util.Set;

class Solution {
    int res = 0;
    int n;
    Set<String> set = new HashSet<>();

    public int numTilePossibilities(String tiles) {
        n = tiles.length();
        char[] array = tiles.toCharArray();
        StringBuilder builder = new StringBuilder();
        boolean[] isUsed = new boolean[n];
        backTrace(array, builder, isUsed, 0);
        return res - 1;
    }

    private void backTrace(char[] array, StringBuilder builder, boolean[] isUsed, int index) {
        if (!set.contains(builder.toString())) {
            set.add(builder.toString());
            res++;
        }
        if (index == n) return;
        for (int i = 0; i < array.length; i++) {
            if (!isUsed[i]) {
                isUsed[i] = true;
                builder.append(array[i]);
                backTrace(array, builder, isUsed, index + 1);
                isUsed[i] = false;
                builder.deleteCharAt(builder.length() - 1);
            }
        }
    }
}