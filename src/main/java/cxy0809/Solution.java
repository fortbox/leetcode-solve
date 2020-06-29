/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package cxy0809;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 3;
        List<String> ans = solution.generateParenthesis(n);
        System.out.println("ans = " + ans);
    }

    public List<String> generateParenthesis(int n) {
        if (n == 0) return Arrays.asList("");
        List<String> list = generateParenthesis(n - 1);
        HashSet<String> set = new HashSet<>();
        for (String s : list) {
            for (int i = 0; i <= s.length(); i++) {
                String t = s.substring(0, i) + "(" + s.substring(i);
                int index = i;
                for (int j = index; j < t.length(); j++) {
                    String tmp = t.substring(0, index + 1) + ")" + t.substring(index + 1);
                    set.add(tmp);
                }
                System.out.println("s = " + s);
                System.out.println("set = " + set.toString());
            }
        }
        return new ArrayList<>(set);
    }
}
