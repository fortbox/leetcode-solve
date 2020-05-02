/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no293;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generatePossibleNextMoves(String s) {
        ArrayList<String> list = new ArrayList<>();
        char[] array = s.toCharArray();
        for (int i = 1; i < array.length; i++) {
            char a = array[i - 1];
            char b = array[i];
            if (a == '+' && b == '+') {
                StringBuilder builder = new StringBuilder(s);
                builder.setCharAt(i - 1, '-');
                builder.setCharAt(i, '-');
                list.add(builder.toString());
            }
        }
        return list;
    }
}
