/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package greedy.finished.No984_不含AAA或BBB的字符串;

public class Solution {
    public String strWithout3a3b(int A, int B) {
        StringBuilder sb = new StringBuilder();
        if (A <= 2 && B <= 2) {
            while (A > 0) {
                A--;
                sb.append("a");
            }
            while (B > 0) {
                B--;
                sb.append("b");
            }
            return sb.toString();
        }
        boolean b = A > B;
        int temp = 0;
        if (A < B) {
            temp = B;
            B = A;
            A = temp;
        }
        while (A > 0) {
            if (A >= 2 && B > 0) {
                sb.append("aab");
                A -= 2;
                B--;
            } else if (A == 1) {
                sb.append("a");
                A = 0;
            } else if (A >= 2 && B == 0) {
                sb.append("aa");
                A -= 2;
            }
        }
        String tt = sb.toString();
        String res = "";
        for (int i = 0; i < tt.length(); i++) {
            res += tt.charAt(i);
            if (B > 2 && tt.charAt(i) == 'b') {
                res += 'b';
                B--;
            }
        }
        while (B > 0) {
            res += 'b';
            B--;
        }
        if (!b) {
            res = res.replace('a', 'c');
            res = res.replace('b', 'a');
            res = res.replace('c', 'b');

        }
        return res;
    }
}
