/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No1078_Bigram分词;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] ss = text.split(" ");
        ArrayList<String> res = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>(Arrays.asList(ss));
        for (int i = 0; i < list.size() - 1; i++) {
            String s = list.get(i);
            String t = list.get(i + 1);
            if (s.equals(first) && t.equals(second)) {
                if (i + 2 < list.size()) {
                    res.add(list.get(i + 2));
                }
            }
        }
        String[] s = new String[res.size()];
        s = res.toArray(s);
        return s;
    }
}
