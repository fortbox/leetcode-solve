/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.程序员面试宝典.cxy1705;

import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public String[] findLongestSubarray(String[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = -1;
        int sum = 0;
        int len = 0;
        map.put(0, -1);
        for (int i = 0; i < array.length; i++) {
            String s = array[i];
            char c = s.charAt(0);
            if (Character.isDigit(c)) {
                sum--;
            } else {
                sum++;
            }
            if (!map.containsKey(sum)) map.put(sum, i);
            else {
                int l = map.get(sum);
                if (i - l > len) {
                    left = l;
                    len = i - l;
                }
            }
        }
        return Arrays.copyOfRange(array, left + 1, left + len);

    }
}