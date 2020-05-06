/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no1196;

import java.util.Arrays;

class Solution {
    public int maxNumberOfApples(int[] arr) {
        Arrays.sort(arr);
        int ans = 0;
        int sum = 0;
        for (int i : arr) {
            sum += i;
            if (sum > 5000) {
                return ans;
            }
            ans++;
        }
        return ans;
    }
}
