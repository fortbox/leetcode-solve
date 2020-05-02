/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.no299;

class Solution {
    public static void main(String[] args) {
        String secret = "1807";
        String guess = "7810";
        String hint = getHint(secret, guess);
        System.out.println("hint = " + hint);
    }

    public static String getHint(String secret, String guess) {
        char[] sa = secret.toCharArray();
        char[] ga = guess.toCharArray();
        int m = 0;
        int n = 0;
        String ss = "";
        String gs = "";
        for (int i = 0; i < sa.length; i++) {
            char a = sa[i];
            char b = ga[i];
            if (a == b) {
                m++;
            } else {
                ss += a;
                gs += b;
            }
        }
        for (int i = 0; i < ss.length(); i++) {
            char a = ss.charAt(i);
            int index = gs.indexOf(a);
            if (index != -1) {
                n++;
                String t1 = gs.substring(0, index);
                String t2 = gs.substring(index + 1);
                gs = t1 + t2;
            }
        }
        return m + "A" + n + "B";
    }
}
