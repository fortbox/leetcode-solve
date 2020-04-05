/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No696_计数二进制子串;

class Solution {
    public int countBinarySubstrings(String s) {
        char[] ca = s.toCharArray();
        int[] a = new int[ca.length];
        int j = 0;
        for (int i = 1; i < ca.length; i++) {
            if (ca[i] == ca[i - 1]) {
                a[j]++;
            } else {
                j++;
            }
        }
        for (int i = 0; i <= j; i++) {
            a[i]+=1;
        }

        int result = 0;
        for (int i = 0; i <= j - 1; i++) {
            result += Math.min(a[i], a[i + 1]);
        }
        return result;
    }
}