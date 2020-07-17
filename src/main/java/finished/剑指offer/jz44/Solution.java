/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.剑指offer.jz44;

class Solution {
    public static int findNthDigit(int n) {
        if (n < 10) return n;
        int i = 1;
        while (n > 0) {
            System.out.println("befort n = " + n);
            n -= 9 * (int) Math.pow(10, i - 1);
            System.out.println("after n = " + n);
            i++;
        }
        n += 9 * (int) Math.pow(10, i - 2);
        System.out.println("n1 = " + n);
        int len = i - 1;
        System.out.println("len = " + len);
        System.out.println("n%len = " + n % len);
        int index = n / len;
        int k = n % len;
        System.out.println("k = " + k);
        int base = (int) Math.pow(10, len - 1);
        System.out.println("base = " + base);
        int num = 0;
        if (index > 0) {
            num = base + index - 1;
        } else {
            num = base;
        }
        System.out.println("num = " + num);
        String s = String.valueOf(num);
        if (k == 0) return s.charAt(s.length() - 1) - '0';
        else return s.charAt(k - 1) - '0';
    }

    public static void main(String[] args) {
        int n = 10;
        int res = findNthDigit(n);
        System.out.println("res = " + res);
    }
}
