/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package greedy.finished.No1247_交换字符使得字符串相同;

public class Solution {
    public int minimumSwap(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int x = 0;
        int y = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (s1.charAt(i) == 'x') {
                    sb.append('x');
                    x++;
                } else {
                    sb.append('y');
                    y++;
                }
            }
        }
        int res = x / 2 + y / 2;
        if ((x + y) % 2 != 0) return -1;
        if (x % 2 != 0) {
            res++;
        }
        if (y % 2 != 0) {
            res++;
        }
        return res;
    }
}
