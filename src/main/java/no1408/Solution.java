/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1408;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<String> stringMatching(String[] words) {
//        Arrays.sort(words,(Comparator.comparingInt(String::length)));
        List<String> list = new ArrayList<>();
        for (String word : words) {
            if (Arrays.stream(words).filter(s -> (!word.equals(s) && s.contains(word))).count() > 0) list.add(word);
        }
        return list;


    }
}
