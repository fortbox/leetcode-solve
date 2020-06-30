/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package cxy1620;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<String> getValidT9Words(String num, String[] words) {
        int[] key = {2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9};
        System.out.println("key.length = " + key.length);
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();
        for (String s : words) {
            StringBuilder builder = new StringBuilder();
            char[] array = s.toCharArray();
            for (char c : array) {
                builder.append(key[c - 'a']);
            }
            map.put(s, builder.toString());
        }
        ArrayList<String> res = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key1 = entry.getKey();
            String value = entry.getValue();
            if (value.equals(num)) res.add(key1);
        }
        return res;
    }
}
