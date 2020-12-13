/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.no249;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strings) {
            char[] array = s.toCharArray();
            int n = array[0] - 'a';
            for (int i = 0; i < array.length; i++) {
                if (array[i] - n < 'a') {
                    array[i] += (26 - n);
                } else {
                    array[i] -= n;
                }
            }
            StringBuilder builder = new StringBuilder();
            builder.append(array);
            String tmp = builder.toString();
            if (map.containsKey(tmp)) {
                List<String> list = map.get(tmp);
                list.add(s);
            } else {
                map.put(tmp, new ArrayList<>(Arrays.asList(s)));
            }
        }
        return new ArrayList<>(map.values());
    }
}
