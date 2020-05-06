/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.No953_验证外星语词典;

class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        //遍历比较
        for (int i = 1; i < words.length; i++) {
            if (!judgeWord(words[i - 1], words[i], order)) return false;
        }
        return true;

    }

    private boolean judgeWord(String s1, String s2, String order) {
        int i = 0;
        while (i < s1.length() && i < s2.length()) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            int n1 = order.indexOf(c1);
            int n2 = order.indexOf(c2);
            if (n1 < n2) return true;
            if (n1 > n2) return false;
            i++;
        }
        return i != s2.length();
    }
}
