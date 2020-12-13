/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.no930;

import java.util.HashMap;

class Solution {
    public int numSubarraysWithSum(int[] A, int S) {
        int ans = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            if (map.containsKey(sum - S)) {
                ans += map.get(sum - S);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }
        return ans;
    }
}