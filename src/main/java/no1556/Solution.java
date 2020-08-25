/*
 * Copyright(c) 2020-2020
 * Author: xiaoweixiang
 */

package no1556;


class Solution {
    public String thousandSeparator(int n) {
        String s = String.valueOf(n);
        StringBuilder builder = new StringBuilder();
        int j = 0;
        for (int i = s.length() - 1; i >= 0; i--, j++) {
            if (j == 3) {
                builder.append(".");
                j = 0;
            }
            builder.append(s.charAt(i));
        }
        return builder.reverse().toString();
    }
}