/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.程序员面试宝典.cxy1715;

import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public static void main(String[] args) {
        String[] words = {"cat", "banana", "dog", "nana", "walk", "walker", "dogwalker"};
        String res = longestWord(words);
        System.out.println("res = " + res);
    }

    public static String longestWord(String[] words) {
        HashSet<String> set = new HashSet<>(Arrays.asList(words));
        words = set.toArray(new String[0]);
        Arrays.sort(words, (o1, o2) -> o1.length() == o2.length() ? o1.compareTo(o2) : o2.length() - o1.length());
        for (int i = 0; i < words.length; i++) {
            if (canBuild(words[i], words, i + 1)) {
                return words[i];
            }
        }
        return "";
    }

    private static boolean canBuild(String word, String[] words, int i) {
        if (word == null || "".equals(word)) return true;
        for (int j = i; j < words.length; j++) {
            if (word.startsWith(words[j])) {
                boolean can = canBuild(word.substring(words[j].length()), words, i);
                if (can) return true;
            }
        }
        return false;
    }
}
