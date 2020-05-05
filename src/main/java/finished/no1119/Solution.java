/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.no1119;

import java.util.Arrays;
import java.util.List;

class Solution {
    public String removeVowels(String S) {
        StringBuilder builder = new StringBuilder();
        List<Character> list = Arrays.asList('a', 'e', 'i', 'o', 'u');
        for (int i = 0; i < S.length(); i++) {
            if (!list.contains(S.charAt(i))) builder.append(S.charAt(i));
        }
        return builder.toString();
    }
}
