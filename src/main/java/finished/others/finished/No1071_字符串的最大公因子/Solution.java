/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No1071_字符串的最大公因子;

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String a = str1.length() > str2.length() ? str2 : str1;
        String b = str1.length() > str2.length() ? str1 : str2;
        int k = b.indexOf(a);
        if (k < 0) {
            return "";
        }

        for (int i = 0; i < a.length(); i++) {
            String res = a.substring(i);
            while (res.length() < a.length()) {
                res += a.substring(i);
            }
            if (res.equals(a)) {
                while (res.length() < b.length()) {
                    res += a.substring(i);
                }
                if (res.equals(b)) {
                    return a.substring(i);
                }
            }
        }
        return "";
    }
}
