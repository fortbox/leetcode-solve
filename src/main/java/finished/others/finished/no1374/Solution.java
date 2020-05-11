/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no1374;

class Solution {
    public String generateTheString(int n) {
        StringBuilder builder = new StringBuilder();
        if (n % 2 == 0) {
            for (int i = 0; i < n - 1; i++) {
                builder.append('a');
            }
            builder.append('b');
        } else {
            int k = n - 1;
            for (int i = 0; i < n - 1; i++) {
                builder.append('a');
            }
            builder.append('b');
            builder.append('c');
        }
        return builder.toString();
    }
}
