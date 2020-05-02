/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no422;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("abcd", "bnrt", "crm", "dt");
        boolean b = validWordSquare(words);
        System.out.println("b = " + b);
    }

    public static boolean validWordSquare(List<String> words) {
        ArrayList<String> list = new ArrayList<>();
        words.forEach(s -> System.out.println("s = " + s));
        int size = words.size();
        int index = 0;
        while (index < size) {
            StringBuilder t = new StringBuilder();
            for (String word : words) {
                if (word.length() > index) {
                    t.append(word.charAt(index));
                } else {
                    break;
                }
            }
            list.add(t.toString());
            index++;
        }
        list.forEach(s -> System.out.println("s = " + s));
        for (int i = 0; i < words.size(); i++) {
            if (!words.get(i).equals(list.get(i))) return false;
        }
        return true;
    }
}