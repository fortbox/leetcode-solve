/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1694;

class Solution {
    public String reformatNumber(String number) {
        StringBuilder builder = new StringBuilder();
        for (char c : number.toCharArray()) {
            if (c <= '9' && c >= '0') {
                builder.append(c);
            }
        }
        StringBuilder result = new StringBuilder();
        while (builder.length() > 4) {
            result.append(builder.substring(0, 3));
            builder.delete(0, 3);
            result.append("-");
        }
        if (builder.length() == 0) return result.substring(0, result.length() - 1);
        if (builder.length() == 2 || builder.length() == 3) return result.append(builder.toString()).toString();
        if (builder.length() == 4) {
            result.append(builder.substring(0, 2));
            builder.delete(0, 2);
            result.append("-");
            result.append(builder.substring(0, 2));
            builder.delete(0, 2);
            return result.toString();
        }
        return null;
    }
}
