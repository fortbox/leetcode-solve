/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no1163;

public class Solution {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String s = "cacac";
        String result = lastSubstring(s);
        long end = System.currentTimeMillis();
        System.out.println("(end-start) = " + (end - start));
        System.out.println("result = " + result);
    }

    /**
     * 减少substring就行
     *
     * @param s
     * @return
     */
    public static String lastSubstring(String s) {
        int st = 0;
        int len = s.length();
        for (int i = 1; i < len; i++) {
            int sz = 0;
            while (i + sz < len && s.charAt(st + sz) == s.charAt(i + sz)) {
                sz++;
            }
            System.out.println("i = " + i);
            System.out.println("sz = " + sz);
            if (i + sz == len) {
                break;
            }
            if (s.charAt(i + sz) > s.charAt(st + sz)) {
                st = i;
            }

        }
        return s.substring(st);
    }
}
