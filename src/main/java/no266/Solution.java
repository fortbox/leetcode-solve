/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no266;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static boolean canPermutePalindrome(final String s) {
        final HashMap<Character, Integer> map = new HashMap<>();
        final char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }
        boolean f = true;
        for (final Map.Entry<Character, Integer> entry : map.entrySet()) {
            final int n = entry.getValue();
            if (n % 2 == 1) {
                if (!f) {
                    return false;
                }
                f = false;
            }
        }
        return true;
    }
}