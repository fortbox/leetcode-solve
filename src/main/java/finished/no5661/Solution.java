/*
 * Copyright (c) 2021
 * Author: xiaoweixiang
 */

package finished.no5661;

class Solution {
    public String maximumTime(String time) {
        StringBuilder builder = new StringBuilder(time);
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == '?') {
                if (i == 0) {
                    if (builder.charAt(1) == '?') {
                        builder.setCharAt(i, '2');
                    } else if (time.charAt(1) < '4') {
                        builder.setCharAt(i, '2');
                    } else {
                        builder.setCharAt(i, '1');
                    }

                } else if (i == 1) {
                    if (builder.charAt(0) == '0') {
                        builder.setCharAt(i, '9');

                    } else if (builder.charAt(0) == '1') {
                        builder.setCharAt(i, '3');

                    } else {
                        builder.setCharAt(i, '9');
                    }
                } else if (i == 2) {
                    builder.setCharAt(i, '5');
                } else if (i == 3) {
                    builder.setCharAt(i, '9');
                }
            }
        }
        return builder.toString();
    }
}