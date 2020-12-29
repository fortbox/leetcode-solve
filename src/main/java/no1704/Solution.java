/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1704;

class Solution {
    String ss = "aeiouAEIOU";

    public boolean halvesAreAlike(String s) {
        int length = s.length();
        String s1 = s.substring(0, length / 2);
        String s2 = s.substring(length / 2);
        int count1 = getCount(s1);
        int count2 = getCount(s2);
        return count1 == count2;
    }

    private int getCount(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (ss.contains(String.valueOf(c))) count++;
        }
        return count;
    }
}