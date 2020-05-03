/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.no734;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public boolean areSentencesSimilar(String[] words1, String[] words2, List<List<String>> pairs) {
        if (words1.length != words2.length) return false;
        Map<String, List<String>> map = getPair(pairs);
        for (int i = 0; i < words1.length; i++) {
            if (words1[i].equals(words2[i])) continue;
            String s1 = words1[i];
            String s2 = words2[i];
            List<String> list = map.getOrDefault(s1, new ArrayList<>());
            boolean b = list.stream().anyMatch(s -> s.equals(s2));
            if (!b) return false;
        }
        return true;
    }

    private Map<String, List<String>> getPair(List<List<String>> pairs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (List<String> pair : pairs) {
            String key = pair.get(0);
            String value = pair.get(1);
            List<String> l1 = map.getOrDefault(key, new ArrayList<>());
            List<String> l2 = map.getOrDefault(value, new ArrayList<>());
            l1.add(value);
            l2.add(key);
            map.put(key, l1);
            map.put(value, l2);
        }
        return map;
    }
}