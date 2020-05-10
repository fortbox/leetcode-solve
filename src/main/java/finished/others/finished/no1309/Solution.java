/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no1309;

class Solution {
    public String freqAlphabets(String s) {
        if (s == null || "".equals(s)) return "";
        int index = s.indexOf('#');
        String s1 = null;
        if (index != -1) {
            s1 = buildStr(s.substring(0, index));
            return s1 + freqAlphabets(s.substring(index + 1));
        } else {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                int ci = c - '1' + 'a';
                builder.append((char) ci);
            }
            s1 = builder.toString();
            return s1;
        }
    }

    private String buildStr(String s) {
        String s1 = s.substring(s.length() - 2);
        int n = Integer.parseInt(s1);
        int nn = 'a' + n - 1;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length() - 2; i++) {
            char c = s.charAt(i);
            int ci = c - '1' + 'a';
            builder.append((char) ci);
        }
        builder.append((char) nn);
        return builder.toString();
    }
}
