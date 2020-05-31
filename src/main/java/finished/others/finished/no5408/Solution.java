/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no5408;

import java.util.Arrays;

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        return Arrays.equals(target, arr);
    }
}