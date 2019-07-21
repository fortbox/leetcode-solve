package No720_词典中最长的单词;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        HashSet<String> set = new HashSet<>();

        int maxlen = 0;
        String maxstr = "";
        for (String s : words) {
            if (s.length() > 1) {
                String ss = s.substring(0, s.length() - 1);
                if (set.contains(ss)) {
                    if (maxlen < s.length()) {
                        maxlen = s.length();
                        maxstr = s;
                    } else if (maxlen == s.length()) {
                        if (maxstr.compareTo(s) > 0) {
                            maxstr = s;
                        }
                    }
                    set.add(s);
                }
            }
            if (s.length() == 1) {
                set.add(s);
                if (maxlen < s.length()) {
                    maxlen = s.length();
                    maxstr = s;
                } else if (maxlen == s.length()) {
                    if (maxstr.compareTo(s) > 0) {
                        maxstr = s;
                    }
                }
            }
        }
        return maxstr;

    }
}
