/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.no49;

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            boolean f = false;
            String tmp = s;
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                if (canEqual(s, entry.getKey())) {
                    tmp = entry.getKey();
                    f = true;
                }
            }
            if (f) {
                List<String> list = map.get(tmp);
                list.add(s);
            } else {
                map.put(s, new ArrayList<>(Arrays.asList(s)));
            }
        }
        List<List<String>> res = new ArrayList<>();
        res.addAll(map.values());
        return res;
    }

    private boolean canEqual(String s, String key) {
        if (s.length() != key.length()) return false;
        char[] c1 = s.toCharArray();
        char[] c2 = key.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
    }
}
