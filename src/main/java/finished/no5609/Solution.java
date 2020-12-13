/*
 * Copyright(c) 2020-2020
 * Author: xiaoweixiang
 */

package finished.no5609;

class Solution {
    String s = null;

    public int countConsistentStrings(String allowed, String[] words) {
        s = allowed;
        int ans = 0;
        for (String word : words) {
            if (match(word)) ans++;
        }
        return ans;
    }

    private boolean match(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (s.indexOf(word.charAt(i)) == -1) return false;
        }
        return true;
    }
}