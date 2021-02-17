/*
 * Copyright (c) 2021
 * Author: xiaoweixiang
 */

package finished.no451;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public String frequencySort(String s) {
        PriorityQueue<Demo> queue = new PriorityQueue<>((o1, o2) -> o2.value - o1.value);
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            queue.add(new Demo(entry.getKey(), entry.getValue()));
        }
        StringBuilder ans = new StringBuilder();
        while (queue.size() > 0) {
            Demo demo = queue.poll();
//            String tmp="";
            for (int i = 0; i < demo.value; i++) {
                ans.append(demo.c);
            }
        }
        return ans.toString();
    }

    class Demo {
        char c;
        int value;

        public Demo(char c, int value) {
            this.c = c;
            this.value = value;
        }
    }


}