/*
 * Copyright (c) 2019
 * @Author:henry.xiao.cn@outlook.com
 */

package dp.finished.No10_正则表达式匹配;

public class Solution {
    public boolean isMatch(String s, String p) {
        if (p.isEmpty()) {
            return s.isEmpty();
        }
        boolean first_match = (!s.isEmpty() && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.'));
        if (p.length() >= 2 && p.charAt(1) == '*') {
            return isMatch(s, p.substring(2)) || (first_match && isMatch(s.substring(1), p));

        } else {
            return first_match && isMatch(s.substring(1), p.substring(1));
        }
    }
}
