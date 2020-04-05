/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No709_转换成小写字母;

class Solution {
    public String toLowerCase(String str) {
        int k = 'A' - 'a';
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c - k);
            }
            builder.append(c);
        }
        return builder.toString();
    }
}
