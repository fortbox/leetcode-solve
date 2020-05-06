/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No914_卡牌分组;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : deck) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int[] k = new int[map.size()];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            k[i++] = entry.getValue();
        }
        int min = Integer.MAX_VALUE;
        for (int i1 : k) {
            if (min > i1) min = i1;
        }
        if (k[0] < 2) return false;
        for (int a = 2; a <= min; a++) {
            for (int i1 = 0; i1 < k.length; i1++) {
                if (k[i1] % a != 0) break;
                if (i1 == k.length - 1) return true;
            }

        }
        return false;
    }
}
