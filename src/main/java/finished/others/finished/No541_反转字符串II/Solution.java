/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No541_反转字符串II;

public class Solution {
    public static void main(String[] args) {

        String s = "abcdefg";
        int k = 2;
        String ss = reverseStr(s, k);
        System.out.println("ss = " + ss);

    }

    public static String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int n = s.length();
        boolean f = true;
        while (i < n) {
            StringBuilder sb1 = new StringBuilder();
            if (i + k < n) {
                sb1.append(s.substring(i, i + k));

            } else {
                sb1.append(s.substring(i));
            }
            if (f) {
                sb1 = sb1.reverse();
            }
            sb.append(sb1.toString());
            f = f ? false : true;
            i += k;
        }
        return sb.toString();
    }
}
