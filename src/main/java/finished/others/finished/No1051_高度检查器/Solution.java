/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No1051_高度检查器;

import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] arr = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            arr[i] = heights[i];
        }

        Arrays.sort(heights);
        for (int i = 0; i < heights.length; i++) {
            if (arr[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
}
