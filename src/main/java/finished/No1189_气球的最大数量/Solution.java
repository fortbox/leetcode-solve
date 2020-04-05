/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No1189_气球的最大数量;

class Solution {
    public int maxNumberOfBalloons(String text) {
        //balloon
        int a = 0;
        int b = 0;
        int l = 0;
        int o = 0;
        int n = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case 'a':
                    a++;
                    break;
                case 'b':
                    b++;
                    break;
                case 'l':
                    l++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'n':
                    n++;
                    break;
                default:
                    break;
            }
        }
        int res = 0;
        while (a >= 1 && b >= 1 && l >= 2 && o >= 2 && n >= 1) {
            res++;
            a -= 1;
            b -= 1;
            l -= 2;
            o -= 2;
            n -= 1;
        }
        return res;
    }
}