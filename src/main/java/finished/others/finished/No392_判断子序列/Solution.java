/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No392_判断子序列;


class Solution {
    /**
     * 记录t中s字符的位置
     *
     * @param s s
     * @param t t
     * @return boolean
     */
    public boolean isSubsequence(String s, String t) {
        if (s == null || "".equals(s)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        int k = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(k)) {
                k++;
                sb.append(t.charAt(i));
            }
            if (sb.toString().equals(s)) {
                return true;
            }
        }
        return false;

    }
}

