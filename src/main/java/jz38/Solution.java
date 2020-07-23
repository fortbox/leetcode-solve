package jz38;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public static void main(String[] args) {
        String s="abc";
        String[] res = permutation(s);
        System.out.println(Arrays.toString(res));
    }
    public static String[] permutation(String s) {
        if (s == null || "".equals(s)) return new String[]{};
        HashMap<Integer, Set<String>> dp = new HashMap<>();
        dp.computeIfAbsent(1, k -> new HashSet<>()).add(s.substring(0, 1));
        for (int i = 2; i <= s.length(); i++) {
            Set<String> set = dp.get(i - 1);
            char c = s.charAt(i-1);
            HashSet<String> set1 = new HashSet<>();
            for (String s1 : set) {
                for (int j = 0; j <= s1.length(); j++) {
                    StringBuilder builder = new StringBuilder(s1);
                    builder.insert(j,c);
                    set1.add(builder.toString());
                }
            }
            System.out.println("set1 = " + set1);
            dp.putIfAbsent(i, set1);
        }
       return dp.get(s.length()).toArray(new String[0]);
    }
}