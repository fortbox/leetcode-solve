/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.程序员面试宝典.cxy1606;

import java.util.TreeSet;

class Solution {
    public int smallestDifference(int[] a, int[] b) {
        TreeSet<Long> set = new TreeSet<>(Long::compareTo);
        for (int i : b) {
            set.add((long) i);
        }
        int minval = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            Long ceiling = set.ceiling((long) a[i]) == null ? Long.MAX_VALUE : set.ceiling((long) a[i]);
            Long floor = set.floor((long) a[i]) == null ? Long.MAX_VALUE : set.floor((long) a[i]);
            minval = (int) Math.min(minval, Math.min(Math.abs(ceiling - a[i]), Math.abs(floor - a[i])));
        }
        return minval;
    }
}