/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no243;

import java.util.ArrayList;

class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            if (s.equals(word1)) l1.add(i);
            if (s.equals(word2)) l2.add(i);
        }
        int distance = Integer.MAX_VALUE;
        for (int i = 0; i < l1.size(); i++) {
            for (int j = 0; j < l2.size(); j++) {
                distance = Math.min(distance, Math.abs(l1.get(i).intValue() - l2.get(j).intValue()));
            }
        }
        return distance;
    }
}
