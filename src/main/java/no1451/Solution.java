/*
 * Copyright(c) 2020-2020
 * Author: xiaoweixiang
 */

package no1451;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String text = "Leetcode is cool";
        String res = solution.arrangeWords(text);
        System.out.println("res = " + res);
    }

    public String arrangeWords(String text) {
        String[] arr = text.split(" ");
        Arrays.sort(arr, Comparator.comparingInt(String::length));
        StringBuilder builder = new StringBuilder();
        for (String s : arr) {
            builder.append(s.toLowerCase()).append(" ");
        }
        builder.setCharAt(0, Character.toUpperCase(builder.charAt(0)));
        return builder.toString().trim();
    }
}