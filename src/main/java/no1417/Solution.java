/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1417;

import java.util.ArrayList;

class Solution {
    public String reformat(String s) {
        ArrayList<Character> list0 = new ArrayList<>();
        ArrayList<Character> list1 = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) list0.add(c);
            if (Character.isLetter(c)) list1.add(c);
        }
        if (Math.abs(list0.size() - list1.size()) > 1) return "";
        int i = 0, j = 0;
        boolean f = list0.size() > list1.size();
        StringBuilder builder = new StringBuilder();
        while (i < list0.size() || j < list1.size()) {
            if (f) {
                if (i < list0.size()) {
                    builder.append(list0.get(i));
                    i++;
                }
                if (j < list1.size()) {
                    builder.append(list1.get(j));
                    j++;
                }
            } else {
                if (j < list1.size()) {
                    builder.append(list1.get(j));
                    j++;
                }
                if (i < list0.size()) {
                    builder.append(list0.get(i));
                    i++;
                }
            }
        }
        return builder.toString();
    }
}
