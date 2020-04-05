/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No884_两句话中的不常见单词;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        String[] a = A.split("\\s");
        String[] b = B.split("\\s");
        HashMap<String, Integer> mapa = new HashMap<>();
        HashMap<String, Integer> mapb = new HashMap<>();
        for (String s : a) {
            if (mapa.containsKey(s)) {
                mapa.put(s, mapa.get(s) + 1);
            } else {
                mapa.put(s, 1);
            }
        }
        for (String s : b) {
            if (mapb.containsKey(s)) {
                mapb.put(s, mapb.get(s) + 1);
            } else {
                mapb.put(s, 1);
            }
        }

        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            if (value == 1 && !mapb.containsKey(key)) {
                list.add(key);
            }
        }
        for (Map.Entry<String, Integer> entry : mapb.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            if (value == 1 && !mapa.containsKey(key)) {
                list.add(key);
            }
        }
        String [] ss=new String[list.size()];
        int i=0;
        for (String s : list) {
            ss[i++]=s;
        }
        return ss;
    }
}
