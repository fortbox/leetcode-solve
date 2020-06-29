/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package cxy1002;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        String[] strs = {"", ""};
        List<List<String>> ans = groupAnagrams(strs);
        System.out.println("ans = " + ans);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<String> list = new ArrayList<>(Arrays.asList(strs));
        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());
        List<List<String>> res = new ArrayList<>();
        List<String> isVisited = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println("s = " + s);
            if (isVisited.contains(s)) continue;
            ArrayList<String> set = new ArrayList<>();
            set.add(s);
            isVisited.add(s);
            for (int j = i + 1; j < list.size(); j++) {
                String s1 = list.get(j);
                if (isSimpleEqual(s, s1)) {
                    set.add(s1);
                    isVisited.add(s1);
                }
            }
            System.out.println("set = " + set);
            res.add(new ArrayList<>(set));
        }
        return res;
    }

    private static boolean isSimpleEqual(String s, String s1) {
        if (s.length() != s1.length()) return false;
        char[] chars = s.toCharArray();
        char[] chars1 = s1.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);
        return Arrays.equals(chars, chars1);
    }
}