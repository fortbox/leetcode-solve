/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no1332;

class Solution {
    public static void main(String[] args) {
        String s = "abb";
        int res = removePalindromeSub(s);
        System.out.println("res = " + res);
    }

    public static int removePalindromeSub(String s) {
        if (s.length() == 0) return 0;
        StringBuilder builder = new StringBuilder(s);
        if (s.equals(builder.reverse().toString())) return 1;
        return 2;
    }
}
