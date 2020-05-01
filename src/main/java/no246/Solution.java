/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package no246;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String num = "101";
        boolean flag = solution.isStrobogrammatic(num);
        System.out.println("flag = " + flag);
    }

    public boolean isStrobogrammatic(String num) {
        // 0,8,6,9，只有這幾個數可以翻轉
        int len = num.length();
        if (len == 1) return num.charAt(0) == '1' || num.charAt(0) == '8' || num.charAt(0) == '0';
        boolean canEven = true;
        if (len % 2 == 1) {
            canEven = false;
            int k = len / 2;
            if (num.charAt(k) != '8' && num.charAt(k) != '0' && num.charAt(k) != '1') {
                return false;
            }
        }
        int k, m;
        if (canEven) {
            k = len / 2 - 1;
            m = len / 2;
        } else {
            k = len / 2 - 1;
            m = len / 2 + 1;
        }
        while (k >= 0 && m < len) {
            char a = num.charAt(k);
            System.out.println("k = " + k);
            System.out.println("a = " + a);
            char b = num.charAt(m);
            System.out.println("m = " + m);
            System.out.println("b = " + b);
            if (a == '0') {
                if (b != '0') return false;
            } else if (a == '8') {
                if (b != '8') return false;
            } else if (a == '6') {
                if (b != '9') return false;
            } else if (a == '1') {
                if (b != '1') return false;
            } else if (a == '9') {
                if (b != '6') return false;
            } else {
                return false;
            }
            k--;
            m++;
        }

        return true;
    }
}
