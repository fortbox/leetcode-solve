/*
 * Copyright (c) 2021
 * Author: xiaoweixiang
 */

package finished.tree.finished.no1638;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "aba";
        String t = "baba";
        int ans = solution.countSubstrings(s, t);
        System.out.println("ans = " + ans);
    }

    public int countSubstrings(String s, String t) {
        // 找到不一样的，然后向外扩散
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) != t.charAt(j)) {
                    int left = 1;
                    int right = 1;
                    while (i + right < s.length() && j + right < t.length() && s.charAt(i + right) == t.charAt(j + right)) {
                        right++;
                    }
                    while (i - left >= 0 && j - left >= 0 && s.charAt(i - left) == t.charAt(j - left)) {
                        left++;
                    }
                    res += left * right;
                }
            }
        }
        return res;
    }
}