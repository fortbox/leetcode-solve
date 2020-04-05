/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No917_仅仅反转字母;

class Solution {
    public String reverseOnlyLetters(String S) {
        String s = S;
        char[] ca = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            char b = s.charAt(i);
            char e = s.charAt(j);
            if ((b >= 'a' && b <= 'z') || (b >= 'A' && b <= 'Z')) {
                if ((e >= 'a' && e <= 'z') || (e >= 'A' && e <= 'Z')) {
                    ca[i] = e;
                    ca[j] = b;
                    i++;
                    j--;
                } else {
                    j--;
                }
            } else {
                if ((e >= 'a' && e <= 'z') || (e >= 'A' && e <= 'Z')) {
                    i++;
                } else {
                    i++;
                    j--;
                }
            }
        }
        return String.valueOf(ca);
    }
}
