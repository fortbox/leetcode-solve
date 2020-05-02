/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.no408;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    static Character[] chars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    static List<Character> list = new ArrayList<>(Arrays.asList(chars));

    public static void main(String[] args) {
        String word = "hi";
        String abbr = "2i";
        boolean b = validWordAbbreviation(word, abbr);
        System.out.println("b = " + b);
    }

    public static boolean validWordAbbreviation(String word, String abbr) {
        //System.out.println("word = " + word+", abbr = "+abbr);
        if ((word == null || "".equals(word)) && (abbr != null && !"".equals(abbr))) return false;
        if ((abbr == null || "".equals(abbr)) && (word != null && !"".equals(word))) return false;
        char[] array = abbr.toCharArray();
        String tmp = "";
        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            if (list.contains(c)) {
                tmp += c;
            } else {
                if (!"".equals(tmp)) {
                    return !tmp.startsWith("0") && validWordAbbreviation(word.substring(Integer.parseInt(tmp) + (i - tmp.length())), abbr.substring(i));
                } else {
                    if (c != word.charAt(i)) return false;
                    return validWordAbbreviation(word.substring(i + 1), abbr.substring(i + 1));
                }
            }
        }
        return "".equals(tmp) ? (word == null || "".equals(word)) : word.length() == Integer.parseInt(tmp) && tmp.length() == 1;
    }
}