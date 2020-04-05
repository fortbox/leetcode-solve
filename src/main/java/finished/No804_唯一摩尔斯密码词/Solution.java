/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No804_唯一摩尔斯密码词;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] code = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--" +
                ".", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> set = new HashSet<>();
        for (String word : words) {
            String s = "";
            for (int i = 0; i < word.length(); i++) {
                s += code[word.charAt(i) - 'a'];
            }
            set.add(s);
        }
        return set.size();
    }
}
